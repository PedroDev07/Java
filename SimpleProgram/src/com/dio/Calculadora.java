package com.dio;

public class Calculadora {

	
	
	public static void soma(double primeiroNumero, double segundoNumero) {
		double resultado = primeiroNumero + segundoNumero;
		System.out.println("O primeiro numero é igual a: " +primeiroNumero + ". O segundo número é igual a: "+ segundoNumero + ". E a soma é igual a: "+resultado);		
	}

	public static void subtracao(double primeiroNumero, double segundoNumero) {
		double resultado = primeiroNumero - segundoNumero;
		System.out.println("O primeiro numero é igual a: " +primeiroNumero + ". O segundo número é igual a: "+ segundoNumero + ". E a subtracao é igual a: "+resultado);		
	}
public static void divisao(double primeiroNumero, double segundoNumero) {
		double resultado = primeiroNumero / segundoNumero;
		System.out.println("O primeiro numero é igual a: " +primeiroNumero + ". O segundo número é igual a: "+ segundoNumero + ". E a divisão é igual a: "+resultado);		

}
public static void multiplicacao(double primeiroNumero, double segundoNumero) {
	double resultado = primeiroNumero * segundoNumero;
	System.out.println("O primeiro numero é igual a: " +primeiroNumero + ". O segundo número é igual a: "+ segundoNumero + ". E a multiplicação é igual a: "+resultado);		
}


}
