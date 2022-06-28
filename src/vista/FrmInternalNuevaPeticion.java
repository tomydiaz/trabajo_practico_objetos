package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalNuevaPeticion extends JInternalFrame {

    private JPanel pnlPrincipal;
    private JTextField textObraSocialAlta;
    private JButton cargarButton;

    public FrmInternalNuevaPeticion(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        cargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "La carga de la petición fue exitosa");

            }
        });
    }

}
