package com.byshnev.groceryinformationsystem.dto;

import com.byshnev.groceryinformationsystem.model.typesofproducts.PieceProduct;
import com.byshnev.groceryinformationsystem.model.typesofproducts.ProductByWeight;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BothListsDto {
	private List<PieceProduct> pieceProductList = new ArrayList<>();
	private List<ProductByWeight> productByWeightList = new ArrayList<>();

	public BothListsDto(List<PieceProduct> pieceProductList, List<ProductByWeight> productByWeightList) {
		this.pieceProductList = pieceProductList;
		this.productByWeightList = productByWeightList;
	}
}
