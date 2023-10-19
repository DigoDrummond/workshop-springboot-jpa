package com.rodrigoDrummond.WebServiceSpringJPA.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigoDrummond.WebServiceSpringJPA.entities.User;
import com.rodrigoDrummond.WebServiceSpringJPA.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		//retorna objeto do tipo user que esta dentro do optional
		return obj.get();
	}
	//retorna usuario salvo
	public User insert(User obj) {
		return repository.save(obj);
	}
}
