package atv.layouttemplate.ex03;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Janela extends JFrame{

    private JLabel jLabelNota1, jLabelNota2;
    private JTextField jTextFieldNota1, jTextFieldNota2;
    private JButton jButtonOk;

    public Janela() {
        super("Exemplo GridLayout");
        this.setLayout(new GridLayout(3, 2));
        jLabelNota1 = new JLabel("Nota 1: ");
        this.add(jLabelNota1);
        jTextFieldNota1 = new JTextField(10);
        this.add(jTextFieldNota1);
        jLabelNota2 = new JLabel("Nota 2: ");
        this.add(jLabelNota2);
        jTextFieldNota2 = new JTextField(10);
        this.add(jTextFieldNota2);
        jButtonOk = new JButton("Ok");
        this.add(jButtonOk);
    }
}
