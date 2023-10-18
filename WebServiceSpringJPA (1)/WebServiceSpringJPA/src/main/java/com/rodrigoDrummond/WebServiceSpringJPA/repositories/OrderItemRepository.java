package com.rodrigoDrummond.WebServiceSpringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoDrummond.WebServiceSpringJPA.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
