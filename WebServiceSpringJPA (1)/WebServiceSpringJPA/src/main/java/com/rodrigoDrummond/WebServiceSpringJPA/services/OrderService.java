package com.rodrigoDrummond.WebServiceSpringJPA.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigoDrummond.WebServiceSpringJPA.entities.Order;
import com.rodrigoDrummond.WebServiceSpringJPA.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		//retorna objeto do tipo user que esta dentro do optional
		return obj.get();
	}
}
