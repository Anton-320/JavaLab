package com.byshnev.groceryinformationsystem.controller;

import com.byshnev.groceryinformationsystem.model.Product;
import com.byshnev.groceryinformationsystem.model.typesofproducts.PieceProduct;
import com.byshnev.groceryinformationsystem.model.typesofproducts.ProductByWeight;
import com.byshnev.groceryinformationsystem.service.impl.ProductServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/prod")
@AllArgsConstructor
public class ProductController {

	private ProductServiceImpl service;

	@GetMapping("/all")
	public Map<String, List<? extends Product>> findAllProducts() {
		return service.findAllProducts();
	}

	@GetMapping("/{name}")
	public Product findProduct(@PathVariable("name") String productName) {
		return service.findProduct(productName);
	}

	@PostMapping("/byWeight")
	public void addProductByWeight(@RequestBody ProductByWeight product) {
		service.addProductByWeight(product);
	}

	@PostMapping("/piece")
	public void addPieceProduct(@RequestBody PieceProduct product) {
		service.addPieceProduct(product);
	}

	@PutMapping("/update_piece_prod")
	public PieceProduct updatePieceProduct(PieceProduct product) {
		return service.updatePieceProduct(product);
	}

	@PutMapping("/update_prod_by_weight")
	public ProductByWeight updateProductByWeight(ProductByWeight product) {
		return service.updateProductByWeight(product);
	}

	@DeleteMapping("/delete/{name}")
	public void deleteProduct(@PathVariable("name") String productName) {
		service.deleteProduct(productName);
	}
}
