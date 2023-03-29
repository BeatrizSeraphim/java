package produtoAve;

import java.util.Scanner;

public class Especies {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int domesticos = 1;
		int silvestres = 2;
		int exoticos = 3;
		int opcao = 4;
		
		
		while (true) {
			
		System.out.println("****************************************");
		System.out.println("             1- Doméstico               ");
		System.out.println("             2- Silvestre               ");
		System.out.println("             3- Exótico                 ");
		System.out.println("             4- Sair                    ");
		System.out.println("                                        ");	
		System.out.println("****************************************");		
		System.out.println("      Qual a espécie da sua ave?        ");
		
		leia.nextInt();
		
		
		if(opcao == 4) {
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXX");
			sobre();
			leia.close();
			System.exit(0);

		}
		switch (opcao) {
		case -> 1 
		System.out.println("1- Doméstico");
		System.out.println(": ");
		agencia = leia.nextInt();
		
		}

	}
	}
	private static void sobre() {
		// TODO Auto-generated method stub
		
	}

}
