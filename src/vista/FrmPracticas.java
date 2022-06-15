package vista;

import javax.swing.*;
import java.awt.*;

public class FrmPracticas extends JDialog {
    private JPanel pnlPrincipal;
    private JPanel desktopPaneAltaNuevaPractica;
    private JDesktopPane desktopPaneModificarPractica;
    private JDesktopPane desktopPaneEliminarPractica;

    public FrmPracticas(Window owner, String titulo) {
        super(owner, titulo);

        this.setContentPane(pnlPrincipal);
        this.setSize(400, 400);
        this.setModal(true);
        //Esto establece el comportamiento a la hora de cerrarse
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Esto Hace que la pantalla inicie centrada
        this.setLocationRelativeTo(null);

        FrmInternalAltaNuevaPractica frameAltaNuevaPractica = new FrmInternalAltaNuevaPractica("");
        frameAltaNuevaPractica.setVisible(true);
        desktopPaneAltaNuevaPractica.add(frameAltaNuevaPractica);

        FrmInternalModificarPractica frameModificarPractica = new FrmInternalModificarPractica("");
        frameModificarPractica.setVisible(true);
        desktopPaneModificarPractica.add(frameModificarPractica);

        FrmInternalEliminarPractica frameEliminarPractica = new FrmInternalEliminarPractica("");
        frameEliminarPractica.setVisible(true);
        desktopPaneEliminarPractica.add(frameEliminarPractica);
    }
}

