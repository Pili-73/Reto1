package retos;

public class Funciones1 {
	public static int sumar(int a, int b) {
		int suma = a + b;
		return suma;
	}
	public static int restar(int a,int b) {
		int resta = a-b;
		return resta;
	}
	public static boolean esPar(int n) {
		if (n%2==0) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean esImpar(int n) {
		if (n%2!=0) {
			return true;
		} else {
			return false;
		}
	}
}
