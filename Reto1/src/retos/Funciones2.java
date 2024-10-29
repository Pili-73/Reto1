package retos;

public class Funciones2 {

	public static int multiplicar (int a, int b) {
		return a*b;
	}
	
	public static int dividir (int a, int b) {
		if (b != 0)
			return a/b;
		else {
			System.out.println("No se puede dividir entre 0");
			return -1;
		}
	}
	
	public static boolean esPositivo (int n) {
		if (n > 0) 
			return true;
		else
			return false;
	}
	
	public static boolean esNegativo (int n) {
		if (n < 0) 
			return true;
		else
			return false;
	}
	
	
}
