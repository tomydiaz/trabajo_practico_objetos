package vista;

import javax.swing.*;

public class FrmInternalModificarSucursal extends JInternalFrame{
    private JPanel pnlPrincipal;

    public FrmInternalModificarSucursal(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

    }
}
