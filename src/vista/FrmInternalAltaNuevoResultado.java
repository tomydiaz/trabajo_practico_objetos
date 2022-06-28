package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalAltaNuevoResultado extends JInternalFrame {
    private JPanel pnlPrincipal;
    private JTextField textField1;
    private JTextField textField2;
    private JButton cargarButton;

    public FrmInternalAltaNuevoResultado(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        cargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "La carga del nuevo resultado fue exitosa");

            }
        });
    }
}
