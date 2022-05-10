package JUnit.TCS21.Calculadora.CalculadoraEstandar.dto;

public class Divisa {

	// Atributos de clase
	private double valor1;
	private double valor2;

	public double calcularEuroLibra(double valor1) {
		return valor1 * 0.86;
	}

	public double calcularEuroDolar(double valor1) {
		return valor1 * 1.05;
	}

	public double calcularLibraEuro(double valor1) {
		return valor1 * 1.17;
	}

	public double calcularLibraDolar(double valor1) {
		return valor1 * 1.23;
	}

	public double calcularDolarEuro(double valor1) {
		return valor1 * 0.95;
	}

	public double calcularDolarLibra(double valor1) {
		return valor1 * 0.81;
	}

	
	// Constructores

}
