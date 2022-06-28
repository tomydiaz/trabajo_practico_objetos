package vista;

import controller.LaboratorioController;
import modelo.Paciente;
import modelo.Practica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalModificarPractica extends JInternalFrame{
    private JPanel pnlPrincipal;
    private JTextField textCodigoBuscar;
    private JButton buscarButton;
    private JTextField textNombreModificar;
    private JTextField textHorasResultadoModificar;
    private JButton guardarButton;

    public FrmInternalModificarPractica(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Practica practica = LaboratorioController.getInstance().buscarPractica(textCodigoBuscar.getText());
                    textNombreModificar.setText(practica.getNombre());
                    textHorasResultadoModificar.setText(practica.getHorasResultado());
                } catch (Exception except) {
                    textNombreModificar.setText("");
                    textHorasResultadoModificar.setText("");
                }
            }
        });

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    LaboratorioController.getInstance().modificarPractica(textCodigoBuscar.getText(), textNombreModificar.getText(), textHorasResultadoModificar.getText());
                } catch (Exception except) {
                    textNombreModificar.setText("");
                    textHorasResultadoModificar.setText("");
                }
                JOptionPane.showMessageDialog(null, "La modificacion de la practica fue exitosa");
            }
        });
    }
}