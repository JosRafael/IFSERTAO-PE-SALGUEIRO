package atv.layouttemplate.ex01;

import java.awt.*;
import javax.swing.*;

class Janela extends JFrame{
    private final int TAM = 5;
    private final JButton buttons[];

    public Janela() {
        super("Exemplo FlowLayout");
        this.setLayout(new FlowLayout());
        buttons = new JButton[TAM];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Botão " + i);
            this.add(buttons[i]);
        }
    }
}
