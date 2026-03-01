/*
 OBJETIVO: Construir uma função recursiva que receba um número inteiro posi􀆟vo ímpar N e retorne o fatorial duplo desse número
 PROGRAMADORA: THAIS ANANDA
 DATA DE CRIAÇÃO: 01/03/2026
 */

package lista2.Recursiva.exercicio4;

import javax.swing.*;

public class EstRec_Lista2_04 {
	
	public static void main (String[] args) {
		
		int n;

        // repete até o usuário digitar corretamente
        do {
           
        	n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro POSITIVO e ÍMPAR:"));

            if (n <= 0 || n % 2 == 0) {
                
            	JOptionPane.showMessageDialog(null, "Valor inválido! Tente novamente.");
            
            }

        } while (n <= 0 || n % 2 == 0);
	
        ControllerEx04 c = new ControllerEx04();

        int resultado = c.fatorialDuplo(n);

        System.out.println("Fatorial duplo de " + n + " é: " + resultado);
        
	}

}
