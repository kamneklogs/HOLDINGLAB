package model;

public class ProductsV {
	
	private String name;
	private String idC;
	private double qWater;
	private int qUnits;
	
	
	public ProductsV(String name, String idC, double qWater, int qUnits) {
		super();
		this.name = name;
		this.idC = idC;
		this.qWater = qWater;
		this.qUnits = qUnits;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getIdC() {
		return idC;
	}


	public void setIdC(String idC) {
		this.idC = idC;
	}


	public double getqWater() {
		return qWater;
	}


	public void setqWater(double qWater) {
		this.qWater = qWater;
	}


	public int getqUnits() {
		return qUnits;
	}


	public void setqUnits(int qUnits) {
		this.qUnits = qUnits;
	}
	
	
	
	
	
	
	

}
