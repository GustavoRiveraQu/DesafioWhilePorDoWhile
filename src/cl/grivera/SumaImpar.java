package cl.grivera;

import java.util.Scanner;

public class SumaImpar {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese Hasta que numero debe sumar los impares");
		int n1=ingreso.nextInt();
		int i=0;
		int suma = 0;
		while (i <= n1) {
			if (i%2==1) {
				suma = suma + i;
				i++;
			}else {
				i++;
			}
		}
		System.out.println("La suma es " + suma);
		ingreso.close();

	}

}
