package pt.ipleiria.estg.dei.views;

import javax.swing.*;
import java.awt.*;

public class EditarProduto extends JFrame {

    private JPanel panel1;
    private JTextField txtStock;
    private JButton btnConfirmar;
    private JButton btnVoltar;

    public void display(){
        JFrame frame = new JFrame("Editar Produto");
        frame.setContentPane(new EditarProduto().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public EditarProduto()  {
        display();
        btnConfirmar.addActionListener(e -> {
            int stock;

            try {
                stock = Integer.parseInt(txtStock.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Stock inválido");
                return;
            }


        });
    }
}
