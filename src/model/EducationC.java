package model;

public class EducationC extends LegalP{
	
	private String idMEN;
	private int yearsA;
	private int ranking;
	private String directorN;
	private String educationS;
	private int qStudents12;
	private int qTStudents;
	
	//hjdsbj
    public EducationC( String name, String nit, String adress, String phone, String dateCreation, String typeC, String nameLR, int qEmployees, double assets, String idMEN, int yearsA, int ranking, String directorN, String educationS, int qStudents12, int qTStudents)
    {
        super( name, nit, adress, phone, dateCreation, typeC, nameLR, qEmployees, assets );
        this.idMEN = idMEN;
        this.yearsA = yearsA;
        this.ranking = ranking;
        this.directorN = directorN;
        this.educationS = educationS;
        this.qStudents12 = qStudents12;
        this.qTStudents = qTStudents;
        
    }
	
	
	
	
	
	

}
