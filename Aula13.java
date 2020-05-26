// Dado um valor de 1 a 7 sendo 1 domingo, imprima se eh dia util ou fim de semana
import java.util.Scanner;
class Aula13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			try {
			    int day = Integer.parseInt(in.next());
			    if(day == 0) {
			        break;
                            }
			    switch(day) {
                                case 1: 
                                    System.out.println("sunday");
				    break;
                                case 2: 
                                    System.out.println("monday");
				    break;
                                case 3: 
                                    System.out.println("tuesday");
				    break;
                                case 4: 
                                    System.out.println("wednesday");
				    break;
                                case 5: 
                                    System.out.println("thursday");
				    break;
                                case 6: 
                                    System.out.println("friday");
				    break;
                                case 7: 
                                    System.out.println("saturday");
				    break;
				default:
				    break;
                            }
			} catch(NumberFormatException e) {
			    System.out.println("inserir apenas numeros de 1 a 7 ou 0 para sair");
			}
		}

	}

}
