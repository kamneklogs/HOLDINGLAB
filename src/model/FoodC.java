package model;

public class FoodC extends LegalP {

    private int invCode;
    private boolean sanitaryPer;
    private String fType;

    public FoodC(String name, String nit, String adress, String phone, String dateCreation, String typeC, String nameLR,
            int qEmployees, double assets, int invCode, boolean sanitaryPer, String fType) {

        super(name, nit, adress, phone, dateCreation, typeC, nameLR, qEmployees, assets);
        this.invCode = invCode;
        this.sanitaryPer = sanitaryPer;
        this.fType = fType;

    }

    public int getInvCode() {
        return invCode;
    }

    public void setInvCode(int invCode) {
        this.invCode = invCode;
    }

    public boolean isSanitaryPer() {
        return sanitaryPer;
    }

    public void setSanitaryPer(boolean sanitaryPer) {
        this.sanitaryPer = sanitaryPer;
    }

    public String getfType() {
        return fType;
    }

    public void setfType(String fType) {
        this.fType = fType;
    }

}