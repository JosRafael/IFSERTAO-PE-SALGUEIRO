package javaapplication5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame{
    private JPanel painel;
    private JButton botao;
    
    public Janela(){
        super("Componentes");
        setLayout(new BorderLayout());
        
        painel = new JPanel();
        painel.setBackground(Color.RED);
        add(painel, BorderLayout.CENTER);
        
        botao = new JButton("Escolher cor...");
        botao.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        Color cor = JColorChooser.showDialog(rootPane, "Cores", Color.LIGHT_GRAY);
                        
                        if(cor == null){
                            cor = Color.LIGHT_GRAY;
                        }
                        
                        painel.setBackground(cor);
                    }
                }
        );
        add(botao, BorderLayout.SOUTH);        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setVisible(true);
    }
    
}
