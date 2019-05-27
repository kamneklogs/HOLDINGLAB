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

	static int option, cT;
	String name ,nit, adress, phone, dateCreation, typeC, nameLR;
	double assets, qEmployees;
	static Scanner a = new Scanner(System.in);
	
    private Holding theHolding;
    
	
    
    public Main() {

		theHolding = new Holding("El mejor holding");
		

        
	}
	
	public void menu(){

		System.out.println("Bienvenido a la administracion del holding empresarial. ¿Que desea hacer?");
		System.out.println("1. Agregar nuevas empresas");
		System.out.println("2. Generar informe de los datos de algunas empresas");
		System.out.println("3. Agregar empresas del tipo Fabricacion de alimentos");
		System.out.println("4. Salir del programa.");
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
