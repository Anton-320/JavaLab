package com.byshnev.groceryinformationsystem.model;


import lombok.Data;

import java.time.LocalDate;


@Data
public class Product {
	private String name;
	private String manufacturer;
	private LocalDate dateOfManufacturing;
	private LocalDate expirationDatePeriod;	//Срок годности в днях
}
