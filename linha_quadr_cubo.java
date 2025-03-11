package estrutura_repetitiva_for;

import java.util.Scanner;

public class linha_quadr_cubo {
	public static void main(String[]arg) {
		Scanner sc = new Scanner (System.in);
		
		int N =sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);

		}
		sc.close();
	}
}
