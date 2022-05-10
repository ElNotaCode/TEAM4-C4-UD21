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
	
	//String cambioDivisa(String lblValue,String divisa1, String divisa2)
	@Test //TODO añadir trim a la funcion
	public void testCambioDivisa() {
		String resultado = controlador.cambioDivisa("3.00","Euro","Dolar");
		String esperado = "3,15";
		assertEquals(resultado, esperado);
	}
	
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
