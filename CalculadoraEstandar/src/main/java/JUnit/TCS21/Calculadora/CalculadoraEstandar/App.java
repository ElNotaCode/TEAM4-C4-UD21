package JUnit.TCS21.Calculadora.CalculadoraEstandar;

import java.awt.EventQueue;

import JUnit.TCS21.Calculadora.CalculadoraEstandar.view.View;
public class App 
{
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    
}
