package vista;

import controller.LaboratorioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalIngresarPaciente extends JInternalFrame{
    private JPanel pnlPrincipal;
    private JTextField nombreTextField;
    private JTextField dniTextField;
    private JTextField domicilioTextField;
    private JTextField emailTextField;
    private JTextField sexoTextField;
    private JTextField edadTextField;
    private JButton cargarButton;
    private JPanel pnlCargar;
    private JPanel pnlTitulo;
    private JPanel pnlSpacer;

    public FrmInternalIngresarPaciente(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        cargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LaboratorioController.getInstance().cargarPaciente(
                        dniTextField.getText(),
                        nombreTextField.getText(),
                        domicilioTextField.getText(),
                        emailTextField.getText(),
                        sexoTextField.getText(),
                        edadTextField.getText()
                );
                JOptionPane.showMessageDialog(null, "La carga del paciente fue exitosa");
            }
        });
    }
}
