package ui;
import model.*;

public class Main {

    private Holding theHolding;
    
	public void init(){

        
        theHolding = new Holding("El mejor holding");
        
    }
    
    public Main() {
        
	}
	
	public void menu(){

		System.out.println("Bienvenido a la administracion del holding empresarial. ¿Qué desea hacer?");
		System.out.println("1. Agregar nuevas empresas");
		System.out.println("2. Generar informe de los datos de algunas empresas");
		System.out.println("Las demas funciones estan en beta");
	}
    
	public static void main(String[] args) {
	    
	    Main m = new Main();
	    
		System.out.println(" _________________________________________________________ ");
		System.out.println("|                                                         |");
		System.out.println("|                      HOLDING EMPRESARIAL                |");   
		System.out.println("|_________________________________________________________| \n");

	}

}
