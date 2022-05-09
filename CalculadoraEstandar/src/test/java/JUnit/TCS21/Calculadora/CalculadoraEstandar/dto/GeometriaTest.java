package JUnit.TCS21.Calculadora.CalculadoraEstandar.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeometriaTest {
	Geometria geometria = new Geometria(0);
	
	@Test
	/* Creamos un método para testear cada bloque
	 * por Conventions le ponemos test+NombreFuncion
	 */
	public void testAreaCuadrado() {
		/* Comprobamos con una prueba el resultado de la funcion
		 * y la comparamos con un resultado calculado a mano*/ 
		int resultado = geometria.areacuadrado(2);
		int esperado = 4;
		int delta = 1;
		/* delta será el margen de error bidireccional, en este caso 1 */
		assertEquals(esperado, resultado, delta);
	}
	
	@Test
	public void testAreaCirculo() {
		double resultado = geometria.areaCirculo(3);
		
	}
	
	
	
}
