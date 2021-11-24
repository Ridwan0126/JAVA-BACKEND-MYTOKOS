package com.repository;

import com.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(String name);
    Product findByIdAndIsDeleted(Long id, Integer isDeleted);
    List<Product> findByIsDeleted(Integer isDeleted);
}
