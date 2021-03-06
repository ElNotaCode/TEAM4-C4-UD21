package JUnit.TCS21.Calculadora.CalculadoraEstandar.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalToggleButtonUI;

import org.junit.platform.commons.util.StringUtils;

import JUnit.TCS21.Calculadora.CalculadoraEstandar.controller.Controller;
import JUnit.TCS21.Calculadora.CalculadoraEstandar.dto.Divisa;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class View extends JFrame {
	Controller controller = new Controller();

	private JPanel contentPane;
	private String stringvalorentero = "";
	public static JLabel lbCantidad = new JLabel("0");
	public static JLabel lbConvertido = new JLabel("0");
	public static JComboBox comboBoxConvertido = new JComboBox();
	public static JComboBox comboBoxCantidad = new JComboBox();

	/**
	 * Create the frame.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					final View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public View() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCE = new JButton("CE");
		btnCE.setBounds(504, 71, 100, 100);
		JButton btnX = new JButton("X");
		btnX.setBounds(600, 71, 100, 100);
		JButton btn9 = new JButton("9");
		btn9.setBounds(600, 166, 100, 100);
		JButton btn6 = new JButton("6");
		btn6.setBounds(600, 261, 100, 100);
		JButton btn3 = new JButton("3");
		btn3.setBounds(600, 356, 100, 100);
		JButton btncoma = new JButton(",");
		btncoma.setBounds(600, 451, 100, 100);
		JButton btn8 = new JButton("8");
		btn8.setBounds(504, 166, 100, 100);
		JButton btn5 = new JButton("5");
		btn5.setBounds(504, 261, 100, 100);
		JButton btn2 = new JButton("2");
		btn2.setBounds(504, 356, 100, 100);
		JButton btn0 = new JButton("0");
		btn0.setBounds(504, 451, 100, 100);
		JButton btn1 = new JButton("1");
		btn1.setBounds(408, 356, 100, 100);
		JButton btn4 = new JButton("4");
		btn4.setBounds(408, 261, 100, 100);
		JButton btn7 = new JButton("7");
		btn7.setBounds(408, 166, 100, 100);

		JLabel lblNewLabel = new JLabel("MONEDA");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setBounds(63, 40, 188, 16);
		contentPane.add(lblNewLabel);
		lbCantidad.setFont(new Font("Lucida Grande", Font.PLAIN, 34));
		
		lbCantidad.setBounds(41, 217, 343, 36);
		contentPane.add(lbCantidad);
		lbConvertido.setFont(new Font("Lucida Grande", Font.PLAIN, 34));
		
		lbConvertido.setBounds(41, 112, 343, 36);
		contentPane.add(lbConvertido);
		
		JComboBox comboBoxConvertido = new JComboBox();
		comboBoxConvertido.setBounds(24, 160, 117, 27);
		contentPane.add(comboBoxConvertido);
		
	
		
		comboBoxConvertido.addItem("EURO");
		comboBoxConvertido.addItem("LIBRA");
		comboBoxConvertido.addItem("DOLAR");
		
		JComboBox comboBoxCantidad = new JComboBox();
		comboBoxCantidad.setBounds(24, 276, 117, 27);
		contentPane.add(comboBoxCantidad);
		comboBoxCantidad.addItem("EURO");
		comboBoxCantidad.addItem("LIBRA");
		comboBoxCantidad.addItem("DOLAR");
		
		JButton brnCalcular = new JButton("Calcular");
		brnCalcular.setBounds(24, 355, 117, 29);
		contentPane.add(brnCalcular);
		
		brnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lbCantidad.setText(stringvalorentero);
				//lbltexto el label que se utiliza para meter los numeros
				lbConvertido.setText(controller.cambioDivisa(lbCantidad.getText(),comboBoxCantidad.getSelectedItem().toString(), comboBoxConvertido.getSelectedItem().toString()));
			}
		});

		
		
		
		
		final List<JButton> listButton = new ArrayList<JButton>();
		listButton.add(btnCE);
		listButton.add(btnX);
		listButton.add(btn0);
		listButton.add(btn1);
		listButton.add(btn2);
		listButton.add(btn3);
		listButton.add(btn4);
		listButton.add(btn5);
		listButton.add(btn6);
		listButton.add(btn7);
		listButton.add(btn8);
		listButton.add(btn9);
		listButton.add(btncoma);

		generarBotones(listButton);
		recogerBotones(listButton);
//Controller.insertarDivisa(comboBoxCantidad.getSelectedItem().toString() ,comboBoxConvertido.getSelectedItem().toString());

		
	}
	
	
	
	public void generarBotones(List<JButton> list) { 
		for (JButton button : list) { // recorremos toda la lista
			button.setFont(new Font("Lucida Grande", Font.PLAIN, 19)); // tama??o y fuente para todos los btn
			contentPane.add(button);
								
		}

	}
	
	public void recogerBotones(List<JButton> list) {
		for (JButton button : list) { // recorremos toda la lista
			
		
	
			
			
			button.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent arg0) {
					
					if(!button.getText().equals("CE") && !button.getText().equals("X")) {
						stringvalorentero += button.getText();
						//insertarCantidadConvertir(String value)
						//System.out.println(stringvalorentero);
						lbCantidad.setText(controller.montarLblCantidad(lbCantidad.getText(), button.getText()));
						lbCantidad.setText(stringvalorentero);
						//lbltexto el label que se utiliza para meter los numeros
						//controller.cambioDivisa(lbCantidad.getText(),comboBoxCantidad.getSelectedItem().toString(), comboBoxConvertido.getSelectedItem().toString());
					}else 
					
					if(button.getText().equals("X")){
						//eliminar el ultimo valor
						
						 stringvalorentero = stringvalorentero.substring(0, stringvalorentero.length()-1);		
						
						lbCantidad.setText(stringvalorentero);
						     
					}else {
						lbCantidad.setText("0");
						stringvalorentero = "";
						lbConvertido.setText(stringvalorentero);
						
					}
				
				}
			});
			
			
			

					
		}

	}
}
