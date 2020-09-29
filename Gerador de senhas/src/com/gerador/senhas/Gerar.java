package com.gerador.senhas;

import java.util.Random;

public class Gerar {

	public static void main(String[] args) {
		gerar();

	}
	
	public static void gerar() {
		String[] numerosLetrasSimbolos = new String[] {"a", "b", "c", "1", "2", "3", "@"};
		Random r = new Random();
		Integer nls1 = r.nextInt(numerosLetrasSimbolos.length);
		Integer nls2 = r.nextInt(numerosLetrasSimbolos.length);
		Integer nls3 = r.nextInt(numerosLetrasSimbolos.length);
		Integer nls4 = r.nextInt(numerosLetrasSimbolos.length);
		Integer nls5 = r.nextInt(numerosLetrasSimbolos.length);
		Integer nls6 = r.nextInt(numerosLetrasSimbolos.length);
		Integer nls7 = r.nextInt(numerosLetrasSimbolos.length);
		
		String gerar = numerosLetrasSimbolos[nls1] + numerosLetrasSimbolos[nls2] + numerosLetrasSimbolos[nls3] + numerosLetrasSimbolos[nls4] + numerosLetrasSimbolos[nls5] + numerosLetrasSimbolos[nls6] + numerosLetrasSimbolos[nls7];

		System.out.println("Senha: " + gerar);
	}

}
