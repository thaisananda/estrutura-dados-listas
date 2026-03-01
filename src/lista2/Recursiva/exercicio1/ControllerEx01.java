package lista2.Recursiva.exercicio1;

public class ControllerEx01 {
	
	public ControllerEx01() {
		super();
	}
	
	public int multiplicacaoRecursiva(int a, int b) {
        
		if (b == 0) {
            return 0;
            
        }
        return a + multiplicacaoRecursiva(a, b - 1);
    }

}
