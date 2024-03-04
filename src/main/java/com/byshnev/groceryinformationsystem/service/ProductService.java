package com.byshnev.groceryinformationsystem.service;

import com.byshnev.groceryinformationsystem.model.Product;
import com.byshnev.groceryinformationsystem.model.typesofproducts.PieceProduct;
import com.byshnev.groceryinformationsystem.model.typesofproducts.ProductByWeight;

import java.util.Map;

public interface ProductService {

	public Map<String, Product> findAllProducts();
	public void addPieceProduct(PieceProduct product);
	public void addProductByWeight(ProductByWeight product);
	public Product findProduct(String name);
	public PieceProduct updatePieceProduct(PieceProduct product);
	public ProductByWeight updateProductByWeight(ProductByWeight product);
	public void deleteProduct(String name);

}
