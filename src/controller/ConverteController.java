package controller;

import lista1.pilhas.exercicio3a.PilhaInt;

public class ConverteController {
	
	public ConverteController() {
        super();
    }

    public String decToBin(int decimal) throws Exception {
        if (decimal < 0 || decimal > 1000) {
            throw new Exception("O número deve estar entre 0 e 1000.");
        }

        if (decimal == 0) {
            return "0";
        }

        PilhaInt p = new PilhaInt();

        while (decimal > 0) {
            int resto = decimal % 2;
            p.push(resto);
            decimal = decimal / 2;
        }

        String binario = "";

        while (!p.isEmpty()) {
            binario += String.valueOf(p.pop());
        }

        return binario;
    }

}
