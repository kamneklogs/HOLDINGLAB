package ui;
import model.*;

public class Main {

    private Holding theHolding;
    
	
    
    public Main() {

		theHolding = new Holding("El mejor holding");
		Scanner a = new Scanner(System.in);

        
	}
	
	public void menu(){

		System.out.println("Bienvenido a la administracion del holding empresarial. ¿Qué desea hacer?");
		System.out.println("1. Agregar nuevas empresas");
		System.out.println("2. Generar informe de los datos de algunas empresas");
		System.out.println("3. Agregar empresas del tipo Fabricacion de alimentos");
	}
    
	public static void main(String[] args) {
	    
	    Main m = new Main();
	    
		System.out.println(" _________________________________________________________ ");
		System.out.println("|                                                         |");
		System.out.println("|                      HOLDING EMPRESARIAL                |");   
		System.out.println("|_________________________________________________________| \n")

		
		while()


	}

}
