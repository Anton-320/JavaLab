package com.byshnev.groceryinformationsystem.service.impl;

import com.byshnev.groceryinformationsystem.model.Product;
import com.byshnev.groceryinformationsystem.repository.ProductDao;
import com.byshnev.groceryinformationsystem.service.ProductService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
	@NonNull
	private ProductDao repository;

	@Override
	public List<Product> findAllProducts() {
		return repository.findAllProducts();
	}

	@Override
	public void addProduct(Product product) {
		repository.addProduct(product);
	}

	@Override
	public Product findProduct(String name) {
		return repository.findProduct(name);
	}

	@Override
	public void deleteProduct(String name) {
		repository.deleteProduct(name);
	}
}
