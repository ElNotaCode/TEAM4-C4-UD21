package JUnit.TCS21.Calculadora.CalculadoraEstandar.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisaTest {

	Divisa divisa = new Divisa();

	@Test
	public void testEuroLibra() {
		double resultado = divisa.calcularEuroLibra(2.00);
		double esperado = 1.72;
		assertEquals(resultado, esperado);
	}

	@Test
	public void testEuroDolar() {
		double resultado = divisa.calcularEuroDolar(3.00);
		double esperado = 3.15;
		/*
		 * si no ponemos un delta o especificamos todos los decimales esperados en un
		 * double, nos dará error si no ponemos todos los decimales que puede crear un
		 * double, así que tendre que poner un margen de error (delta), de almenos 0.1
		 */
		double delta = 0.01;
		assertEquals(resultado, esperado, delta);
	}

	@Test
	public void testLibraEuro() {
		double resultado = divisa.calcularLibraEuro(1.5);
		double esperado = 1.7;
		double delta = 0.1;
		assertEquals(resultado, esperado, delta);
	}

	@Test
	public void testLibraDolar() {
		double resultado = divisa.calcularLibraDolar(1.00);
		double esperado = 1.23;
		double delta = 0.1;
		assertEquals(resultado, esperado, delta);
	}

	@Test
	public void testDolarEuro() {
		double resultado = divisa.calcularDolarEuro(1.5);
		double esperado = 1.42;
		double delta = 0.1;
		assertEquals(resultado, esperado, delta);
	}

	@Test
	public void testDolarLibra() {
		double resultado = divisa.calcularDolarLibra(8);
		double esperado = 6.48;
		double delta = 0.1;
		assertEquals(resultado, esperado, delta);
	}
}
