package javaaplication10;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame {
    private JTextField tefCelsius;
    private JLabel labCel, labFahr;
    private JButton butConverter;
    
    
    public Janela(){
        super("Celsius Converter");
        setLayout(new GridLayout(2,2,10,10));
        
        tefCelsius = new JTextField("0");
        add(labCel);
        
        labCel = new JLabel("Celsius");
        add(labCel);
        
        butConverter = new JButton("Converter");
        butConverter.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        double cel = Double.parseDouble(tefCelsius.getText());
                        double fahr = (cel * 9/5 ) + 32;
                        
                        labFahr.setText(fahr+"Fahrenheit");
                    }
                }
                
        );
    add(butConverter);
    
    labFahr = new JLabel("Fahrenheit");
    add(labFahr);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400,300);
    setVisible(true);
}
