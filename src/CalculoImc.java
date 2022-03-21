import java.util.Locale;
import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = input.nextLine();
		
		System.out.println("----SEXO----");
		System.out.println("Digite [1] - Masculino");
		System.out.println("Digite [2] - Feminino");
		int sexo = input.nextInt();
		
		
		System.out.print("Digite sua altura: ");
		double alt = input.nextDouble();
		
		System.out.print("Digite seu peso: ");
		double peso = input.nextDouble();
		double imc = peso /(alt * alt);
		System.out.printf("Seu Índice de Massa Corporal (IMC) é: %.3fkg/m² \n",imc);
	
		switch (sexo) {
		
		case 1: 
			if (imc <= 20.5) {
				System.out.println("Você está abaixo do peso!");
				
			}else if (imc <= 26.4) {
				System.out.println("Você está no peso normal!");
				
			}else if (imc <= 27.8) {
				System.out.println("Você está marginalmente acima do peso!");
							
			}else if (imc <= 31.1) {
				System.out.println("Você está acima do peso!");
				
			}else if (imc > 31.1) {
				System.out.println("Você é obeso!");
			
			
			}	
		break;
		case 2:
			if (imc <= 19.1) {
				System.out.println("Você está abaixo do peso!");
				
			}else if (imc <= 25.8) {
				System.out.println("Você está no peso normal!");
				
			}else if (imc <= 27.3) {
				System.out.println("Você está marginalmente acima do peso!");
				
				
			}else if (imc <= 32.3) {
				System.out.println("Você está acima do peso!");
				
			}else if (imc > 32.3) {
				System.out.println("Você é obeso!");
			
			break;
			
			}	
		}
		input.close();
		
	}

}
