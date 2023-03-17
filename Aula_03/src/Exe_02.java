import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero = 0,somapares= 0, somaimpares = 0;
	
		
		for(int contador = 1; contador <=10; contador ++) {
			System.out.println("Digite o " + contador + " numero: ");
			numero = leia.nextInt();
			
			if(numero%2 == 0) 
				 somapares ++;
				
			else
				  somaimpares ++;
				
				
		}
		
		leia.close();
		
		System.out.println("Total de números pares: " + somapares);
		System.out.println("Total de números ímpares: " + somaimpares);
	}
		
	}




