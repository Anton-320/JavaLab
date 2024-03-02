package com.byshnev.groceryinformationsystem.controller;

import com.byshnev.groceryinformationsystem.model.Product;
import com.byshnev.groceryinformationsystem.model.typesOfProducts.PieceProduct;
import com.byshnev.groceryinformationsystem.model.typesOfProducts.ProductByWeight;
import com.byshnev.groceryinformationsystem.service.impl.ProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/prod")
@AllArgsConstructor
public class ProductController {

	private ProductServiceImpl service;

	@GetMapping("/all")
	public List<Product> findAllProducts() {
		return service.findAllProducts();
	}

	@PostMapping("/byWeight")
	public void addProductByWeight(ProductByWeight product) {
		service.addProductByWeight(product);
	}

	@PostMapping("/piece")
	public void addPieceProduct(PieceProduct product) {
		service.addPieceProduct(product);
	}

	@GetMapping
	public Product findProduct(@RequestParam String name) {
		return service.findProduct(name);
	}

	@DeleteMapping
	public void deleteProduct(String name) {
		service.deleteProduct(name);
	}
}
