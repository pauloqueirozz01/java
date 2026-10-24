package projetos.desktop;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/*
 * Desktop - projeto com janela gráfica usando Swing (já vem junto com o JDK).
 * Ponto de entrada próprio: roda de forma independente dos outros projetos.
 */
public class Main {
    public static void main(String[] args) {
        // Toda interface Swing deve ser criada na thread de eventos (EDT)
        SwingUtilities.invokeLater(() -> {
            JFrame janela = new JFrame("Meu Projeto Desktop");
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            janela.setSize(400, 300);
            janela.setLocationRelativeTo(null); // centraliza na tela

            JLabel texto = new JLabel("Olá, Java Desktop!", SwingConstants.CENTER);
            janela.add(texto);

            janela.setVisible(true);
        });
    }
}
