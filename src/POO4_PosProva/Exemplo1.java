package InterfaceGrafica;

import javax.swing.JFrame;

public class Exemplo1 {

	public Exemplo1() {
		    JFrame janela = new JFrame("Titulo");
		    //adicionar containers e components
		    janela.pack();
		    janela.setVisible(true);
		    janela.setSize(300, 300);
		    janela.setTitle("Tela Inicial");
		   
		}

		public static void main(String[] args) {
			Exemplo1 teste = new Exemplo1();
		}
}
