package com.gmail.woosay333.springbootdemo.repository;

import com.gmail.woosay333.springbootdemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
