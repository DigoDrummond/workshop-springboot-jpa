package com.rodrigoDrummond.WebServiceSpringJPA.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigoDrummond.WebServiceSpringJPA.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	// endpoint para acessar usuários
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Pedro", "pedro@gmail.com", "999999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
