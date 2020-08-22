package com.lgcirilo.javacore.enums.classes;

// enums podem ser declaradas em arquivos separados ou diretamente na classe que as utilizarah (da mesma forma que se faz com inner classes)
public enum Personalidade {
    /*
    constant specific class body: sobrecreve cogigo somente para a constante a qual esta relacionada. No exemplo abaixo o metodo getId retorna um valor diferente para a constante PESSOA_JURIDICA
    */ 
    PESSOA_FISICA(1), PESSOA_JURIDICA(2){
        public String getId() {
            return "B";
        }
    };

    /* 
    assim como classes, enums podem ter atributos e metodos (inclusive construtores)
    atributor e metodos devem vir sempre depois das constantes da enum
    */
    private int personalidade;   

    /*
    o construtor de uma enum nao pode ser declarado como public pois nao pode ser chamado diretamente.
    se ha um construtor eh preciso definir os valores nas constantes <<PESSOA_FISICA(1), PESSOA_JURIDICA(2)>>
    */
    Personalidade(int personalidade) {
        this.personalidade = personalidade;
    }

    public String getId() {
        return "A";
    }

    public int getPersonalidade() {
        return this.personalidade;
    }

    
}

