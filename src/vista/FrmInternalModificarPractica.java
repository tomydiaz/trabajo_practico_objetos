package vista;

import javax.swing.*;

public class FrmInternalModificarPractica extends JInternalFrame{
    private JPanel pnlPrincipal;
    private JTextField textField1;
    private JButton buscarButton;

    public FrmInternalModificarPractica(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

    }
}