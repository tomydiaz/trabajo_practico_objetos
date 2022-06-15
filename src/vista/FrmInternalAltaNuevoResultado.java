package vista;

import javax.swing.*;

public class FrmInternalAltaNuevoResultado extends JInternalFrame {
    private JPanel pnlPrincipal;
    private JButton button1;

    public FrmInternalAltaNuevoResultado(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

    }
}
