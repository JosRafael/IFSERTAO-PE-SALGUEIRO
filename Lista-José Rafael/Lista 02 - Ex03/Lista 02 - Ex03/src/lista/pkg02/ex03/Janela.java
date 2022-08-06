package lista.pkg02.ex03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame{
    private JLabel texto1 = new JLabel();
    private JLabel texto2 = new JLabel();
    private JLabel resultado = new JLabel();
    
    private JButton butsomar = new JButton();
    private JButton butsub = new JButton();
    private JButton butmulti = new JButton();
    private JButton butdiv = new JButton();
    
    private JTextField jt1 = new JTextField();
    private JTextField jt2 = new JTextField();
    
    private double calculo;
    private double dado1;
    private double dado2;
    
    public Janela(){
        super("Calculadora");
        setBounds(0, 0, 267, 235);
        getContentPane().setLayout(null);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        texto1 = new JLabel("Número 1:");
        texto1.setBounds(5, 10, 78, 45);
        add(texto1);
        
        texto2 = new JLabel("Número 2:");
        texto2.setBounds(5, 40, 78, 45);
        add(texto2);
        
        JTextField jt1 = new JTextField(10);
        jt1.setBounds(70, 25, 193, 20);
        add(jt1);
        
        JTextField jt2 = new JTextField(10);
        jt2.setBounds(70, 55, 193, 20);
        add(jt2);
        
        butsomar = new JButton("+");
        butsomar.setBounds(70, 90, 41, 20);
        add(butsomar);
        
        butsub = new JButton("-");
        butsub.setBounds(120, 90, 41, 20);
        add(butsub);
        
        butmulti = new JButton("*");
        butmulti.setBounds(170, 90, 41, 20);
        add(butmulti);
        
        butdiv = new JButton("/");
        butdiv.setBounds(220, 90, 41, 20);
        add(butdiv);
        
        resultado = new JLabel("Resultado = ");
        resultado.setBounds(100, 130, 200, 20);
        add(resultado);
        
        
        butsomar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    dado1 = Double.parseDouble(jt1.getText());
                    dado2 = Double.parseDouble(jt2.getText());
                    calculo = dado1 + dado2;
                    
                    resultado.setText("Resultado = " + calculo);
                }   
            }
        );
        butsub.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    
                    dado1 = Double.parseDouble(jt1.getText());
                    dado2 = Double.parseDouble(jt2.getText());
                    calculo = dado1 - dado2;
                    
                    resultado.setText("Resultado = " + calculo);
                }
            }
        );
        butmulti.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    dado1 = Double.parseDouble(jt1.getText());
                    dado2 = Double.parseDouble(jt2.getText());
                    calculo = dado1 * dado2;
                    
                    resultado.setText("Resultado = " + calculo);
                }    
            }
        );
        butdiv.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    dado1 = Double.parseDouble(jt1.getText());
                    dado2 = Double.parseDouble(jt2.getText());
                    calculo = dado1 / dado2;
                    
                    resultado.setText("Resultado = " + calculo);
                }    
            }
        );
        
    }
}
