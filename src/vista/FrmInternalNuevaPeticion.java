package vista;

import javax.swing.*;

public class FrmInternalNuevaPeticion extends JInternalFrame {

    private JPanel pnlPrincipal;

    public FrmInternalNuevaPeticion(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

    }

}
