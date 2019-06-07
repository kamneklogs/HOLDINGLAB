package model;

public class EducationC extends LegalP implements Taxes {

    private String idMEN;
    private int yearsA;
    private int ranking;
    private String directorN;
    private String educationS;
    private double qStudents12;
    private double qTStudents;

    public EducationC(String name, String nit, String adress, String phone, String dateCreation, String typeC,
            String nameLR, int qEmployees, double assets, String idMEN, int yearsA, int ranking, String directorN,
            String educationS, double qStudents12, double qTStudents) {
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

    public double getqStudents12() {
        return qStudents12;
    }

    public void setqStudents12(double qStudents12) {
        this.qStudents12 = qStudents12;
    }

    public double getqTStudents() {
        return qTStudents;
    }

    public void setqTStudents(double qTStudents) {
        this.qTStudents = qTStudents;
    }

    @Override
    public String toString() {
        return super.parcialToString() + "\n" + "No. de registro del MNE:    " + idMEN + "\n"
                + "Anios de antiguedad:    " + yearsA + "\n"
                + "Puesto nacional de la I.E (Segun Saber 11 o Saber Pro):    " + ranking + "\n"
                + "Nombre del director:    " + directorN + "\n" + "No. estudiantes de estrato socioeconomico 1 y 2:    "
                + qStudents12 + "\n" + "No. total de estudiantes:     " + qTStudents + "\n" + "Impuesto PROCULTURA:    "
                + tProCultura();
    }

    public String tProCultura() {
        double proC = 20-((qStudents12 / qTStudents) * 100);
        String tProC = " ";
        
        tProC = proC + "%";
        if (proC < 0) {
            tProC = "Exhimido de impuesto";
        }
        return tProC;
    }

}
