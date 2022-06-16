package vista;

import javax.swing.*;

public class FrmInternalAdministrarUsuarios extends JInternalFrame{

    private JPanel pnlPrincipal;

    public FrmInternalAdministrarUsuarios(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

    }
}

