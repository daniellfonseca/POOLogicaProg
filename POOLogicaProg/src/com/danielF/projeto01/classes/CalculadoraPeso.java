package com.danielF.projeto01.classes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraPeso {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat(".00");

		String nome;
		double pesoPeixes;
		double pesoPiracemaSp;
		double resultadoExcesso;
		double resultadoMulta;
		double valorKgMulta;

		System.out.println("--------------------------------------------");
		System.out.println("	Calculo Piracema");
		System.out.println("Informe o nome do pescador: ");
		nome = scan.nextLine();
		System.out.println("--------------------------------------------");
		System.out.println(
				"Informe, de acordo com a Lei nª321 do estado de SP, a quantidade, em kg, permita em posse durante a Piracema: ");
		pesoPiracemaSp = scan.nextDouble();
		System.out.println(
				" Informe o valor, de acordo com a Lei nº123 do estado de SP, da multa em R$ por kg excedente em posse: ");
		valorKgMulta = scan.nextDouble();
		System.out.println("--------------------------------------------");
		System.out.println("	Informe a quantidade de Kg de peixes em posse: ");
		pesoPeixes = scan.nextDouble();

		if (pesoPeixes > pesoPiracemaSp) {
			resultadoExcesso = pesoPeixes - pesoPiracemaSp;
			resultadoMulta = resultadoExcesso * valorKgMulta;

			System.out.println("Nome: " + nome);
			System.out.println("Peso de Peixes em posse: " + pesoPeixes);
			System.out.println("Peso Permitido em posse: " + pesoPiracemaSp);
			System.out.println("Peso excedente:" + formatador.format(resultadoExcesso));
			System.out.println("Valor da Multa (/kg): " + valorKgMulta);
			System.out.printf("Total a pagar: " + formatador.format(resultadoMulta));

		} else {
			System.out.println(" ZERO /n Não houve quantidade de kg excedentes em posse.");
		}

		System.out.println("");
		System.out.println("--------------------------------------------");

	}

}
