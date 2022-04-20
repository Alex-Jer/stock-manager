package pt.ipleiria.estg.dei.views;

import javax.swing.*;

public class MenuPrincipal {
    private JButton btnFuncionario;
    private JPanel panel1;
    private JButton btnGerente;
    private JButton btnChefe;
    private JButton btnSair;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Principal");
        frame.setContentPane(new MenuPrincipal().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
