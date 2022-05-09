package JUnit.TCS21.Calculadora.CalculadoraEstandar.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class controllerTest {
	
	Controller controlador = new Controller();
	
	@Test
	public void testMontarLblCantidad() {
		String resultado = controlador.montarLblCantidad("10","5");
		String esperado = "105";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testCantidadConvertir() {
		double resultado = controlador.cantidadConvertir("10,5");
		double esperado = 10.5;
		assertEquals(resultado, esperado);
	}
	
	//TODO: testCambioDivisa
	
	@Test
	public void testConvertidoToString() {
		String resultado = controlador.convertidoToString(10.5);
		String esperado = "10,5";
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testBorrar() {
		String resultado = "10,5";
		resultado = controlador.borrar();
		String esperado = "";
		assertEquals(resultado, esperado);
	}
}
