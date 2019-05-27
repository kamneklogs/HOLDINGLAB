package model;

public class FoodC extends LegalP{

    private int invCode;
    private boolean sanitaryPer;
    private String fType;


    public FoodC(String name, String nit, String adress, String phone, String dateCreation, String typeC,
			String nameLR, int qEmployees, double assets,int invCode, boolean sanitaryPer, String fType){

        super(name, nit, adress, phone, dateCreation, typeC, nameLR, qEmployees, assets);
        this.invCode = invCode;
        this.sanitaryPer = sanitaryPer;
        this.fType = fType;


    }


}