package com.krsna.sample2.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Product {
	
	private Long id;
	private String name;
	private String brand;
	private String madein;
	private float price;
	

}
