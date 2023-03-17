package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###,#00.00");
		float numero1,numero2,numero3,numero4,diferenca;
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite o seu primeiro numero: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o seu segundo numero: ");
		numero2 = leia.nextFloat();
		
		System.out.println("Digite o seu terceiro numero: ");
		numero3 = leia.nextFloat();
		
		System.out.println("Digite o seu quarto numero: ");
		numero4 = leia.nextFloat();
		
		diferenca = (numero1 * numero2)-(numero3 * numero4);
		System.out.println("A diferença é de: " + diferenca);
		
		
		
		
		
		
	}
	

}
