package model;

import java.util.*;

public class VariousPC extends LegalP {

	private ArrayList<ProductsV> products;

	public VariousPC(String name, String nit, String adress, String phone, String dateCreation, String typeC,
			String nameLR, int qEmployees, double assets) {
		super(name, nit, adress, phone, dateCreation, typeC, nameLR, qEmployees, assets);
		products = new ArrayList<ProductsV>();
	}

	public ArrayList<ProductsV> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<ProductsV> products) {
		this.products = products;
	}

}
