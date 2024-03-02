package com.byshnev.groceryinformationsystem.service;

import com.byshnev.groceryinformationsystem.model.Product;

import java.util.List;

public interface ProductService {

	public List<Product> findAllProducts();
	public void addProduct(Product product);
	public Product findProduct(String name);
	public void deleteProduct(String name);

}
