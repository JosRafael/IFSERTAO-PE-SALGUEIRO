package lista.pkg02.ex02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Janela extends JFrame{
    private JButton but = new JButton();
    private JTextField jt = new JTextField();
    private int contador = 0;
    
    public Janela(){
        super("Cliques");
        
        but = new JButton("CLIQUE");
        but.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    contador++;
                    jt.setText("" + contador);
                }
            }
        );
        add(but);
      
        jt = new JTextField(10);
        add(jt);
        
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(250, 100);
    }
}
