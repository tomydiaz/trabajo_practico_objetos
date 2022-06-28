package vista;

import controller.LaboratorioController;
import modelo.Paciente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalModificarPaciente extends JInternalFrame{
    private JTextField txtDniPaciente;
    private JButton buscarButton;
    private JPanel pnlPrincipal;
    private JTextField textDniModificar;
    private JTextField textNameModificar;
    private JPanel pnlValues;
    private JButton guardarButton;
    private JTextField textDomicilioModificar;
    private JTextField textEmailModificar;
    private JTextField textSexoModificar;
    private JTextField textEdadModificar;
    private JTextField textApellidoModificar;

    public FrmInternalModificarPaciente(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Paciente paciente = LaboratorioController.getInstance().buscarPaciente(txtDniPaciente.getText());
                    System.out.println(paciente.getDNI());
                    textNameModificar.setText(paciente.getNombre());
                    textDomicilioModificar.setText(paciente.getDomicilio());
                    textEmailModificar.setText(paciente.getEmail());
                    textSexoModificar.setText(paciente.getSexo());
                    textEdadModificar.setText(paciente.getEdad());
                } catch (Exception except) {
                    textNameModificar.setText("");
                    textDomicilioModificar.setText("");
                    textEmailModificar.setText("");
                    textSexoModificar.setText("");
                    textEdadModificar.setText("");
                }


            }
        });

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    LaboratorioController.getInstance().modificarPaciente(txtDniPaciente.getText(), textNameModificar.getText(), textDomicilioModificar.getText(), textEmailModificar.getText(), textSexoModificar.getText(), textEdadModificar.getText());
                } catch (Exception except) {
                    textNameModificar.setText("");
                    textDomicilioModificar.setText("");
                    textEmailModificar.setText("");
                    textSexoModificar.setText("");
                    textEdadModificar.setText("");
                }
                JOptionPane.showMessageDialog(null, "El paciente se modificó con exito");


            }
        });
    }
}
