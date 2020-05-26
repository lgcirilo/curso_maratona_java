/*
  Calcular imposto conforme regra abaixo
  imposto:
  salario < 1000 5%
  salario >= 1000 && salario < 2000 10%
  salario >= 2000 && salario < 4000 15%
  salario > 4000 20%
*/

class Aula11 {
    private float salario;

    
    Aula11(float salario) {
	this.setSalario(salario);	
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
	return this.salario;
    }

    private float calculaImposto() {
        //same as nested ifs below using ternary operator
	//return salario < 1000 ? salario * 0.05f : salario < 2000 ? salario * 0.10f : salario < 4000 ? salario * 0.15f : salario * 0.20f;

	float imposto = 0;
        if(this.salario < 1000) {
	    imposto = salario * 0.05f;        
	} else if(this.salario < 2000) {
	    imposto = salario * 0.10f;
	} else if(this.salario < 4000) {
            imposto = salario * 0.15f;
        } else {
	    imposto = salario * 0.20f;
        }

        return imposto;
    }

    public static void main(String[] args) {

	float[] salaries = {999, 1000, 1500, 1999, 2000, 3125, 3999, 4000, 4500};
	for(float salary: salaries) {
		Aula11 p = new Aula11(salary);
        	System.out.printf("%.2f %n", p.calculaImposto());
	}
    }
}
