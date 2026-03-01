package lista2.Recursiva;

public class ControllerEx04 {
	
	public ControllerEx04() {
		
		super();
		
	}
	
	public int fatorialDuplo(int n) {

	    // caso base
	    if (n == 1) {
	        return 1;
	    }

	    // chamada recursiva
	    return n * fatorialDuplo(n - 2);

     }
	
}
