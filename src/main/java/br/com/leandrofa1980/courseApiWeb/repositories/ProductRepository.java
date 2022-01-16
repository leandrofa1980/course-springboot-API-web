package br.com.leandrofa1980.courseApiWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leandrofa1980.courseApiWeb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
