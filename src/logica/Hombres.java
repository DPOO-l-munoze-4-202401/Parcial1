package logica;

public class Hombres extends Tasametabolicabasal {

	public Hombres(double peso, double altura, int edad) {
		super(peso, altura, edad);
	}

	@Override
	public double calcularTMB() {
		return 88.362+(13.397*this.peso)+(4.799*this.altura)-(5.677*this.edad);
	}

}
