package com.rodrigoDrummond.WebServiceSpringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoDrummond.WebServiceSpringJPA.entities.User;

//interface que herda métodos da interface JPARepository
//<tipo da entidade, tipo atributo chave>

public interface UserRepository extends JpaRepository<User, Long> {

}
