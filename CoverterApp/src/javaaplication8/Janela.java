package javaaplication8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Janela extends JFrame {
    private JTextArea textArea;
    private JButton botao;
    
    public Janela(){
        super("Exemplo");
        setLayout(new FlowLayout());
        
        textArea = new JTextArea(10, 20);
        add(textArea);
        
        botao = new JButton("OK");
        botao.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        String texto = textArea.getSelectedText();
                        
                        JOptionPane.showMessageDialog(rootPane, texto);
                    }
                }
        );
        add( botao );
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(280, 400);
        setVisible(true);
    }
}
