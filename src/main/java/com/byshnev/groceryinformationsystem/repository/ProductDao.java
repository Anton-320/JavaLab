package com.byshnev.groceryinformationsystem.repository;

import com.byshnev.groceryinformationsystem.model.Product;
import com.byshnev.groceryinformationsystem.model.typesofproducts.PieceProduct;
import com.byshnev.groceryinformationsystem.model.typesofproducts.ProductByWeight;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
@Data
public class ProductDao {
	private List<PieceProduct> pieceProductList = new ArrayList<>();
	private List<ProductByWeight> productByWeightList = new ArrayList<>();

	public Product findProduct(String productName) {
		PieceProduct tmp = pieceProductList.stream()
				.filter(element->element.getName().equals(productName))
				.findFirst()
				.orElse(null);
		if (tmp == null) {
			return productByWeightList.stream()
					.filter(element->element.getName().equals(productName))
					.findFirst()
					.orElse(null);
		}
		return tmp;
	}

	public PieceProduct addPieceProduct(PieceProduct product) {
		pieceProductList.add(product);
		return product;
	}

	public ProductByWeight addProductByWeight(ProductByWeight product) {
		productByWeightList.add(product);
		return product;
	}

	public PieceProduct updatePieceProduct(PieceProduct product) {
		var index = IntStream.range(0, pieceProductList.size())
				.filter(ind->pieceProductList.get(ind).getName().equals(product.getName()))
				.findFirst()
				.orElse(-1);
		if (index > -1) {
			pieceProductList.set(index, product);
			return product;
		}
		else return null;
	}

	public ProductByWeight updateProductByWeight(ProductByWeight product) {
		var index = IntStream.range(0, productByWeightList.size())
				.filter(ind->productByWeightList.get(ind).getName().equals(product.getName()))
				.findFirst()
				.orElse(-1);
		if (index > -1) {
			productByWeightList.set(index, product);
			return product;
		}
		else return null;
	}

	public void deleteProduct(String name) {
		pieceProductList.remove(findProduct(name));
		productByWeightList.remove(findProduct(name));
	}


}
