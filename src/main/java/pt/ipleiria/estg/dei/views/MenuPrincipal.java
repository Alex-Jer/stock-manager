package pt.ipleiria.estg.dei.views;

import pt.ipleiria.estg.dei.GestorArmazem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal {
    private JButton btnFuncionario;
    private JPanel panel1;
    private JButton btnGerente;
    private JButton btnChefe;
    private JButton btnSair;

    public static void main(String[] args) {
        GestorArmazem.INSTANCE.inserirDadosExemplo();
        JFrame frame = new JFrame("Menu Principal");
        frame.setContentPane(new MenuPrincipal().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MenuPrincipal() {
        btnChefe.addActionListener(e -> {
            new AdicionarProduto();
            new EditarProduto(GestorArmazem.INSTANCE.getProdutos().get(0));
        });
    }
}
