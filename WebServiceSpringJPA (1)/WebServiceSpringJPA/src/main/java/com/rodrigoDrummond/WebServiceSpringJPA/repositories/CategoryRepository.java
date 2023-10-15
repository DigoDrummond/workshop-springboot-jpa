package com.rodrigoDrummond.WebServiceSpringJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoDrummond.WebServiceSpringJPA.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
