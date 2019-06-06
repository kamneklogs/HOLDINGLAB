package model;

public class FoodC extends LegalP {

    private int invCode;
    private boolean sanitaryPer;
    private boolean foodHandling;

    public FoodC(String name, String nit, String adress, String phone, String dateCreation, String typeC, String nameLR,
            int qEmployees, double assets, int invCode, boolean sanitaryPer, boolean foodHandling) {

        super(name, nit, adress, phone, dateCreation, typeC, nameLR, qEmployees, assets);
        this.invCode = invCode;
        this.sanitaryPer = sanitaryPer;
        this.foodHandling = foodHandling;

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

    /**
     * @return the foodHandling
     */
    public boolean isFoodHandling() {
        return foodHandling;
    }

    /**
     * @param foodHandling the foodHandling to set
     */
    public void setFoodHandling(boolean foodHandling) {
        this.foodHandling = foodHandling;
    }

    @Override
    public String toString() {
        return super.parcialToString() + "\n" + invCode + "\n" + sanitaryPer + "n" + foodHandling;
    }

}