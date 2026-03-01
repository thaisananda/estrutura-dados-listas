package lista2.Recursiva;

import javax.swing.*;

public class EstRec_Lista2_02 {
	
	public static void main (String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
		
		ControllerEx02 divisaoRec = new ControllerEx02();
		
		int resultado = divisaoRec.divRecursiva(n1,n2);
		
		System.out.println("O resto da divisão é: " + resultado);
	}

}
