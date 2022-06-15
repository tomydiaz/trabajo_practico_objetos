package vista;

import javax.swing.*;

public class FrmInternalEliminarResultado extends JInternalFrame {
    private JPanel pnlPrincipal;
    private JButton button1;

    public FrmInternalEliminarResultado(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

    }
}
