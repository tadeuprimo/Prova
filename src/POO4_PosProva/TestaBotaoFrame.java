package eventos;

import javax.swing.JFrame;

public class TestaBotaoFrame {
 
    public static void main(String[] args) {
         
        BotaoFrame buttonFrame = new BotaoFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(275, 210);
        buttonFrame.setVisible(true);
 
    }
}
