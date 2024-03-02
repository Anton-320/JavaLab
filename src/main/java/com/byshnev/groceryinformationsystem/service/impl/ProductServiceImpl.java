package com.byshnev.groceryinformationsystem.service.impl;

import com.byshnev.groceryinformationsystem.model.Product;
import com.byshnev.groceryinformationsystem.model.typesOfProducts.PieceProduct;
import com.byshnev.groceryinformationsystem.model.typesOfProducts.ProductByWeight;
import com.byshnev.groceryinformationsystem.repository.ProductDao;
import com.byshnev.groceryinformationsystem.service.ProductService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
	@NonNull
	private ProductDao repository;

	@Override
	public List<Product> findAllProducts() {
		List<Product> tmp = new ArrayList<>();
		tmp.addAll(repository.findAllPieceProducts());
		tmp.addAll(repository.findAllProductsByWeight());
		return tmp;
	}

	public void addPieceProduct(PieceProduct product) {
		repository.addPieceProduct(product);
	}

	public void addProductByWeight(ProductByWeight product) {
		repository.addProductByWeight(product);
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
