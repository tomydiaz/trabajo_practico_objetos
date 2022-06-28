package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalAltaNuevaSucursal extends JInternalFrame {

    private JPanel pnlPrincipal;
    private JTextField textAltaNumSuc;
    private JTextField textAltaDireccion;
    private JButton cargarButton;

    public FrmInternalAltaNuevaSucursal(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        cargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Sucursal dada de alta con éxito");

            }
        });
    }
}
