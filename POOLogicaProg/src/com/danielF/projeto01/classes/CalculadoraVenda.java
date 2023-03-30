package com.danielF.projeto01.classes;

import java.util.Scanner;

public class CalculadoraVenda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		double area;
		double valorLata;
		double rendimento;
		double valorTotal;
		double litragem;
		double qtdLatas;
		boolean calcRendimento = true;

		System.out.println("--------------------------");
		System.out.println("Bem vindo a Lojas de Tintas Mundial");
		System.out.println("Qual o tamanho (m²) da área a ser pintada: ");
		area = scan.nextInt();
		System.out.println("Valor da lata de tinta: ");
		valorLata = scan.nextDouble();

		if (calcRendimento) {
			System.out.println("Por favor, informe quantos litros a lata de tinta possui: ");
			litragem = scan.nextInt();

			// Regra de Negócio = cada litro de tinta rende 3 metros²
			rendimento = litragem * 3;

			// quantidade de latas
			qtdLatas = area / rendimento;
			valorTotal = qtdLatas * valorLata;
			System.out.println("Rendimento da lata informada: " + rendimento + " metros²");
			System.out.println("Quantidade de latas necessárias: " + qtdLatas);
			System.out.println("Valor total da compra: R$" + valorTotal);
		}

		System.out.println("Volte Sempre!");
		System.out.println("--------------------------");

	}

}
