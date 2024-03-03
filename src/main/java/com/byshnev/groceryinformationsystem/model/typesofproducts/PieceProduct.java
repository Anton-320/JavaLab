package com.byshnev.groceryinformationsystem.model.typesofproducts;

import com.byshnev.groceryinformationsystem.model.Product;
import lombok.Data;

@Data
public class PieceProduct extends Product {
	private float costForPiece;
	private int amountOfThings;
}
