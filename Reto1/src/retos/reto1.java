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

				do {
					try {
						if (operacion >= 1 && operacion <= 4) {
							System.out.println("Introduce un nº");
							String s2 = sc.nextLine();
							a = Integer.parseInt(s2);
							System.out.println("Introduce un nº");
							String s3 = sc.nextLine();
							b = Integer.parseInt(s3);
							break;
						} else if (operacion > 4 && operacion <= 8) {
							System.out.println("Introduce un nº");
							String s4 = sc.nextLine();
							n = Integer.parseInt(s4);
						}

					} catch (Exception ex) {
						System.out.println("Introduce un nº correcto");
					}
				} while (true);

				if (operacion == 0) {
					System.out.println("has dicho fuera de la calculadora");
				} else if (operacion == 1) {
					System.out.println(Funciones1.sumar(a, b));
				} else if (operacion == 2) {
					System.out.println(Funciones1.restar(a, b));

				} else if (operacion == 3)

				{
					System.out.println(Funciones2.multiplicar(a, b));
				} else if (operacion == 4)

				{
					System.out.println(Funciones2.dividir(a, b));
				} else if (operacion == 5)

				{
					System.out.println(Funciones1.esPar(n));
				} else if (operacion == 6)

				{
					System.out.println(Funciones1.esImpar(n));
				} else if (operacion == 7)

				{
					System.out.println(Funciones2.esPositivo(n));
				} else if (operacion == 8)

				{
					System.out.println(Funciones2.esNegativo(n));
				}

			}

		} while (operacion != 0);

		sc.close();
	}
}
