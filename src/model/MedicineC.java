package model;

import java.util.*;

public class MedicineC extends LegalP {

    private ArrayList<MProducts> mPs;

    public MedicineC(String name, String nit, String adress, String phone, String dateCreation, String typeC,
            String nameLR, int qEmployees, double assets) {
        super(name, nit, adress, phone, dateCreation, typeC, nameLR, qEmployees, assets);
        mPs = new ArrayList<MProducts>();

    }

    public ArrayList<MProducts> getmPs() {
        return mPs;
    }

    public void setmPs(ArrayList<MProducts> mPs) {
        this.mPs = mPs;
    }

    @Override
    public String toString() {
        return super.parcialToString() + "\n No. de Medicamentos" + mPs.size();
    }

}