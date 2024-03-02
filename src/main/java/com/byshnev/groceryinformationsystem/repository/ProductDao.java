package com.byshnev.groceryinformationsystem.repository;

import com.byshnev.groceryinformationsystem.model.Product;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Data
public class ProductDao {
	private List<Product> products = new ArrayList<>();

	public List<Product> findAllProducts() {
		return products;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public Product findProduct(String productName) {
		return products.stream()
				.filter(name->name.equals(productName))
				.findFirst()
				.orElse(null);
	}

	public void deleteProduct(String name) {

	}


}
