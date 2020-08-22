// ordem de execucao da jvm
// 1 - Espaco em memoria eh alocado para o objeto 
// 2 - Cada um dos atributos do objeto eh criado e inicializado com os valores default
// 3 - O construtor da superclasse eh chamado 
// 4 - A inicializacao dos atributos via declaracao e o codigo do bloco de inicialiacao 
//     da superclasse sao executados na ordem em que aparecem (blocos estaticos tem precedencia)
// 5 - O codigo do construtor da superclasse eh chamado
// 6 - Passo 4 para a subclasse eh executado
// 7- O codiga do construtor da classe eh executado
package com.lgcirilo.javacore.heranca.classes;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario() { }

    public Funcionario(String nome) {
        super(nome);
    }

    public void setSalario(double salario){ 
        this.salario = salario;
    } 

    public double getSalario() {
        return this.salario;
    }
    
    public void imprimeReciboPagamento() {
        System.out.println("eu " + super.nome +  " recebi pagamento de " + this.salario);
    }

    @Override
    public String toString() {
        return super.toString() + " salario: " + this.salario;
    }
} 
