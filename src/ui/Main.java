package ui;
import model.*;
import java.util.*;

public class Main {

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
	    Scanner a = new Scanner(System.in);
		System.out.println(" _________________________________________________________ ");
		System.out.println("|                                                         |");
		System.out.println("|                      HOLDING EMPRESARIAL                |");   
		System.out.println("|_________________________________________________________| \n");
		int option;
		do{
			m.menu();
		option = a.nextInt();

		

		switch(option) {
  			case 1:
					
			 	System.out.println("Este es el menu para agregar una nueva empresa:\n");
				System.out.println("Por favor, ingrese el tipo de empresa a registrar:");
				System.out.println("1. Tecnologica");
				System.out.println("2. De Educación");
				System.out.println("3. Fabricacion de productos varios");
				System.out.println("4. Fabricacion de medicamentos");
				System.out.println("5. Fabricacion de alimentos \n");
				System.out.println("0. Volver al menu anterior");

				option = a.nextInt();
				while(option != 0){
					if(option == 1){
						System.out.println("prueba");
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
