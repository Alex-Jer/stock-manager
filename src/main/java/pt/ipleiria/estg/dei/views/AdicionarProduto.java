package pt.ipleiria.estg.dei.views;

import pt.ipleiria.estg.dei.GestorArmazem;
import pt.ipleiria.estg.dei.models.Categoria;
import pt.ipleiria.estg.dei.models.Produto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdicionarProduto extends JFrame {
    private JPanel panel1;
    private JTextField txtNome;
    private JTextField txtCategoria;
    private JTextField txtPeso;
    private JTextField txtStock;
    private JButton btnAdicionarProduto;
    private JButton btnVoltar;
    private JComboBox cmbCategoria;

    public void display() {
        JFrame frame = new JFrame("Adicionar Produto");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public AdicionarProduto() {
        for (Categoria categoria : Categoria.values())
            cmbCategoria.addItem(categoria);

        display();

        btnAdicionarProduto.addActionListener(e -> {
            double peso;
            int stock;

            try {
                peso = Double.parseDouble(txtPeso.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Peso inválido");
                return;
            }

            try {
                stock = Integer.parseInt(txtStock.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Stock inválido");
                return;
            }

            Produto produto = new Produto(
                    txtNome.getText(),
                    (Categoria) cmbCategoria.getItemAt(cmbCategoria.getSelectedIndex()),
                    peso,
                    stock
            );

            GestorArmazem.INSTANCE.adicionarProduto(produto);
            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso");
            JOptionPane.showMessageDialog(null, "Nome: " + produto.getNome() + " Categoria: " + produto.getCategoria() + " Peso: " + produto.getPeso() + " Stock: " + produto.getStock());
        });
    }
}
