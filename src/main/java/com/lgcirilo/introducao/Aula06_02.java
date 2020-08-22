package com.lgcirilo.introducao;

class Aula06_02 {
    private String name;
    private float salary;
    char sex;
    int age;
    String maritalStatus;

    Aula06_02() {
    	this.name = "Gustavo";
        this.salary = 10000;
        this.sex = 'M';
	this.age = 43;
	this.maritalStatus = "Married";
    }

    public String getName() {
    	return this.name;
    }
    
    
    public float getSalary() {
    	return this.salary;
    }

    public char getSex() {
    	return this.sex;
    }

    public int getAge() {
    	return this.age;
    }

    public String getMaritalStatus() {
    	return this.maritalStatus;
    }

    public static void main(String[] args) {
	Aula06_02 person = new Aula06_02();
	System.out.println("O trabalhador(a) " + person.getName() + 
                           " do sexo " + person.getSex() + 
                           ", idade " + person.getAge() + 
                           ", estado civil " + person.getMaritalStatus() + 
                           " e salario " + person.getSalary() + " encontra-se empregado neste estabelecimento.");
    }
}
