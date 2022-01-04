package exercicio;

import java.util.Scanner;

public class Aplication {
	
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		
		//Calculos - Soma
		double soma = calculadora.soma(1.5,1.5);
		System.out.println("Soma" + soma);
		
		//Calculos - Subtração	
		double subtrai = calculadora.subtrai(23, 10);
		System.out.println("Subtração" + subtrai);
		
		//Calculos - Multiplicação
		double multiplica = calculadora.multiplica(5, 5);
		System.out.println("Multiplicação" + multiplica);
		
		//Calculos - Divisão
		double divide = calculadora.divide(10, 2);
		System.out.println("Divisão" + divide);
		
		Hora hora = new Hora();
		
		hora.dizHora(5);
		hora.dizHora(15);
		hora.dizHora(20);
		
		Emprestimo calcula = new Emprestimo();
		
		calcula.calculaEmp();
		
		
	}
}
