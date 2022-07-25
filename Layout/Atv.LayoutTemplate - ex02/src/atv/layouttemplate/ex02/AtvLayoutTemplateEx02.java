package atv.layouttemplate.ex02;

import javax.swing.JFrame;

public class AtvLayoutTemplateEx02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Janela app = new Janela();
   
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(400, 150);
        app.setVisible(true);
    }

}
