package Principal;
import logica.Hombres;
import logica.Mujeres;
import logica.Tasametabolicabasal;

public class Principal {
	public static void main (String[]args) {
		Tasametabolicabasal t;
		t= new Hombres (72,180,21);
		System.out.println (t.calcularTMB());
		
		t= new Mujeres (57,163,19);
		System.out.println (t.calcularTMB());
		
		
		
	}

}
