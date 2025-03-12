package estrutura_repetitiva_for;

import java.util.Locale;
import java.util.Scanner;
//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"

public class N_divisoes {
	public static void main (String []arg){
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b == 0) {
				
				System.out.println("divisao impossivel");
			}
			else {
				double divisao = a/b;
				
				System.out.printf("%.1f%n"+divisao);
			}

	    }
		
		sc.close();
	}
	
}
