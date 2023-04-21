package cl.grivera;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese La cantidad de elementos que desea Ver");
		int fibo =ingreso.nextInt();

		int num1 = 0;
		int num2 = 1;
		int suma = 1;

		System.out.println(num1);

		for (int i = 1; i <= fibo; i++) {

			System.out.println(suma);

			suma = num1 + num2;
			num1 = num2;
			num2 = suma;


		}
		ingreso.close();		
	}

}


