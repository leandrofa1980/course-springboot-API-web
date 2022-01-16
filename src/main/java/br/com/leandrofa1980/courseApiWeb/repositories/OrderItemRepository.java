package br.com.leandrofa1980.courseApiWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leandrofa1980.courseApiWeb.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
