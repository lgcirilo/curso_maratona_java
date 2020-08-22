package com.lgcirilo.javacore.polimorfismo.classes;

public class RelatorioPagamento {
    public void relatorioPagamento(Funcionario funcionario) {
        double extra = 0;
        if (funcionario instanceof Gerente) {
            Gerente g = (Gerente) funcionario;
            extra = g.getPnl();
        }
        if (funcionario instanceof Vendedor) {
            Vendedor v = (Vendedor) funcionario;
            extra = v.getTotalVendas();
        }
        funcionario.calcularPagamento();
        System.out.println("Funcionario: " + funcionario.getNome() + 
                           ", Pagamento: " + funcionario.getSalario() +
                           ", extra=" + extra);
   }
}
