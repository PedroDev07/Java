package com.dio;

public class Calculadora {

	
	
	public static void soma(double primeiroNumero, double segundoNumero) {
		double resultado = primeiroNumero + segundoNumero;
		System.out.println("O primeiro numero � igual a: " +primeiroNumero + ". O segundo n�mero � igual a: "+ segundoNumero + ". E a soma � igual a: "+resultado);		
	}

	public static void subtracao(double primeiroNumero, double segundoNumero) {
		double resultado = primeiroNumero - segundoNumero;
		System.out.println("O primeiro numero � igual a: " +primeiroNumero + ". O segundo n�mero � igual a: "+ segundoNumero + ". E a subtracao � igual a: "+resultado);		
	}
public static void divisao(double primeiroNumero, double segundoNumero) {
		double resultado = primeiroNumero / segundoNumero;
		System.out.println("O primeiro numero � igual a: " +primeiroNumero + ". O segundo n�mero � igual a: "+ segundoNumero + ". E a divis�o � igual a: "+resultado);		

}
public static void multiplicacao(double primeiroNumero, double segundoNumero) {
	double resultado = primeiroNumero * segundoNumero;
	System.out.println("O primeiro numero � igual a: " +primeiroNumero + ". O segundo n�mero � igual a: "+ segundoNumero + ". E a multiplica��o � igual a: "+resultado);		
}


}
