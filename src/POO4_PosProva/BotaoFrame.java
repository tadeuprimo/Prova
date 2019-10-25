package eventos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
 
public class BotaoFrame extends JFrame{
     
    private JButton botaoPrata;
    private JButton botaoOuro;
     
    //BUTTONFRAME ADICIONA JBUTTONS AO JFRAME
    public BotaoFrame()
    {
        super("Testando Bot�es");
        setLayout(new FlowLayout()); //CONFIGURA O LAYOUT DE FRAME
         
        botaoPrata = new JButton("Prata"); //BOT�O COM TEXTO
        add(botaoPrata); //ADICIONA botaoPrata AO JFRAME
         
        botaoOuro = new JButton("Ouro");
        add(botaoOuro); //ADICIONA botaoOuro AO JFRAME
         
        //CRIA NOVO BUTTON HANDLER PARA TRATAMENTO DE EVENTO DE BOT�O
        ButtonHandler handler = new ButtonHandler();
        botaoOuro.addActionListener(handler);
        botaoPrata.addActionListener(handler);      
         
    }
     
    //CLASSE INTERNA PARA TRATAMENTO DO BOT�O
    public class ButtonHandler implements ActionListener
    {
        //TRATA EVENTO DO BOT�O
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(BotaoFrame.this, String.format("Voc� pressionou: %s", event.getActionCommand()));
        }
    }
}