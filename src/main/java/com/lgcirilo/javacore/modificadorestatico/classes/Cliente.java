package com.lgcirilo.javacore.modificadorestatico.classes;

public class Cliente { 
	private static int[] parcelas;

	// um bloco de inicializacao estatico e executado apenas uma vez, nao importando quantos objetos sejam instanciados para a classe.

	static {
        System.out.println("Este eh o bloco de inicializacao (estatico)");
		int n = 15;
		parcelas = new int[n];
		for(int i = 1; i <= n; i++) {
            parcelas[i - 1] = i;
		}
	}
	
	// multiplos bloco de inicializacao sao possiveis. sao executados na ordem em que foram declarados
	{
        System.out.println("segundo bloco de inicializacao (nao estatico).");
	}

	// blocos de inicializacao estaticos sao executados antes dos blocos de inicializacao nao estticos
	static {
        System.out.println("terceiro bloco de inicializacao (estatico).");
	}

	public Cliente() {}

	public static int[] getParcelas() {
        return parcelas;
	}
}
