package lista2.pilhas.exercicio3.view;

import javax.swing.*;

import lista2.pilhas.exercicio3.controller.FatController;

public class Principal {

	public static void main(String[] args) {
		
		
		//int numero = 0;
		
		int resultado = 0;
		
		FatController f1 = new FatController();
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		while(numero < 0 || numero > 10) {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um novo número: "));
			
		}
		
		resultado = f1.fatorial(numero);
		
		System.out.println("O fatorial de "+numero+" é: "+resultado);
		
		
	}
}

