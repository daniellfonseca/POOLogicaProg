package com.danielF.projeto01.classes;

public class Descontos {

	private double salarioHora;
	private double salarioBruto;
	private double horasTrabalhadas;
	private double valorImpostoRenda;
	private double valorInss;
	private double valorSindicato;
	private double salarioLiquido;
	private double horaDiaTrabalhada;
	private double diasTrabalhoMes;

	public Descontos() {

	}

	public double getHoraDiaTrabalhada() {
		return horaDiaTrabalhada;
	}

	public void setHoraDiaTrabalhada(double horaDiaTrabalhada) {
		this.horaDiaTrabalhada = horaDiaTrabalhada;
	}

	public double getDiasTrabalhoMes() {
		return diasTrabalhoMes;
	}

	public void setDiasTrabalhoMes(double diasTrabalhoMes) {
		this.diasTrabalhoMes = diasTrabalhoMes;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public double getValorImpostoRenda() {
		return valorImpostoRenda;
	}

	public void setValorImpostoRenda(double valorImpostoRenda) {
		this.valorImpostoRenda = valorImpostoRenda;
	}

	public double getValorInss() {
		return valorInss;
	}

	public void setValorInss(double valorInss) {
		this.valorInss = valorInss;
	}

	public double getValorSindicato() {
		return valorSindicato;
	}

	public void setValorSindicato(double valorSindicato) {
		this.valorSindicato = valorSindicato;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public double getCalculoHoras() {
		this.horasTrabalhadas = getHoraDiaTrabalhada() * getDiasTrabalhoMes();

		return horasTrabalhadas;
	}

	public double getCalculoSalario() {
		this.salarioBruto = getSalarioHora() * getHorasTrabalhadas();
		return salarioBruto;
	}

	public double getDescontosSalario() {
		double totalDescontos = 0;

		// se salario > 2500 : true
		if (getSalarioBruto() > 2500) {
			valorImpostoRenda = getSalarioBruto() * 0.11;
			valorInss = getSalarioBruto() * 0.08;
			valorSindicato = getSalarioBruto() * 0.05;
			totalDescontos = valorImpostoRenda + valorInss + valorSindicato;
		} else {
			valorInss = getSalarioBruto() * 0.08;
			valorSindicato = getSalarioBruto() * 0.05;
			totalDescontos = valorInss + valorSindicato;
		}

		return totalDescontos;
	}

	public double getCalculoSalarioLiquido() {
		salarioLiquido = getSalarioBruto() - getDescontosSalario();
		return salarioLiquido;
	}

	@Override
	public String toString() {
		return "Salario Bruto= " + salarioBruto + ", Horas Trabalhadas= " + horasTrabalhadas + ", Valor Imposto Renda= "
				+ valorImpostoRenda + ", Valor imposto INSS= " + valorInss + ", Valor imposto Sindicato= "
				+ valorSindicato + ", Salario Liquido= " + salarioLiquido + "  ";
	}

}
