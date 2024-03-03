package com.byshnev.groceryinformationsystem.model.typesofproducts;

import com.byshnev.groceryinformationsystem.model.Product;
import lombok.Data;

@Data
public class ProductByWeight extends Product {
	private float costForKilo;
	private int amountOfKilo;
}
