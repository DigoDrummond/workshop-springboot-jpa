package com.rodrigoDrummond.WebServiceSpringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoDrummond.WebServiceSpringJPA.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
