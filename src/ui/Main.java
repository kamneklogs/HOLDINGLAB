package ui;
import model.*;

public class Main {

    private Holding theHolding;
    
public void init(){
        //Creamos el mejor holdings
        
        theHolding = new Holding("El mejor holding");
        
    }
    
    public Main() {
        
    }
    
	public static void main(String[] args) {
	    
	    Main m = new Main();
	    
		System.out.println(" _________________________________________________________ ");
		System.out.println("|                                                         |");
		System.out.println("|                      HOLDING EMPRESARIAL                |");   
		System.out.println("|_________________________________________________________| \n");

	}

}
