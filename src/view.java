import javax.swing.JOptionPane;

import controller.ConverteController;

public class view {
	
	public static void main(String[] args) {
        ConverteController c = new ConverteController();

        try {
            String entrada = JOptionPane.showInputDialog("Digite um número decimal entre 0 e 1000:");
            int decimal = Integer.parseInt(entrada);

            if (decimal < 0 || decimal > 1000) {
                JOptionPane.showMessageDialog(null, "Digite um valor entre 0 e 1000.");
                return;
            }

            String binario = c.decToBin(decimal);

            JOptionPane.showMessageDialog(null, "Decimal: " + decimal + "\nBinário: " + binario);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número inteiro válido.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
