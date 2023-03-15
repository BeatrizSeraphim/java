package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###,#00.00");
		float nota1,nota2,nota3,nota4,media;
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a sua primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a sua segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a sua quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4) /4;
		System.out.println("A sua Média final é: " + media);
		
		
		
		
	}

}
