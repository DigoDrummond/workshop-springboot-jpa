package com.rodrigoDrummond.WebServiceSpringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoDrummond.WebServiceSpringJPA.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
