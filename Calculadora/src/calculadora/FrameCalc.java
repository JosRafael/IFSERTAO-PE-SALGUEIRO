/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.*;
import javax.swing.*;

public class FrameCalc extends JFrame {
	private static final long serialVersionUID = 1L;

	public void calcularIMC(String massa, String altura) {
		float massaFloat = Float.parseFloat(massa);
		float alturaFloat = (Float.parseFloat(altura)/100);
		float imcCalculado = massaFloat / (alturaFloat * alturaFloat);			JOptionPane.showMessageDialog(null, "Seu índice de massa corporal é " + imcCalculado);
	}

	public FrameCalc(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		JPanel jpnMassa = new JPanel();
		add(jpnMassa);
		
		JPanel jpnAltura = new JPanel();
		add(jpnAltura);
		
		JPanel jpnButtons = new JPanel();
		add(jpnButtons);
		
		jpnMassa.add(new JLabel("Digite sua massa (kg): "));
		JTextField massa = new JTextField(15);
		jpnMassa.add(massa);
		
		jpnAltura.add(new JLabel("Digite sua altura (cm): "));
		JTextField altura = new JTextField(15);
		jpnAltura.add(altura);
		
		JButton btnCalcular = new JButton ("Calcular IMC");
		jpnButtons.add(btnCalcular);
		
		JButton btnLimpar = new JButton ("Limpar");
		jpnButtons.add(btnLimpar);
		
		JButton btnFechar = new JButton ("Fechar");
		jpnButtons.add(btnFechar);
		
		btnCalcular.addActionListener((ev) -> {
			if (altura.getText().equals("0")) {
				JOptionPane.showMessageDialog(null, "Você não existe");
		    } else if (massa.getText().equals("0")) {
		    	JOptionPane.showMessageDialog(null, "Coma uma maçã");
			} else {
				calcularIMC(massa.getText(), altura.getText());
			}
		});
		btnFechar.addActionListener((ev) -> System.exit(0)); 
		btnLimpar.addActionListener((ev) -> {
			massa.setText("");
			altura.setText("");
		});
		altura.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent ev) {
				if (ev.getKeyCode() == 10) {
					calcularIMC(massa.getText(), altura.getText());
				}
			}
		});
	}
}
