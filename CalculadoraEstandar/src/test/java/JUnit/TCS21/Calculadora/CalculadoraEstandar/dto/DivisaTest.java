package JUnit.TCS21.Calculadora.CalculadoraEstandar.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisaTest {

	Divisa divisa = new Divisa();
	
	@Test
	public void testEuroLibra() {
		
		double resultado = divisa.calcularEuroLibra(2.00);
		double esperado = 1.71;
		assertEquals(2.00, 1.71);
	}
}
