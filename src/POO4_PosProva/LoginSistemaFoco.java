package eventos;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class LoginSistemaFoco extends JFrame {
	private JLabel lblUsuario;
	private JTextField txtUsuario;
	private JLabel lblSenha1;
	private JPasswordField txtSenha1;
	private JLabel lblSenha2;
	private JPasswordField txtSenha2;
	private JButton btnInserir;
	private Container ctn;

	public LoginSistemaFoco() {
		setSize(400, 250);
		setTitle("Criação de login");
		ctn = getContentPane();
		ctn.setLayout(null);
		lblUsuario = new JLabel("Usuário");
		txtUsuario = new JTextField();
		lblSenha1 = new JLabel("Senha");
		txtSenha1 = new JPasswordField();
		lblSenha2 = new JLabel("Confirmar Senha");
		txtSenha2 = new JPasswordField();
		btnInserir = new JButton("Inserir");
		lblUsuario.setBounds(0, 0, 100, 25);
		txtUsuario.setBounds(150, 0, 200, 25);
		lblSenha1.setBounds(0, 50, 100, 25);
		txtSenha1.setBounds(150, 50, 200, 25);
		lblSenha2.setBounds(0, 100, 100, 25);
		txtSenha2.setBounds(150, 100, 200, 25);
		btnInserir.setBounds(140, 160, 100, 50);
		ctn.add(lblUsuario);
		ctn.add(txtUsuario);
		ctn.add(lblSenha1);
		ctn.add(txtSenha1);
		ctn.add(lblSenha2);
		ctn.add(txtSenha2);
		ctn.add(btnInserir);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//tratamento do clique no botão
		btnInserir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				trataEventoBotaoInseir();
			}
		});
//tratamento para a perda de foco do campo txtUsuario
		txtUsuario.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				trataFocoUsuario();
			}

			@Override
			public void focusGained(FocusEvent e) {
			}
		});
	}

	public void trataFocoUsuario() {
		String usuario = txtUsuario.getText();
//Verifica se o comprimento é menor que 3 ou se a primeira letra é diferente de maiúscula
		if (usuario.length() < 3 || Character.isUpperCase(usuario.charAt(0)) != true) {
			JOptionPane.showMessageDialog(this, "O usuário deve ter mais que 3 caracteres e começar em caixa alta.");
		}
	}

	public void trataEventoBotaoInseir() {
		String usuario = txtUsuario.getText();
		String senha1 = new String(txtSenha1.getPassword());
		String senha2 = new String(txtSenha2.getPassword());
		JOptionPane.showMessageDialog(this, "Senha cadastrada para o usuário: " + usuario);
	}

	public static void main(String[] args) {
		LoginSistemaFoco tela = new LoginSistemaFoco();
	}
}