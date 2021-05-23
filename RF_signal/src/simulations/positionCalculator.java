package simulations;

public class positionCalculator{
	public static void main(String[]args) {
		double i = Math.cosh(90);
		System.out.println(i);
		
	}
	public static double[] getPos(int degA, int degB,int degN, double A) { //angulo de rfa, rfb y medida entre estos
		//calcular angulo entre degA y degB
		int anguloa = degB-degA;
		// calcular angulo b del triangulo imaginario 
		int angulob = 180 -(anguloa)-(degB+degN) -90;
		//calcular angulo c del triangulo
		int anguloc = 180-anguloa-angulob;
		
		double[] coordenadas = new double[2];
		
		double B = Math.cos(anguloa)/A;
		double C = Math.sin(anguloa)/A;
		double x = A -(Math.sin(anguloa-(degB+degN))*B);
		double y = Math.cos((degB+degN)/B);
		
		coordenadas[0] = x;
		coordenadas[1] = y;
		
		return coordenadas;
		
		
		
	}
}