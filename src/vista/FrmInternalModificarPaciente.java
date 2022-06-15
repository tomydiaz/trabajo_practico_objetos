package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalModificarPaciente extends JInternalFrame{
    private JTextField txtDniPaciente;
    private JButton buscarButton;
    private JPanel pnlPrincipal;

    public FrmInternalModificarPaciente(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Usted Ingresó: " + txtDniPaciente.getText() + "\n¿Es correcto?");
            }
        });
    }
}
