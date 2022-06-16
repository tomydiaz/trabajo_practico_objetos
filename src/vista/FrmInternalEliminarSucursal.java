package vista;

import javax.swing.*;

public class FrmInternalEliminarSucursal extends JInternalFrame{
    private JPanel pnlPrincipal;

    public FrmInternalEliminarSucursal(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

    }
}
