package exercicio;

import java.util.Scanner;

public class Emprestimo {
	
	public void calculaEmp() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor:");
		Double preco = scanner.nextDouble(); 
		
		System.out.println("Digite o tanto de parcelas:");
		int parcelas = scanner.nextInt();
		
		double calculo = preco / parcelas;
		
		
		
		if(parcelas >= 6) {
			double taxa = calculo + 5;
			System.out.println("Voc� ir� pagar R$"+ taxa +" por m�s");
		}else if(parcelas <= 5){
			double taxa = calculo + 2;
			System.out.println("Voc� ir� pagar R$"+ taxa +" por m�s");
		}
	}
	
}
