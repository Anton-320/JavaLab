package com.byshnev.groceryinformationsystem.service;

import com.byshnev.groceryinformationsystem.dto.BothListsDto;
import com.byshnev.groceryinformationsystem.model.Product;
import com.byshnev.groceryinformationsystem.model.typesofproducts.PieceProduct;
import com.byshnev.groceryinformationsystem.model.typesofproducts.ProductByWeight;

public interface ProductService {

	public BothListsDto findAllProducts();
	public void addPieceProduct(PieceProduct product);
	public void addProductByWeight(ProductByWeight product);
	public Product findProduct(String name);
	public PieceProduct updatePieceProduct(PieceProduct product);
	public ProductByWeight updateProductByWeight(ProductByWeight product);
	public void deleteProduct(String name);

}
