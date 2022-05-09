package JUnit.TCS21.Calculadora.CalculadoraEstandar.controller;

public class Controller {

	//getLblCantidad
	public String getLblCantidad(String value) {
		return value;
	}
	
	//montarLblCantidad lo que hace es coger el getValue de lbl y de el boton pulsado y los concatena
		public String montarLblCantidad(String lblValue, String getTextBoton) {
			return lblValue+getTextBoton;
		}
	//String lblCantidad = "";
	
	//metodo insertarCantidadConvertir(String value) que pasa el valor del lblCantidad a double
	public double cantidadConvertir(String lblValue) {
		//toDouble
		double cantidadConvertir = Double.parseDouble(lblValue);
		return cantidadConvertir;
	}
	
	//select divisas
	//cambioDivisas(String value,String value2) lo que va a hacer es coger los values del select divisa1 y divisa2 y procesará la info
	public void cambioDivisa1(String divisa1, String divisa2) {
		
		//no se si sería mejor transformar las string y pasarlas al metodo de Divisas
		
		switch (divisa1) {
		case "Europa - Euro":
			cambioDivisa2(divisa2);
			break;
		case "Estados Unidos - Dólar":
			cambioDivisa2(divisa2);
			break;
		case "Reino Unido - Libras":
			cambioDivisa2(divisa2);
			break;

		default:
			//TODO: pasar un mensaje de error
			break;
		}
		
	}
	
	//TODO: terminar
	public void cambioDivisa2(String divisa2) {
		switch (divisa2) {
		case "Europa - Euro":
			//metodo calcular 
			break;
		case "Estados Unidos - Dólar":
			
			break;
		case "Reino Unido - Libras":
			
			break;

		default:
			//TODO:pasar un mensaje de error
			break;
		}
	}
	
	//lblConvertido cantidad una vez procesada
	//pasa de double a string
	public String getConvertido(double value) {
		
		return Double.toString(value);
	}
}
