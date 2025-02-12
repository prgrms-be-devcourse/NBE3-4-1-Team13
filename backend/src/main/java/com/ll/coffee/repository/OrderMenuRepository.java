package com.ll.coffee.repository;

import com.ll.coffee.OrderMenu.OrderMenu;
import com.ll.coffee.OrderMenu.OrderMenuId;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author seeyeon
 * @since 25. 1. 15
 */
public interface OrderMenuRepository extends JpaRepository<OrderMenu, OrderMenuId> {


    List<OrderMenu> findByOrderId(Long id);
}
