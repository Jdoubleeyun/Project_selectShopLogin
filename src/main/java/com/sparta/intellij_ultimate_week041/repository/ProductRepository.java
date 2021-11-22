package com.sparta.intellij_ultimate_week041.repository;

import com.sparta.intellij_ultimate_week041.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByUserId(Long userId);
}