package vista;

import javax.swing.*;

public class FrmInternalEliminarResultado extends JInternalFrame {
    private JPanel pnlPrincipal;

    public FrmInternalEliminarResultado(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

    }
}
