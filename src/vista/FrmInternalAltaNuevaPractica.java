package vista;

import controller.LaboratorioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalAltaNuevaPractica extends JInternalFrame{
    private JPanel pnlPrincipal;
    private JButton ingresarButton;
    private JTextField codigoTextField;

    private JTextField horasTextField;
    private JTextField nombreTextField;

    public FrmInternalAltaNuevaPractica(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LaboratorioController.getInstance().cargarPractica(
                        codigoTextField.getText(),
                        nombreTextField.getText(),
                        horasTextField.getText()
                );
                JOptionPane.showMessageDialog(null, "La carga de la practica fue exitosa");
            }
        });

    }
}

