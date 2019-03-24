package modelo;


public class Estudiante implements Runnable{

	   int id;
	   Monitor monitor;

	   Estudiante (int id, Monitor monitor) {
	      this.id = id;
	      this.monitor = monitor;
	   }

	   public void run() {
	      monitor.entraEstudiante(id);
	   }
	

}
