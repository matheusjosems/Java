package estrutura_repetitiva_for;

import java.util.Scanner;

public class calc_div {
	
	public static void main (String[]arg) {
		
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			
			if ( N % i == 0) {
				System.out.println(i);
			}
			
		}
		sc.close();
	} 

}
