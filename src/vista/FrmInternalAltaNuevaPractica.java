package vista;

import javax.swing.*;
import java.awt.*;

public class FrmInternalAltaNuevaPractica extends JInternalFrame{
    private JPanel pnlPrincipal;

    public FrmInternalAltaNuevaPractica(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

    }
}

