package JUnit.TCS21.Calculadora.CalculadoraEstandar.controller;

public class Controller {
	
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
				return convertidoToString(Divisa.calcularEuroLibra(cantidadConvertir(lblValue)));
				break;
			case "Dolar":
				return convertidoToString(Divisa.calcularEuroDolar(cantidadConvertir(lblValue)));
				break;
			default:
				break;
			}
			break;
		case "Libra":
			switch (divisa2) {
			case "Euro":
				return convertidoToString(Divisa.calcularLibraEuro(cantidadConvertir(lblValue)));
				break;
			case "Libra":
				//mismo valor
				break;
			case "Dolar":
				return convertidoToString(Divisa.calcularLibraDolar(cantidadConvertir(lblValue)));
				break;
			default:
				break;
			}
			break;
		case "Dolar":
			switch (divisa2) {
			case "Euro":
				return convertidoToString(Divisa.calcularDolarEuro(cantidadConvertir(lblValue)));
				break;
			case "Libra":
				return convertidoToString(Divisa.calcularDolarLibra(cantidadConvertir(lblValue)));
				break;
			case "Dolar":
				//mismo valor
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
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
