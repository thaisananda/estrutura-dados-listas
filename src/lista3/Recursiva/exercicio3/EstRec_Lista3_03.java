package lista3.Recursiva.exercicio3;

import javax.swing.JOptionPane;

public class EstRec_Lista3_03 {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite uma palavra/texto:");

        ControllerEx03 c = new ControllerEx03();
        String invertida = c.inverte(texto);

        JOptionPane.showMessageDialog(null, "Invertida: " + invertida);
    }
}