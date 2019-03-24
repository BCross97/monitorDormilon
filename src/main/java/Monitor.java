package modelo;

import java.util.concurrent.Semaphore;

public class Monitor extends Thread{
	
	   Semaphore monitor;
	   Semaphore mutex;
	   int chr;

	   Monitor( int chairs ) {
	      mutex = new Semaphore(1);
	      monitor = new Semaphore(chairs);
	      chr = chairs;
	   }

	   void entraEstudiante(int id) {
	      if(monitor.availablePermits() > 0){
	        try{monitor.acquire();
	        System.out.println("Estudiante " + id + " está esperando turno");
	        DormirHilo.nap();
	        } catch(InterruptedException e) { }
	       
	        try {mutex.acquire(); } catch (InterruptedException e) { }
	        monitor.release();
	        atiendeEstudiante(id);
	        mutex.release();
	      }
	      else{
	       System.out.println("Estudiante " + id + " se fue de la oficina");
	       DormirHilo.nap();
	      }  

	   }

	   private void atiendeEstudiante(int id) {
	      System.out.println ("Estudiante " + id + " está siendo antendido");
	      DormirHilo.nap();
	      System.out.println ("Estudiante " + id + " ya fue atendido");
	   }
	

}
