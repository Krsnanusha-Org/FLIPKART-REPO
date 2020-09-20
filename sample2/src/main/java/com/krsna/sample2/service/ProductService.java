package com.krsna.sample2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.krsna.sample2.model.Product;

@Service
public class ProductService {
	
	public List<Product> listAll(){
		
		List<Product> products = new ArrayList<>();
		
		Product p1 = new Product();
		long id = 1;
		p1.setId(id);
		p1.setBrand("Sony");
		p1.setMadein("Korea");
		p1.setName("xperia");
		p1.setPrice(1000.0f);
		
		
		
		products.add(p1);
		return products;
	}

	public void save(Product product){
		
	}

	public Product get(long id){
		return null;
	} 

	public void delete(long id){
		
	} 



}
