package vista;

import controller.LaboratorioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalNuevaPeticion extends JInternalFrame {

    private JPanel pnlPrincipal;
    private JTextField obraSocialTextField;
    private JButton cargarButton;
    private JTextField codigoTextField;

    public FrmInternalNuevaPeticion(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        cargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LaboratorioController.getInstance().cargarPeticion(
                        codigoTextField.getText(),
                        obraSocialTextField.getText()
                );
                JOptionPane.showMessageDialog(null, "La carga de la petición fue exitosa");

            }
        });
    }

}
