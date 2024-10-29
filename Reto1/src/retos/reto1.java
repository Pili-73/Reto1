package retos;

public class reto1 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		do
		{
			try
			{
				if (operacion>=1 && operacion<=4) {
					System.out.println("Introduce un nº");
					String s = sc.nextLine();
					a=Integer.parseInt(s);
					System.out.println("Introduce un nº");
					String s2 = sc.nextLine();
					b=Integer.parseInt(s);
					break;
				} else if (operacion>4 && operacion<=8) {
					System.out.println("Introduce un nº");
					String s3 = sc.nextLine();
					n=Integer.parseInt(s);
				}
				
			}
			catch(Exception ex)
			{
				System.out.println("Introduce un nº correcto");
			}
		}while(true);
		if (operacion==0) {
			System.out.println("has dicho fuera de la calculadora");
		}else if (operacion==1) {
			System.out.println(Funciones1.sumar(int a,int b));
		} else if (operacion==2) {
			System.out.println(Funciones1.restar(int a, int b));
		} else if (operacion==3) {
			System.out.println(Funciones2.multiplicar(int a, int b));
		}else if (operacion==4) {
			System.out.println(Funciones2.dividir(int a , int b));
		}else if (operacion==5) {
			System.out.println(Funciones1.esPar(int n));
		}else if (operacion==6) {
			System.out.println(Funciones1.esImpar(int n));
		}else if (operacion==7) {
			System.out.println(Funciones2.esPositivo(int n));
		}else if (operacion==8) {
			System.out.println(Funciones2.esNegativo(int n));
		}

		 
	}
	
}
