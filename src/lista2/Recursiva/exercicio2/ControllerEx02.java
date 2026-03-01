package lista2.Recursiva.exercicio2;

public class ControllerEx02 {
	
	public ControllerEx02() {
		super();
	}
	
	public int divRecursiva(int dividendo, int divisor) {
		
		if(dividendo < divisor) {
			
			return dividendo;
		}
		
		return divRecursiva(dividendo - divisor, divisor);
	}

}
