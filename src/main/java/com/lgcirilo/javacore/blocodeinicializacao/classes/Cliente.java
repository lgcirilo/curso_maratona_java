package com.lgcirilo.javacore.blocodeinicializacao.classes;

public class Cliente { 
    // 1 - Alocado espaco na memoria para o objeto que serah criado
	// 2 - casa atributo de classe eh criado e inicializado com seus valores default ou valores explicitos
	// 3 - bloco de inicializacao eh executado
	// 4 - o construtor eh executado
	private int[] parcelas = {1,2,3,4,5,6,7,8,9,10,11,12};

    // as boas praticas preconizam que o bloco de inicializacao deve ser criado antes do construtor,
	// porem o compilador aceita que seja escrito em qualquer parte do codigo. Serah sempre executado antes
	// do construtor. Para criar um bloco de inicializacao basta escrever o codigo entre chaves como abaixo.
	{
        System.out.println("Este eh o bloco de inicializacao");
	}

	public Cliente() {
        for(int parcela: this.parcelas) {
            System.out.print(parcela + " ");
		}
	}

	public int[] getParcelas() {
        return this.parcelas;
	}

	public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
	}

}
