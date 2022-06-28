package vista;

import controller.LaboratorioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalEliminarPractica extends JInternalFrame {
    private JPanel pnlPrincipal;
    private JTextField textCodigoEliminar;
    private JButton eliminarButton;

    public FrmInternalEliminarPractica(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LaboratorioController.getInstance().borrarPractica(textCodigoEliminar.getText());
                JOptionPane.showMessageDialog(null, "La practica ha sido eliminada");
            }
        });
    }

}

