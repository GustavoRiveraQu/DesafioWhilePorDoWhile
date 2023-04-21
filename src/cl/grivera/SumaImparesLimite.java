package cl.grivera;

import java.util.Scanner;

public class SumaImparesLimite {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese el limite Inferior");
		int i =ingreso.nextInt();
		System.out.println("Ingrese el limite Superior");
		int n1 =ingreso.nextInt();
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

