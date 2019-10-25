package eventos;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SistemaVotacao extends JFrame {
	private JButton btnVotar;
	private JRadioButton rbCd1;
	private JRadioButton rbCd2;
	private ButtonGroup btnGrupo;
	private Container ctn;

	public SistemaVotacao() {
		setSize(300, 210);
		setTitle("Escolha um candidato!");
		rbCd1 = new JRadioButton("Candidato 1");
		rbCd2 = new JRadioButton("Candidato 2");
// defi ne o texto que o botão vai enviar quando selecionado
		rbCd1.setActionCommand("Candidato1");
		rbCd2.setActionCommand("Candidato2");
		btnVotar = new JButton("VOTAR");
//cria um grupo de botões para garantir apenas a seleção de um deles e facilitar a busca pelo item selecionado
		btnGrupo = new ButtonGroup();
		btnGrupo.add(rbCd1);
		btnGrupo.add(rbCd2);
		ctn = getContentPane();
		ctn.setLayout(null);
//marca esse campo como selecionado
		rbCd1.setSelected(true);

		rbCd1.setBounds(10, 10, 100, 100);
		rbCd2.setBounds(150, 10, 100, 100);
		btnVotar.setBounds(90, 120, 100, 50);

		ctn.add(rbCd1);
		ctn.add(rbCd2);
		ctn.add(btnVotar);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnVotar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trataVotar();
			}
		});

	}

	public void trataVotar() {
		// Recupera o texto do botão que foi selecionado 
		String candidatoSelecionado =
		btnGrupo.getSelection().getActionCommand();
		// Imprime o texto do botão que foi selecionado
		JOptionPane.showMessageDialog(this, "Você votou em: " + candidatoSelecionado);
	}

	public static void main(String[] args) {
		SistemaVotacao stn = new SistemaVotacao();
	}
}