package vista;

import javax.swing.*;

public class FrmInternalAltaNuevaPractica extends JInternalFrame{
    private JPanel pnlPrincipal;
    private JTextField textField1;
    private JButton ingresarButton;

    public FrmInternalAltaNuevaPractica(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

    }
}

