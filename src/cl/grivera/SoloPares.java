package cl.grivera;
import java.util.*;

public class SoloPares {

	public static void main(String[] args) {

		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese La Cantidad de Pares");
		int n1 = ingreso.nextInt();

		for(int i=0 ; i<n1 ; i++) {
			System.out.println(i*2);
		}
		ingreso.close();
	}

}
