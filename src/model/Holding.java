package model;

import java.util.*;

public class Holding {

    private String name;

    private ArrayList<TechnologyC> tCs;
    private ArrayList<EducationC> eCs;
    private ArrayList<VariousPC> vCs;
    private ArrayList<MedicineC> mCs;
    private ArrayList<FoodC> fCs;

    public Holding(String name) {

        this.name = name;
        tCs = new ArrayList<TechnologyC>();
        eCs = new ArrayList<EducationC>();
        vCs = new ArrayList<VariousPC>();
        mCs = new ArrayList<MedicineC>();
        fCs = new ArrayList<FoodC>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<TechnologyC> gettCs() {
        return tCs;
    }

    public ArrayList<EducationC> geteCs() {
        return eCs;
    }

    public ArrayList<VariousPC> getvCs() {
        return vCs;
    }

    public ArrayList<MedicineC> getmCs() {
        return mCs;
    }

    public void settCs(ArrayList<TechnologyC> tCs) {
        this.tCs = tCs;
    }

    public void seteCs(ArrayList<EducationC> eCs) {
        this.eCs = eCs;
    }

    public void setvCs(ArrayList<VariousPC> vCs) {
        this.vCs = vCs;
    }

    public void setmCs(ArrayList<MedicineC> mCs) {
        this.mCs = mCs;
    }

    public void setfCs(ArrayList<FoodC> fCs) {
        this.fCs = fCs;
    }

    public ArrayList<FoodC> getfCs() {
        return fCs;
    }

    public String listCs(){
        String finalList = " ";
        if(tCs!=null){
            for(int i=0 ; i<tCs.size();i++){
                finalList += tCs.get(i).getName() + "\n";
            }
        }

        if(eCs!=null){
            for(int i=0; i<eCs.size();i++){
                finalList += tCs.get(i).getName() + "\n";
            }
        }

        if(vCs!=null){
            for(int i=0; i<vCs.size();i++){
                finalList += vCs.get(i).getName() + "\n";
            }
        }

        if(mCs!=null){
            for(int i=0; i<mCs.size();i++){
                finalList += mCs.get(i).getName() + "\n";
            }

        }
        if(fCs!=null){
            for(int i=0; i<fCs.size();i++){
                finalList += fCs.get(i).getName() + "\n";
            }
        }
       
        return finalList;
    }

    public String supeRString(){
        String finalSuper = " ";
        if(tCs!=null){
            for(int i=0 ; i<tCs.size();i++){
                finalSuper += "EMPRESAS TECNOLOGICAS:\n";
                finalSuper += tCs.get(i).toString() + "\n";
            }
        }

        if(eCs!=null){
            for(int i=0; i<eCs.size();i++){
                finalSuper += "INSTITUCIONES EDUCATIVAS:\n";
                finalSuper += eCs.get(i).toString() + "\n";
            }
        }

        if(vCs!=null){
            for(int i=0; i<vCs.size();i++){
                finalSuper += "EMPRESAS DE FABRICACION DE PRODUCTOS VARIOS:\n";
                finalSuper += vCs.get(i).toString() + "\n";
            }
        }

        if(mCs!=null){
            for(int i=0; i<mCs.size();i++){
                finalSuper += "EMPRESAS FARMACEUTICAS:\n";
                finalSuper += mCs.get(i).toString() + "\n";
            }

        }
        if(fCs!=null){
            for(int i=0; i<fCs.size();i++){
                finalSuper += "EMPRESAS DE COMESTIBLES:\n";
                finalSuper += fCs.get(i).toString() + "\n";
            }
        }
        return finalSuper;
    }

}