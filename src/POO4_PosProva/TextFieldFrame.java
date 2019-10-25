package eventos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
 
public class TextFieldFrame extends JFrame {
 
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;
     
    //CONSTRUTOR TEXTFIELDFRAME ADICIONA JTEXTDFIELDS A JFRAME
    public TextFieldFrame()
    {
        super("Testando JTextField e JPasswordField");
        setLayout(new FlowLayout());
         
        //CONSTR�I TEXTFIELD COM 10 COLUNAS
        textField1 = new JTextField(10);        
        add(textField1); //ADICIONA TEXTFIELD2 AO JFRAME
         
        textField2 = new JTextField("Entre com o texto aqui");
        add(textField2);
         
        //CONSTR�I TEXTFIELD COM TEXTO PADR�O E 21 COLUNAS
        textField3 = new JTextField("Campo n�o edit�vel",21);
        textField3.setEditable(false); //DESATIVA EDI��O
        add(textField3);
         
        //CONSTR�I PASSWORDFIELD COM TEXTO PADR�O
        passwordField = new JPasswordField("Texto Escondido");
        add(passwordField); //ADICIONA PASSWORDFIELD AO JFRAME
         
        //HANDLERS DE EVENTO REGISTRADORES
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
         
    }
     
    //CLASSE INTERNA PRIVATE PARA TRATAMENTO DE EVENTO
    private class TextFieldHandler implements ActionListener
    {
        //PROCESSA EVENTOS DE CAMPO DE TEXTO
        public void actionPerformed(ActionEvent event){
             
            String string = ""; 
             
            //USU�RIO PRESSIONOU ENTER NO JTEXTFIELD TEXTFIELD1
            if(event.getSource() == textField1)
                string = String.format("textField1: %s", 
                event.getActionCommand());
             
            //USU�RIO PRESSIONOU ENTER NO JTEXTFIELD TEXTFIELD2
            else if(event.getSource() == textField2)
                string = String.format("textField2: %s", 
                event.getActionCommand());
             
            //USU�RIO PRESSIONOU ENTER NO JTEXTFIELD TEXTFIELD3
            else if(event.getSource() == textField3)
                string = String.format("textField3: %s", 
                event.getActionCommand());
             
            //USU�RIO PRESSIONOU ENTER NO JTEXTFIELD PASSWORDFIELD
            else if(event.getSource() == passwordField)
                string = String.format("passowordField: %s", 
                event.getActionCommand());
             
            //EXIBE O CONTE�DO DE JTEXTFIELD
            JOptionPane.showMessageDialog(null, string);
             
        }
    }
}