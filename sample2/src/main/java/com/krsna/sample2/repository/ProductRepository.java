package com.krsna.sample2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.krsna.sample2.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
