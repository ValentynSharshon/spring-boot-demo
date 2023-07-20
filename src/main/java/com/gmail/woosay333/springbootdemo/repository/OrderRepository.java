package com.gmail.woosay333.springbootdemo.repository;

import com.gmail.woosay333.springbootdemo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
