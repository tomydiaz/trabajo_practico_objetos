package vista;

import javax.swing.*;

public class FrmInternalModificarPeticion extends JInternalFrame {

    private JPanel pnlPrincipal;

    public FrmInternalModificarPeticion(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

    }
}