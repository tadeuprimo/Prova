package POO2;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class SemThread extends JFrame {

    JLabel tempo = new JLabel("0");
    JLabel idade = new JLabel();
    int segundos = 0;
    private Thread th;

    public SemThread() {
        editarLayout();
        contarTempo();
        mostrarMensagem();
    }

    private void editarLayout() {
        Font fonte = new Font("Arial", Font.BOLD, 50);
        Font fonte2 = new Font("Arial", Font.BOLD, 30);

        add(BorderLayout.NORTH, tempo);
        add(BorderLayout.CENTER, idade);

        tempo.setHorizontalAlignment(SwingConstants.CENTER);
        idade.setHorizontalAlignment(SwingConstants.CENTER);

        idade.setFont(fonte);
        tempo.setFont(fonte2);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void contarTempo() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            segundos++;
            tempo.setText(segundos + "");
        }
    }

    private void mostrarMensagem() {
        int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você nasceu?"));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos?"));
        int resultado = anoAtual - anoNasc;
        idade.setText("Sua idade é: " + resultado);
        JOptionPane.showMessageDialog(null, "Você gastou " + segundos + " segundos para responder!");
    }

    public static void main(String[] args) {
        SemThread th = new SemThread();
        th.contarTempo();
    }
}

public class SemThread implements Runnable {

    private Thread th;

    public SemThread() {
        th = new Thread(this);
        th.start();

    }

    public void run() {
      
       contarTempo()
               
               }
}
