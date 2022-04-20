package pt.ipleiria.estg.dei.views;

import pt.ipleiria.estg.dei.models.Produto;

import javax.swing.*;
import java.awt.*;

public class EditarProduto extends JFrame {

    private JPanel panel1;
    private JTextField txtStock;
    private JButton btnConfirmar;
    private JButton btnVoltar;

    public void display() {
        JFrame frame = new JFrame("Editar Produto");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public EditarProduto(Produto produto) {
        txtStock.setText(Integer.toString(produto.getStock()));
        display();
        btnConfirmar.addActionListener(e -> {
            int stock;

            try {
                stock = Integer.parseInt(txtStock.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Stock inválido");
                return;
            }

            produto.setStock(stock);
            JOptionPane.showMessageDialog(null, "Stock de " + produto.getNome() + " definido para " + stock + "!");
        });
    }
}
