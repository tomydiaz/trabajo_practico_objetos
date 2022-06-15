package vista;

import javax.swing.*;

public class FrmInternalEliminarPractica extends JInternalFrame {
    private JPanel pnlPrincipal;

    public FrmInternalEliminarPractica(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

    }

}

