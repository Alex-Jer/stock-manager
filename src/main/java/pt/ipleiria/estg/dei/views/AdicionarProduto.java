package pt.ipleiria.estg.dei.views;

import pt.ipleiria.estg.dei.GestorArmazem;
import pt.ipleiria.estg.dei.models.Categoria;
import pt.ipleiria.estg.dei.models.Produto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdicionarProduto {
    private JPanel panel1;
    private JTextField txtNome;
    private JTextField txtCategoria;
    private JTextField txtPeso;
    private JTextField txtStock;
    private JButton btnAdicionarProduto;
    private JButton btnVoltar;
    private JComboBox cmbCategoria;

    public AdicionarProduto() {
        for (Categoria categoria : Categoria.values()) {
            cmbCategoria.addItem(categoria);
        }
        btnAdicionarProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double peso = 0.0;
                try {
                    peso = Double.parseDouble(txtPeso.getText());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Peso inválido");
                }

                int stock = 0;
                try {
                    stock = Integer.parseInt(txtStock.getText());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Stock inválido");
                }

                Produto produto = new Produto(
                        txtNome.getText(),
                        (Categoria) cmbCategoria.getItemAt(cmbCategoria.getSelectedIndex()),
                        peso,
                        stock
                );
                
                GestorArmazem.INSTANCE.adicionarProduto(produto);
            }
        });
    }
}
