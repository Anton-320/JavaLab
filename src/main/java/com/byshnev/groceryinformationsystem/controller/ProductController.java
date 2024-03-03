package com.byshnev.groceryinformationsystem.controller;

import com.byshnev.groceryinformationsystem.model.Product;
import com.byshnev.groceryinformationsystem.model.typesofproducts.PieceProduct;
import com.byshnev.groceryinformationsystem.model.typesofproducts.ProductByWeight;
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

	@GetMapping
	public Product findProduct(@RequestParam String name) {
		return service.findProduct(name);
	}

	@PostMapping("/byWeight")
	public void addProductByWeight(ProductByWeight product) {
		service.addProductByWeight(product);
	}

	@PostMapping("/piece")
	public void addPieceProduct(PieceProduct product) {
		service.addPieceProduct(product);
	}

	@DeleteMapping
	public void deleteProduct(String name) {
		service.deleteProduct(name);
	}
}
