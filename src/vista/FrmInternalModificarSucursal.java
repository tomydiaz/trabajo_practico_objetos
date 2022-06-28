package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalModificarSucursal extends JInternalFrame{
    private JPanel pnlPrincipal;
    private JTextField textField1;
    private JButton buscarButton;
    private JTextField textModificarNumeroSuc;
    private JTextField textModificarDireccionSuc;
    private JButton modificarButton;

    public FrmInternalModificarSucursal(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "La Sucursal se modifico con éxito");

            }
        });
    }
}
