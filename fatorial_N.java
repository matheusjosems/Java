package estrutura_repetitiva_for;

import java.util.Scanner;

public class fatorial_N {
	
	public static void main (String[]arg) {
		
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		int fat = 1;
		
		for (int i=1; i<=N; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();
	}

}
