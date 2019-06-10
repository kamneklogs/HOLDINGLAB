package model;

import java.util.ArrayList;

public class VariousPC extends LegalP implements TreeTaxes {

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

	@Override
	public String toString() {
		return super.parcialToString() + "\nNo. de productos:    " + products.size() + "\n" +"Impuesto aguaXarbol:     "+ waterXtree() + "\n";
	}

	@Override
	public String waterXtree() {

		String finalTQ = " ";
		double qW = 0;
		for (int i = 0; i < products.size(); i++) {
			qW += products.get(i).getqWater();
		}

		if (qW >= 1 && qW < 140) {
			finalTQ = "Debe sembrar 6 arboles";
		}
		if (qW >= 141 && qW < 800) {
			finalTQ = "Debe sembrar 25 arboles";
		}
		if (qW > 800) {
			finalTQ = "Debe sembrar 200 arboles";
		}

		return finalTQ;
	}


}