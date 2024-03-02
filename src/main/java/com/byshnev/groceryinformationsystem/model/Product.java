package com.byshnev.groceryinformationsystem.model;


import lombok.Data;

import java.util.Date;


@Data
public class Product {
	private String name;
	private String manufacturer;
	private Date dateOfManufacturing;
	private int expirationDatePeriod;	//Срок годности в днях


}
