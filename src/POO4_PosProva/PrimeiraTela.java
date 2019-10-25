package eventos;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class PrimeiraTela extends JFrame implements ActionListener{
private JButton btnok;
private JTextField txtNome;
private JLabel lblNome;
private Container ctn;
public PrimeiraTela()
 {
 setSize(300,140);
 setTitle("Eventos em Java Swing");
 ctn = getContentPane();
 ctn.setLayout(null);
 btnok = new JButton("Enviar");
 lblNome = new JLabel("Nome");
 txtNome = new JTextField();
 lblNome.setBounds(10,10,100,25);
 txtNome.setBounds(70,10,200,25);
 btnok.setBounds(90,50,80,40);
 //direita e esquerda - pra cima e para baixo - largura do botão (x)  - altura do botão (y) 
 btnok.addActionListener(this);
 ctn.add(lblNome);
 ctn.add(txtNome);
 ctn.add(btnok);
// nesse ponto vamos inserir tratamento dos eventos
 setVisible(true);
 }
public static void main(String[] args) {
	 PrimeiraTela tela = new PrimeiraTela();
	 }
	// nesse ponto vamos inserir tratamento dos eventos
	

@Override
public void actionPerformed(ActionEvent e)
 {// caso seja necessário tratar eventos de mais de um botão
	if(e.getActionCommand().equals("Enviar"))
	 {
	 txtNome.setText("Botão clicado");
	 }
	 }
	}

