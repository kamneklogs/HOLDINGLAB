package model;

public class LegalP {

    protected String name;
    protected String nit;
    protected String adress;
    protected String phone;
    protected String dateCreation;
    protected String typeC;
    protected String nameLR;
    protected int qEmployees;
    protected double assets;

    public LegalP(String name, String nit, String adress, String phone, String dateCreation, String typeC,
            String nameLR, int qEmployees, double assets) {
        this.name = name;
        this.nit = nit;
        this.adress = adress;
        this.phone = phone;
        this.dateCreation = dateCreation;
        this.typeC = typeC;
        this.nameLR = nameLR;
        this.qEmployees = qEmployees;
        this.assets = assets;

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the dateCreation
     */
    public String getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the typeC
     */
    public String getTypeC() {
        return typeC;
    }

    /**
     * @param typeC the typeC to set
     */
    public void setTypeC(String typeC) {
        this.typeC = typeC;
    }

    /**
     * @return the nameLR
     */
    public String getNameLR() {
        return nameLR;
    }

    /**
     * @param nameLR the nameLR to set
     */
    public void setNameLR(String nameLR) {
        this.nameLR = nameLR;
    }

    /**
     * @return the qEmployees
     */
    public int getqEmployees() {
        return qEmployees;
    }

    /**
     * @param qEmployees the qEmployees to set
     */
    public void setqEmployees(int qEmployees) {
        this.qEmployees = qEmployees;
    }

    /**
     * @return the assets
     */
    public double getAssets() {
        return assets;
    }

    /**
     * @param assets the assets to set
     */
    public void setAssets(double assets) {
        this.assets = assets;
    }

    public String parcialToString() {
        return "Nombre:    " + name + "\n" + "Nit:    " + nit + "\n" + "Direccion:    " + adress + "\n"
                + "Telefono:    " + phone + "\n" + "Fecha de creacion:    " + dateCreation + "\n"
                + "Tipo de empresa:    " + typeC + "\n" + "Nombre del representante legal:    " + nameLR + "\n"
                + "Numero de empleados:    " + qEmployees + "\n" + "Activos (Pesos):    " + assets;
    }

}