package lista3.Recursiva.exercicio3;

public class ControllerEx03 {
	
	public ControllerEx03() {
		
		super();
		
	}

    public String inverte(String s) {

        // Condição de parada:
        // quando a string está vazia ("") ou tem 1 caractere, ela já está "invertida".
        if (s.length() <= 1) {
            return s;
        }

        // Como escrever a função para o termo n em função do termo anterior:
        // f(s) = f(s.substring(1)) + s.substring(0,1)
        //
        // Explicação:
        // - s.substring(1) pega a string SEM o primeiro caractere
        // - s.substring(0,1) pega APENAS o primeiro caractere
        // - ao voltar da recursão, colocamos o primeiro caractere no final
        return inverte(s.substring(1)) + s.substring(0, 1);
    }
}