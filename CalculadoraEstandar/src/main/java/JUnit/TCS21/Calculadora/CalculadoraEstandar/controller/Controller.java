package JUnit.TCS21.Calculadora.CalculadoraEstandar.controller;

import JUnit.TCS21.Calculadora.CalculadoraEstandar.dto.Divisa;

public class Controller {
	
	Divisa divisa = new Divisa();
	
	//recoger los datos de el add event listener y actualizar el label de CANTIDAD
	//montarLblCantidad lo que hace es coger el getValue de lbl y de el boton pulsado y los concatena
		public String montarLblCantidad(String lblValue, String getTextBoton) {
			return lblValue+getTextBoton;
		}
	
	//recoger los datos de el add event listener btn CALCULAR y pasar el label de CANTIDAD a un DOUBLE para el metodo
	//metodo insertarCantidadConvertir(String value) que pasa el valor del lblCantidad a double
	public double cantidadConvertir(String lblValue) {
		//toDouble
		double cantidadConvertir = Double.parseDouble(lblValue.replace(',', '.'));
		return cantidadConvertir;
	} //TODO añadir excepción
	
	//select divisas
	//cambioDivisas(String value,String value2) lo que va a hacer es coger los values del select divisa1 y divisa2 y procesará la info
	public String cambioDivisa(String lblValue,String divisa1, String divisa2) {
		
		//comparar divisa1 y divisa2 y llamar al metodo correspondiente
		
		switch (divisa1) {
		case "EURO":
			switch (divisa2) {
			case "EURO":
				//mismo valor
				break;
			case "LIBRA":
				return convertidoToString(divisa.calcularEuroLibra(cantidadConvertir(lblValue)));
			case "DOLAR":
				return convertidoToString(divisa.calcularEuroDolar(cantidadConvertir(lblValue)));
			default:
				return "Error";
			}
			break;
		case "LIBRA":
			switch (divisa2) {
			case "EURO":
				return convertidoToString(divisa.calcularLibraEuro(cantidadConvertir(lblValue)));
			case "LIBRA":
				//mismo valor
				break;
			case "DOLAR":
				return convertidoToString(divisa.calcularLibraDolar(cantidadConvertir(lblValue)));
			default:
				return "Error";
			}
			break;
		case "DOLAR":
			switch (divisa2) {
			case "EURO":
				return convertidoToString(divisa.calcularDolarEuro(cantidadConvertir(lblValue)));
			case "LIBRA":
				return convertidoToString(divisa.calcularDolarLibra(cantidadConvertir(lblValue)));
			case "DOLAR":
				//mismo valor
				break;
			default:
				break;
			}
			break;
		default:
			return "Error";
		}
		
		return "Error";
		
	}
	
	//lblConvertido cantidad una vez procesada
	//pasa de double a string
	public String convertidoToString(double value) {
		return Double.toString(value).replace('.', ',');
	}
	
	//metodo para borrar
	public String borrar() {
		return "";
	}
}
