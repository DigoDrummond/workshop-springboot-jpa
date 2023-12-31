package com.rodrigoDrummond.WebServiceSpringJPA.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rodrigoDrummond.WebServiceSpringJPA.entities.User;
import com.rodrigoDrummond.WebServiceSpringJPA.repositories.UserRepository;
import com.rodrigoDrummond.WebServiceSpringJPA.services.exceptions.DatabaseException;
import com.rodrigoDrummond.WebServiceSpringJPA.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}
	public User findById(Long id) {
		//findById vai no banco de dados e traz objeto
		Optional<User> obj = repository.findById(id);
		//retorna objeto do tipo user que esta dentro do optional
		//orElseThrow tenta get, se não tiver usuário lança excessão entre parênteses
		return obj.orElseThrow(()-> new ResourceNotFoundException(id));
	}
	//retorna usuario salvo
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			//caso usuário a ser deletado não seja encontrado
			throw new ResourceNotFoundException(id);
		}catch(DataIntegrityViolationException e) {
			// caso usuário a ser deletado tenha outros objetos ligados a ele
			throw new DatabaseException(e.getMessage());
		}
		
	}
	//parametros-> id do usuário que será atuaizado e obj com dados a serem atualizados
	public User update(Long id, User obj) {
		//getReferenceById so instancia obj, não vai no banco de dados
		try {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}
	//método não deixa atualizar nem id nem senha
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
