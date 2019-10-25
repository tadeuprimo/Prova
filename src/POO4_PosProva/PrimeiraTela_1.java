package InterfaceGrafica;

import java.awt.Container; //biblioteca para containers
import java.text.ParseException;
import javax.swing.*; //simplificando a inclusão de bibliotecas
import javax.swing.text.MaskFormatter;

public class PrimeiraTela extends JFrame {
	private JLabel lblNome;
	private JTextField txtNome;
	private JLabel lblCPF;
	private JFormattedTextField txtCPF;
	private JLabel lblTipo;
	private JComboBox cmbTipo;
	private final String[] tiposUsuarios = { "Adminstrador", "Geral" };
	private JButton btnOK;
	private Container ctn;

	public PrimeiraTela() {
		setSize(400, 300);
		setTitle("Tela Inicial");
		ctn = getContentPane();
		lblNome = new JLabel("Nome");
		txtNome = new JTextField();
		lblCPF = new JLabel("CPF");
		try {
			txtCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		lblTipo = new JLabel("Tipo de usuário");
		cmbTipo = new JComboBox(tiposUsuarios);
		btnOK = new JButton("Enviar");
		ctn.setLayout(null);
		lblNome.setBounds(0, 0, 100, 25);
		txtNome.setBounds(150, 0, 200, 25);
		lblCPF.setBounds(0, 50, 100, 25);
		txtCPF.setBounds(150, 50, 200, 25);
		lblTipo.setBounds(0, 100, 200, 25);
		cmbTipo.setBounds(150, 100, 200, 25);
		btnOK.setBounds(150, 150, 100, 100);
		ctn.add(lblNome);
		ctn.add(txtNome);
		ctn.add(lblCPF);
		ctn.add(txtCPF);
		ctn.add(lblTipo);
		ctn.add(cmbTipo);
		ctn.add(btnOK);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		PrimeiraTela t1 = new PrimeiraTela();
	}
}
