package com.danielF.projeto01.classes;

import javax.swing.JOptionPane;

public class CalculadoraSalario {

	public static void main(String[] args) {

		// Classe executavel para calcular impostos aplicados a um salario.

		// objeto descontoSalario possui todos descontos que serão aplicados
		Descontos descontoSalario = new Descontos();

		String salarioB = JOptionPane.showInputDialog("Por favor informe o valor ganho por hora: ");
		descontoSalario.setSalarioHora(Double.parseDouble(salarioB));
		String horasTbD = JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas por dia: ");
		descontoSalario.setHoraDiaTrabalhada(Double.parseDouble(horasTbD));
		String diasTbM = JOptionPane.showInputDialog("Informe a quantidade de dias trabalhados no mês: ");
		descontoSalario.setDiasTrabalhoMes(Double.parseDouble(diasTbM));

		System.out.println("-----------------------------");
		System.out.println(" Calculadora de Salário ");
		System.out.println("Salário Bruto = " + descontoSalario.getCalculoSalario());
		System.out.println("Descontos = " + descontoSalario.getDescontosSalario());
		System.out.println("Salário Liquido = " + descontoSalario.getCalculoSalarioLiquido());
		System.out.println(descontoSalario);
		System.out.println("-----------------------------");
		// .teste
	}

}
