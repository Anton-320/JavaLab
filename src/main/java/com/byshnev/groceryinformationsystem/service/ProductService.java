package com.byshnev.groceryinformationsystem.service;

import com.byshnev.groceryinformationsystem.model.Product;
import com.byshnev.groceryinformationsystem.model.typesOfProducts.PieceProduct;
import com.byshnev.groceryinformationsystem.model.typesOfProducts.ProductByWeight;

import java.util.List;

public interface ProductService {

	public List<Product> findAllProducts();
	public void addPieceProduct(PieceProduct product);
	public void addProductByWeight(ProductByWeight product);
	public Product findProduct(String name);
	public void deleteProduct(String name);

}