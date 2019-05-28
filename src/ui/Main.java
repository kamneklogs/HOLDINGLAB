package ui;
import model.*;
import java.util.*;

public class Main {

	static final String ACSP = "AGRICULTURA, CAZA, SILVICULTURA Y PEZCA ";
    static final String EMC = "EXPLOTACION DE MINAS Y CANTERAS ";
    static final String IM = "INDUSTRIA MANOFACTURERA";
    static final String EGV = "ELECTRICIDAD, GAS Y VAPOR";
    static final String C = "CONSTRUCCION";
    static final String CAPYM ="COMERCIO AL POR MAYOR Y AL POR MENOR";
    static final String TAC = "TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES";
    static final String FSIC = "EST.F/CIEROS,SEGUROS,B.INMUEBLES,SERV. A COMPANIAS ";
	static final String CS = "COMUNALES, SOCIALES";

	static int option, option1, option2, option3, cT, iterator, iterator2, qEmployees, yearsA, ranking, qStudents12, qTStudents, qUnits;
	static String name ,nit, adress, phone, dateCreation, typeC, nameLR, providedS, idMEN, directorN, educationS, nameP, idC;
	static double assets, qWater;
	static boolean centinel = false;
	static Scanner a = new Scanner(System.in);

	
    private Holding theHolding;
	
    
    public Main() {

		theHolding = new Holding("El mejor holding");
		

        
	}
	
	public void menu(){

		System.out.println("Bienvenido a la administracion del holding empresarial.¿Que desea hacer?");
		System.out.println("1. Agregar nuevas empresas");
		System.out.println("2. Generar informe de los datos de algunas empresas");
		System.out.println("3. Agregar empresas del tipo Fabricacion de alimentos");
		System.out.println("4. Salir del programa.");
	}

	public void editLegalP(){

		System.out.println("Ingrese los datos que se le solicitan a continuacion\n");
							System.out.println("Nombre de la empresa o institucion:");
							name = a.nextLine();
							name = a.nextLine();
							System.out.println("Nit de la empresa o institucion:");
							nit = a.nextLine();
							System.out.println("Direccion:");
							adress = a.nextLine();
							System.out.println("Telefono");
							phone = a.nextLine();
							System.out.println("Fecha de creacion");
							dateCreation = a.nextLine();
							System.out.println("Escoja el tipo de empresa o intitucion a registrar:\n");
							System.out.println("1. AGRICULTURA, CAZA, SILVICULTURA Y PEZCA\n2. EXPLOTACION DE MINAS Y CANTERAS\n3. INDUSTRIA MANOFACTURERA\n4. ELECTRICIDAD, GAS Y VAPOR\n5. CONSTRUCCION\n6. COMERCIO AL POR MAYOR Y AL POR MENOR\n7. TRANSPORTE, ALMACENAMIENTO Y COMUNICACIONES\n8. EST.F/CIEROS,SEGUROS,B.INMUEBLES,SERV. A COMPANIAS\n9. COMUNALES, SOCIALES");
							cT = a.nextInt();
							
								switch (cT){
									case 1:
										typeC = ACSP;
									break;
									case 2:
										typeC = EMC;
									break;
									case 3:
										typeC = IM;
									break;
									case 4:
										typeC = EGV;
									case 5:
										typeC = C;
									break;
									case 6:
										typeC = CAPYM;
									break;
									case 7: 
										typeC = TAC;
									break;
									case 8:
										typeC = FSIC;
									break;
									case 9:
										typeC = CS;
									break;
									default:
										typeC = "Pendiente por asignar";
								}
							System.err.println("Nombre del representante legal:");
							nameLR = a.nextLine();
							nameLR = a.nextLine();
							System.err.println("Cantidad de empleados:");
							qEmployees = a.nextInt();
							System.err.println("Ingrese los activos (en pesos)");
							assets = a.nextDouble();

	}
    
