package vista;

import javax.swing.*;

public class FrmInternalModificarResultado extends JInternalFrame {
    private JPanel pnlPrincipal;
    private JButton button1;

    public FrmInternalModificarResultado(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

    }
}

