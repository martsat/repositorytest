package simulations;

public class rfSignalSim {

	public static void main(String[] args) {
		/* OBJETIVO
		 simular el patron de recepcion de una antena con 4 RFid's de diferente frecuencia en una tabla de valores numericos
		 
		 
		*/
		 int deg = 0;
		 double mayor = 0;
		 double y;
		 double radioMapArray[] = new double [361];
		 		 
		 //contar de 0 a 360
		 for(int x = 0; x < 361 ; x += 1 ) {
			//calcular y
			 y = Math.pow((Math.sin((x * (Math.PI))/180*4)*200 +200), 1.2) ; 
			 //imprimir y
			 System.out.println("x =" + x + "y ="+ y);
			 radioMapArray[x] = y;
			 
		 }
		 for( int x = 0; x < 361 ; x += 1 ) {
			 //leer array para determinar numero mas alto
			 y = radioMapArray[x];
			 if(y > mayor) {
				 mayor = y;
				 deg = x;
			 }
			
			 }
		 
		 System.out.print("max = " + mayor + " at " + (deg) + "º");
		
		 
		 
		 
		 

	}

}
