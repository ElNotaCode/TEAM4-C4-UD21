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
		case "Euro":
			switch (divisa2) {
			case "Euro":
				//mismo valor
				break;
			case "Libra":
				return convertidoToString(divisa.calcularEuroLibra(cantidadConvertir(lblValue)));
			case "Dolar":
				return convertidoToString(divisa.calcularEuroDolar(cantidadConvertir(lblValue)));
			default:
				break;
			}
			break;
		case "Libra":
			switch (divisa2) {
			case "Euro":
				return convertidoToString(divisa.calcularLibraEuro(cantidadConvertir(lblValue)));
			case "Libra":
				//mismo valor
				break;
			case "Dolar":
				return convertidoToString(divisa.calcularLibraDolar(cantidadConvertir(lblValue)));
			default:
				break;
			}
			break;
		case "Dolar":
			switch (divisa2) {
			case "Euro":
				return convertidoToString(divisa.calcularDolarEuro(cantidadConvertir(lblValue)));
			case "Libra":
				return convertidoToString(divisa.calcularDolarLibra(cantidadConvertir(lblValue)));
			case "Dolar":
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