	public static void main(String[] args) {
	    
	    Main m = new Main();
	    
		System.out.println(" _________________________________________________________ ");
		System.out.println("|                                                         |");
		System.out.println("|                      HOLDING EMPRESARIAL                |");   
		System.out.println("|_________________________________________________________| \n");
		
		
		

		do{
			m.menu();
		option = a.nextInt();

		

		switch(option) {
  			case 1:
					
			 	System.out.println("Este es el menu para agregar una nueva empresa:\n");
				System.out.println("Por favor, ingrese el tipo de empresa a registrar:");
				System.out.println("1. Tecnologica");
				System.out.println("2. De Educacion");
				System.out.println("3. Fabricacion de productos varios");
				System.out.println("4. Fabricacion de medicamentos");
				System.out.println("5. Fabricacion de alimentos \n");
				System.out.println("0. Volver al menu anterior");

				option = a.nextInt();
				while(option != 0){
					switch (option){
						case 1:

							
							m.editLegalP();
							m.theHolding.gettCs().add(new TechnologyC(name, nit, adress, phone, dateCreation, typeC, nameLR, qEmployees, assets));

							do{
								System.out.println("Numero de empresas tecnologicas registradas: "+ m.theHolding.gettCs().size());
								iterator = 0;
								System.out.println("tamano de la lista de servicios: " + m.theHolding.gettCs().get(iterator).getProvidedS().size());
								centinel = false;	
								System.out.println("Ingrese el servicio prestado:");
								providedS = a.nextLine();
								providedS = a.nextLine();
								while(iterator < m.theHolding.gettCs().size() && centinel == false){
									
									if(m.theHolding.gettCs().get(iterator).getName().equals(name)== true){
										m.theHolding.gettCs().get(iterator).getProvidedS().add(providedS);
										centinel = true;
									}
									iterator++;	
								}
								
								System.out.println("Desea agregar mas servicios?\n1. Si\n2. No");
								option1 = a.nextInt();
							


							}while(option1 == 1);

							System.out.println("¿Desea agregar mas empresas tecnologicas?\n1. Si\n2. No");
							option2 = a.nextInt();
							switch (option2){
								case 1:
									m.editLegalP();
									m.theHolding.gettCs().add(new TechnologyC(name, nit, adress, phone, dateCreation, typeC, nameLR, qEmployees, assets));
									do{
										System.out.println("Numero de empresas tecnologicas registradas: "+ m.theHolding.gettCs().size());
										iterator = 0;
										System.out.println("tamano de la lista de servicios: " + m.theHolding.gettCs().get(iterator).getProvidedS().size());
										centinel = false;	
										System.out.println("Ingrese el servicio prestado:");
										providedS = a.nextLine();
										providedS = a.nextLine();
										while(iterator < m.theHolding.gettCs().size() && centinel == false){
											
											if(m.theHolding.gettCs().get(iterator).getName().equals(name)== true){
												m.theHolding.gettCs().get(iterator).getProvidedS().add(providedS);
												centinel = true;
											}
											iterator++;	
										}
										
										System.out.println("Desea agregar mas servicios?\n1. Si\n2. No");
										option1 = a.nextInt();
									
		
		
									}while(option1 == 1);
								break;

								case 2:
									System.out.println("Numero de empresas tecnologicas registradas: "+ m.theHolding.gettCs().size());
								break;
								default:
									System.err.println("ERROR EN LA MATRIX.2%$#% --> ESCAPE DE AQUI%%$$");
							}



						break;
						case 2:
							do{
								m.editLegalP();
								System.out.println("Ingrese el numero de registro del Ministerio Nacional de Educacion");
								idMEN = a.nextLine();
								idMEN = a.nextLine();
								System.out.println("Anios de acreditacion:");
								yearsA = a.nextInt();
								System.out.println("Puesto que ocupa la institucion educativa (Segun Saber11)");
								ranking = a.nextInt();
								System.out.println("Nombre del rector(a):");
								directorN = a.nextLine();
								directorN = a.nextLine();
								System.out.println("No. de estudiantes de estractos socio-economicos 1 y 2:");
								qStudents12 = a.nextInt();
								System.out.println("No. total de estudiantes:");
								qTStudents = a.nextInt();

								m.theHolding.geteCs().add(new EducationC(name, nit, adress, phone, dateCreation, typeC, nameLR, qEmployees, assets, idMEN, yearsA, ranking, directorN, educationS, qStudents12, qTStudents));
								System.out.println("Intitucion educativa agregada con exito");
								System.out.println("No. de intituciones educativas pertenecientes al holding: " + m.theHolding.geteCs().size());
								System.out.println("¿Desea agregar mas intituciones educativas?\n1. Si\n2. No");
								option3 = a.nextInt();
							}while(option3 == 1);
						break;
						case 3:
							do{
								m.editLegalP();
								m.theHolding.getvCs().add(new VariousPC(name, nit, adress, phone, dateCreation, typeC, nameLR, qEmployees, assets));
								

							}while();
						break;
					}
				}

   			break;

 			case 2:
    
            break;

			case 3:

			break;
            default:

		}
		}while(option != 4);
		

			

		


	}

}
