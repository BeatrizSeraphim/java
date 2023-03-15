package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###,#00.00");
		float salario_Bruto,adicional_Noturno,horas_Extras,descontos,salario_Liquido;
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite o seu Salário Bruto: ");
		salario_Bruto = leia.nextFloat();
		
		System.out.println("Digite o seu Adicional Noturno: ");
		adicional_Noturno = leia.nextFloat();
		
		System.out.println("Digite as suas Horas Extras: ");
		horas_Extras = leia.nextFloat();
		
		System.out.println("Digite os seus Descontos: ");
		descontos = leia.nextFloat();
		
		salario_Liquido = (salario_Bruto+adicional_Noturno+(horas_Extras * 5) - descontos);
		System.out.println("O seu Salário Liquido é: " + salario_Liquido);
	}

}
