package vista;

import javax.swing.*;

public class FrmInternalAltaNuevaSucursal extends JInternalFrame {

    private JPanel pnlPrincipal;

    public FrmInternalAltaNuevaSucursal(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

    }
}
