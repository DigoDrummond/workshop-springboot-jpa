package com.rodrigoDrummond.WebServiceSpringJPA.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigoDrummond.WebServiceSpringJPA.entities.Product;
import com.rodrigoDrummond.WebServiceSpringJPA.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		// retorna objeto do tipo user que esta dentro do optional
		return obj.get();
	}
}
