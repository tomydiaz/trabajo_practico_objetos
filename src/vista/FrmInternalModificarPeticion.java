package vista;

import controller.LaboratorioController;
import modelo.Paciente;
import modelo.Peticion;
import modelo.Practica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalModificarPeticion extends JInternalFrame {

    private JPanel pnlPrincipal;
    private JTextField textCodigoPeticionModificar;
    private JButton buscarButton;
    private JTextField textObraSocialModificar;
    private JTextField textEstadoModificar;
    private JButton cargarButton;

    public FrmInternalModificarPeticion(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Peticion peticion = LaboratorioController.getInstance().buscarPeticion(textCodigoPeticionModificar.getText());
                    textObraSocialModificar.setText(peticion.getObraSocial());
                    textEstadoModificar.setText(peticion.getEstado());
                } catch (Exception except) {
                    textObraSocialModificar.setText("");
                    textEstadoModificar.setText("");
                }
            }
        });

        cargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    LaboratorioController.getInstance().modificarPeticion(
                            textCodigoPeticionModificar.getText(),
                            textObraSocialModificar.getText(),
                            textEstadoModificar.getText()
                    );
                } catch (Exception except) {
                    textObraSocialModificar.setText("");
                    textEstadoModificar.setText("");
                }
                JOptionPane.showMessageDialog(null, "La modificacion de la peticion fue exitosa");
            }
        });
    }
}