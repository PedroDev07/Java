package com.dio;

public class Emprestimos {

	public static int getDuasParcelas(){
		return 2;
	}
	public static int getTresParcelas(){
		return 3;
	}
	
	public static double getTaxaDuasParcelas(){
		return 0.3;
	}
	public static double getTaxaTresParcelas(){
		return 0.45;
	}
	
	public static void calcular (double valor, double parcelas) {
		
		if (parcelas == 2 ) {
			double valorFinal = valor + (valor * getTaxaDuasParcelas());
			System.out.println("Valor da parcela com as taxas de juro �: " + valorFinal);
		}
		else if (parcelas == 3) {
			double valorFinal = valor + (valor * getTaxaTresParcelas());
			System.out.println("Valor da parcela com as taxas de juro �: " + valorFinal);
		}
		else {
			System.out.println("Quantidades de parcelas inv�lidas");
		}	
			
		}		
	}	

