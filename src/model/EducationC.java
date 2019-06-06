package model;

public class EducationC extends LegalP implements Taxes {

    private String idMEN;
    private int yearsA;
    private int ranking;
    private String directorN;
    private String educationS;
    private int qStudents12;
    private int qTStudents;

    public EducationC(String name, String nit, String adress, String phone, String dateCreation, String typeC,
            String nameLR, int qEmployees, double assets, String idMEN, int yearsA, int ranking, String directorN,
            String educationS, int qStudents12, int qTStudents) {
        super(name, nit, adress, phone, dateCreation, typeC, nameLR, qEmployees, assets);
        this.idMEN = idMEN;
        this.yearsA = yearsA;
        this.ranking = ranking;
        this.directorN = directorN;
        this.educationS = educationS;
        this.qStudents12 = qStudents12;
        this.qTStudents = qTStudents;

    }

    public String getIdMEN() {
        return idMEN;
    }

    public void setIdMEN(String idMEN) {
        this.idMEN = idMEN;
    }

    public int getYearsA() {
        return yearsA;
    }

    public void setYearsA(int yearsA) {
        this.yearsA = yearsA;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getDirectorN() {
        return directorN;
    }

    public void setDirectorN(String directorN) {
        this.directorN = directorN;
    }

    public String getEducationS() {
        return educationS;
    }

    public void setEducationS(String educationS) {
        this.educationS = educationS;
    }

    public int getqStudents12() {
        return qStudents12;
    }

    public void setqStudents12(int qStudents12) {
        this.qStudents12 = qStudents12;
    }

    public int getqTStudents() {
        return qTStudents;
    }

    public void setqTStudents(int qTStudents) {
        this.qTStudents = qTStudents;
    }

    @Override
    public String toString() {
        return super.parcialToString() + "\n" + idMEN + "\n" + yearsA + "\n" + ranking + "\n" + directorN + "\n" + educationS
                + "\n" + qStudents12 + "\n" + qTStudents + "\n" + tProCultura();
    }

    public String tProCultura() {
        double proC = 20;
        String tProC = " ";
        proC = proC - (qStudents12/qTStudents)*100;
        tProC = "Impuesto ProCultura: "+ proC + "%";
        if(proC<0){
            tProC = "Exhimido de impuesto";
        }
        return tProC;
    }




}
