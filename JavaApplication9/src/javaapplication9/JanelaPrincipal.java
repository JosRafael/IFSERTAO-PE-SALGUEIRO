package javaapplication9;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JanelaPrincipal extends JFrame {
    private JTextField tefNome;
    private JButton butOk, butDois;
    private JanelaSecundaria js;
    
    public JanelaPrincipal(){
        super("Principal");
        setLayout(new FlowLayout());
        
        tefNome = new JTextField(20);
        add( tefNome );
        
        butOk = new JButton("Abrir...");
        butOk.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        js = new JanelaSecundaria( tefNome.getText() );                        
                    }
                }
        );
        add( butOk );
        
        butDois = new JButton("Enviar...");
        butDois.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        js.setRotulo( tefNome.getText() );
                    }
                }
        );
        add(butDois);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300, 400);
    }
}
