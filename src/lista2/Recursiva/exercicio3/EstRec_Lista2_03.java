/*
 OBJETIVO: Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quantidade de números pares existentes no vetor.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 01/03/2026
 */

package lista2.Recursiva.exercicio3;

import javax.swing.JOptionPane;

public class EstRec_Lista2_03 {
	
	public static void main(String[] args) {
		
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));

        int[] vetor = new int[tamanho];

        // preenchendo o vetor
        for (int i = 0; i < tamanho; i++) {
        	
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número natural diferente de zero:"));
        }

        ControllerEx03 c = new ControllerEx03();

        int resultado = c.contaPares(vetor, vetor.length);

        System.out.println("Quantidade de números pares: " + resultado);
    }

}
