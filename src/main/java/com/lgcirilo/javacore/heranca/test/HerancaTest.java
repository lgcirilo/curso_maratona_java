package com.lgcirilo.javacore.heranca.test;

import com.lgcirilo.javacore.heranca.classes.Pessoa;
import com.lgcirilo.javacore.heranca.classes.Endereco;
import com.lgcirilo.javacore.heranca.classes.Funcionario;
import com.lgcirilo.javacore.heranca.classes.TerceiraClasse; 

public class HerancaTest {
    public static void main(String[] args) {
        Endereco end = new Endereco();
        /*
        Pessoa p = new Pessoa();
        p.setNome("Yoda");
        p.setCpf("12345");
        end.setBairro("the cave");
        end.setRua("no street");
        p.setEndereco(end);*/
        // System.out.println(p.toString());

        Funcionario f = new Funcionario();
        f.setNome("Luke");
        f.setCpf("00000");
        f.setEndereco(end);
        f.setSalario(0.1);

        System.out.println(f.toString());


        /*
        TerceiraClasse tc = new TerceiraClasse();
        tc.setNome("droid");
        tc.setCpf("droids have no cpf");
        tc.setEndereco(end);
        tc.setSalario(0);
        tc.setText("droid's text");*/

        // System.out.println(tc.toString());

        //f.imprimeReciboPagamento();
        
        
    }
}

