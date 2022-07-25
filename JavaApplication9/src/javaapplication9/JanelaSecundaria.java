package javaapplication9;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaSecundaria extends JFrame{
    private JLabel rotulo;
    
    public JanelaSecundaria(String frase){
        super("Secundária");
        setLayout(new FlowLayout());
        
        rotulo = new JLabel( frase );
        add( rotulo );
        
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }
    
    public void setRotulo(String texto){
        rotulo.setText(texto);
    }
}
