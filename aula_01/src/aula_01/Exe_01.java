package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		float salario,abono,novo_Salario;
		String nome;

		
		System.out.println("Digite seu nome:");
		nome = leia.nextLine();
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite seu abono: ");
		abono = leia.nextFloat();
		
		novo_Salario = salario + abono;
		System.out.println("Seu novo salário é: " + novo_Salario);
		
		leia.close();
	}

}
