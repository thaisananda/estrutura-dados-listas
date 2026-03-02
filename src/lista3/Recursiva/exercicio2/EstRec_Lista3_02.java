package lista3.Recursiva.exercicio2;

import javax.swing.JOptionPane;

public class EstRec_Lista3_02 {

    public static void main(String[] args) {

        int numero;
        int digito;

        // validação do número (10 a 999999) na main
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro de 10 a 999999:"));
        
        } while (numero < 10 || numero > 999999);

        // validação do dígito (0 a 9) na main
        do {
            digito = Integer.parseInt(JOptionPane.showInputDialog("Digite um dígito (0 a 9) para procurar:"));
        } while (digito < 0 || digito > 9);

        ControllerEx02 c = new ControllerEx02();
        int qtd = c.contaOcorrencias(numero, digito);

        JOptionPane.showMessageDialog(null,"O dígito " + digito + " aparece " + qtd + " vez(es) em " + numero + ".");
    }
}