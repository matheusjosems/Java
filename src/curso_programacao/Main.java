package curso_programacao;
import java.util.Scanner;

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // entrada de dados 
        System.out.println("digite a senha:");
        
        int x =sc.nextInt(); 
        int y =sc.nextInt(); 

        while (x!=0 && y!=0 ) {
        	  if (x > 0 && y >0) {
        		  System.out.println("primeiro");
        	  }
        	  else if (0 < x && y > 0) {
        		  System.out.println("segundo");
        	  }
        	  else if (x <0 && y < 0) {
        		  System.out.println("terceiro");
        	  }
        	  else {
        		  System.out.println("quarto");
        	  }
        	  x =sc.nextInt(); 
              y =sc.nextInt();
        }
        
        
        System.out.println("saiu do while ");

        sc.close();  
    }
}

