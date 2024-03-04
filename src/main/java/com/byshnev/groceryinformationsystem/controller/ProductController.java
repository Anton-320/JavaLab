package com.byshnev.groceryinformationsystem.controller;

import com.byshnev.groceryinformationsystem.dto.BothListsDto;
import com.byshnev.groceryinformationsystem.model.Product;
import com.byshnev.groceryinformationsystem.model.typesofproducts.PieceProduct;
import com.byshnev.groceryinformationsystem.model.typesofproducts.ProductByWeight;
import com.byshnev.groceryinformationsystem.service.impl.ProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/prod")
@AllArgsConstructor
public class ProductController {

	private ProductServiceImpl service;

//	@GetMapping("/all")
//	public BothListsDto findAllProducts() {
//		return service.findAllProducts();
//	}

	@GetMapping("/all")
	public Map<String, Product> findAllProducts() {
		return service.findAllProducts();
	}

	@GetMapping("/{name}")
	public Product findProduct(@PathVariable("name") String productName) {
		return service.findProduct(productName);
	}

	@PostMapping("/by_weight")
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
