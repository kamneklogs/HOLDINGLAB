package model;

import java.util.*;

public class TechnologyC extends LegalP implements Read{

	private ArrayList<String> providedS;

	public TechnologyC(String name, String nit, String adress, String phone, String dateCreation, String typeC,
			String nameLR, int qEmployees, double assets) {
		super(name, nit, adress, phone, dateCreation, typeC, nameLR, qEmployees, assets);
		providedS = new ArrayList<String>();
	}

	public ArrayList<String> getProvidedS() {
		return providedS;
	}

	public void setProvidedS(ArrayList<String> providedS) {
		this.providedS = providedS;
	}

}
