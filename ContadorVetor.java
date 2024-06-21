package questao;

import java.util.Locale;
import java.util.Scanner;
public class ContadorVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira quantos numeros voce deseja contar(Maximo de 10)");
		int n = sc.nextInt();
		int []v = new int [n];
		if (n <= 10) {
		for (int c = 0; c < n ; c++) {	
				System.out.println("Digite um numero:");
				v[c] = sc.nextInt();
	}
		System.out.println("Numeros negativos:	");
		for (int c = 0; c < n; c++) {
		if(v[c] < 0) {
		System.out.println(v[c]);
		}
}
		sc.close();
}
		else {
			System.out.println("Limite maximo ultrapassado");
		}
}
}