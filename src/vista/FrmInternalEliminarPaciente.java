package vista;

import controller.LaboratorioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalEliminarPaciente extends JInternalFrame {
    private JPanel pnlPrincipal;
    private JTextField txtDniPaciente;
    private JButton eliminarButton;

    public FrmInternalEliminarPaciente(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LaboratorioController.getInstance().borrarPaciente(txtDniPaciente.getText());
                JOptionPane.showMessageDialog(null, "El paciente a eliminar es: " + txtDniPaciente.getText() + "\n¿Es correcto?");
            }
        });
    }
}
