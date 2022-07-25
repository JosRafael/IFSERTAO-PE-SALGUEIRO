import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ExemploFlowLayout extends JFrame {
private final int TAM = 5;
private JButton buttons[];
public ExemploFlowLayout(){
super("Exemplo FlowLayout");
this.setLayout( new FlowLayout() );
buttons = new JButton[ TAM ];
for(int i = 0; i < buttons.length; i++){
buttons[ i ] = new JButton("Botão " + i);
this.add( buttons[ i ]);
}
}
}
