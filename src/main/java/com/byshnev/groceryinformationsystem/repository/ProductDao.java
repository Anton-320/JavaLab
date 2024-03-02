package com.byshnev.groceryinformationsystem.repository;

import com.byshnev.groceryinformationsystem.model.Product;
import com.byshnev.groceryinformationsystem.model.typesOfProducts.PieceProduct;
import com.byshnev.groceryinformationsystem.model.typesOfProducts.ProductByWeight;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Data
public class ProductDao {
	private List<PieceProduct> pieceProductList = new ArrayList<>();
	private List<ProductByWeight> productByWeightList = new ArrayList<>();

	public List<PieceProduct> findAllPieceProducts() {
		return pieceProductList;
	}

	public List<ProductByWeight> findAllProductsByWeight() {
		return productByWeightList;
	}

	public void addPieceProduct(PieceProduct product) {
		pieceProductList.add(product);
	}

	public void addProductByWeight(ProductByWeight product) {
		productByWeightList.add(product);
	}

	public Product findProduct(String productName) {
		PieceProduct tmp = pieceProductList.stream()
				.filter(name->name.equals(productName))
				.findFirst()
				.orElse(null);
		if (tmp == null) {
			return productByWeightList.stream()
				.filter(name->name.equals(productName))
				.findFirst()
				.orElse(null);
		}
		return tmp;
	}

	public void deleteProduct(String name) {
		pieceProductList.remove(findProduct(name));
		productByWeightList.remove(findProduct(name));
	}


}