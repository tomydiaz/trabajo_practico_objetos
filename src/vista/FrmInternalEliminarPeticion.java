package vista;

import controller.LaboratorioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalEliminarPeticion extends JInternalFrame {

    private JPanel pnlPrincipal;
    private JTextField codigoTextField;
    private JButton eliminarButton;

    public FrmInternalEliminarPeticion(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LaboratorioController.getInstance().borrarPeticion(codigoTextField.getText());
                JOptionPane.showMessageDialog(null, "Petición Eliminada");
            }
        });
    }
}