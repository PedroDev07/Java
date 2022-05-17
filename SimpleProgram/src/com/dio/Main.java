package com.dio;

public class Main {

	public static void main (String[] args) {
		
		System.out.println("Exercicio da calculadora");
		Calculadora.soma(2, 2);
		Calculadora.subtracao(3, 2);
		Calculadora.divisao(10, 2);
		Calculadora.multiplicacao(3, 3);
	
		System.out.println("--------------------");
		System.out.println("Exercicio da Mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(15);
		Mensagem.obterMensagem(20);
		
		System.out.println("--------------------");
		System.out.println("Exercicio dos juros");
		Emprestimos.calcular(100, 2);
	
	}
	
	
	
}
