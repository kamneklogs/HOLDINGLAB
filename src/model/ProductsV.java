package model;

public class ProductsV {

	private String nameP;
	private String idC;
	private double qWater;
	private int qUnits;

	public ProductsV(String nameP, String idC, double qWater, int qUnits) {

		this.nameP = nameP;
		this.idC = idC;
		this.qWater = qWater;
		this.qUnits = qUnits;
	}

	public String getNameP() {
		return nameP;
	}

	public void setName(String nameP) {
		this.nameP = nameP;
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

	public void setNameP(String nameP) {
		this.nameP = nameP;
	}

}
