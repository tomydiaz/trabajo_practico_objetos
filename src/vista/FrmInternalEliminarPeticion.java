package vista;

import javax.swing.*;

public class FrmInternalEliminarPeticion extends JInternalFrame {

    private JPanel pnlPrincipal;

    public FrmInternalEliminarPeticion(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

    }
}