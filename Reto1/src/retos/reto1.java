package retos;

import java.util.Scanner;

public class reto1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int operacion = -1, n = 0, a = 0, b = 0;
		boolean mal;
		
		do {
			mal = false;
			System.out.println("Elige la operación:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Par");
			System.out.println("6. Impar");
			System.out.println("7. Positivo");
			System.out.println("8. Negativo");
			System.out.println("0. Salir");
			
			try {
				String s = sc.nextLine();
				operacion = Integer.parseInt(s);
				if (operacion < 0 || operacion > 8) {
					mal = true;
					System.out.println("Entre 0 y 8");
				}
			} catch (Exception e) {
				System.out.println("Formato inválido");
				mal = true;
			}
			
			if (!mal) {
								
			}
							
		} while (operacion != 0);
		
		sc.close();
	}

}
