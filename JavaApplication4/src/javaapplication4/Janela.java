package javaapplication4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela extends JFrame {
    private JLabel labPeso, labAltura;
    private JTextField tefPeso, tefAltura;
    private JButton butCalcular;
    
    public Janela(){
        super("Cálculo do IMC");
        setLayout(new FlowLayout());
        
        labPeso = new JLabel("Peso");
        add( labPeso );
        tefPeso = new JTextField(20);
        add( tefPeso );
        labAltura = new JLabel("Altura");
        add( labAltura );
        tefAltura = new JTextField(20);
        add( tefAltura );
        
        butCalcular = new JButton("Calcular IMC");
        butCalcular.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        double peso = Double.parseDouble(tefPeso.getText());
                        double altura = Double.parseDouble(tefAltura.getText());
                        double imc = peso / Math.pow(altura, 2);
                        
                        JOptionPane.showMessageDialog(rootPane, "Seu IMC é " + imc);
                    }
                }
        );
        add(butCalcular);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
        setResizable(false);
    }
}
