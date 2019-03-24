package modelo;


public class Oficina {
	
	  public static final int NUM_OF_CHAIRS = 3;
	   public static final int NUM_OF_CUSTOMERS = 10;

	   public static void main(String[] args) {
		
		   Monitor monitor = new Monitor(NUM_OF_CHAIRS);
		   
		   for (int i = 0; i < NUM_OF_CUSTOMERS; i++) {
			   (new Thread(new Estudiante(i, monitor))).start();
			   DormirHilo.nap();
		   }
	}
	   
}
