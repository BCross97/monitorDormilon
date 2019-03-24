package modelo;

public class DormirHilo {
	
	   private static final int NAP_TIME = 5;

	   /**
	    *dormida entre cero y  NAP_TIME segundos.
	    */
	   static void nap() {
	      nap(NAP_TIME);
	   }

	   /**
	    * dormida entre cero y la duration en seg.
	    */
	   static void nap(int duration) {
	      int sleeptime = (int) (duration * Math.random() );
	      try { Thread.sleep(sleeptime*1000); } catch (InterruptedException ie) {}
	   }

}
