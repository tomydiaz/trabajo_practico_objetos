package vista;

import javax.swing.*;
import java.awt.*;

public class FrmResultados extends JDialog {
    private JPanel pnlPrincipal;
    private JDesktopPane desktopPaneAltaNuevoResutado;
    private JDesktopPane desktopPaneModificarResultado;
    private JDesktopPane desktopPaneEliminarResultado;

    public FrmResultados(Window owner, String titulo) {
        super(owner, titulo);

        this.setContentPane(pnlPrincipal);
        this.setSize(400, 400);
        this.setModal(true);
        //Esto establece el comportamiento a la hora de cerrarse
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Esto Hace que la pantalla inicie centrada
        this.setLocationRelativeTo(null);

        FrmInternalAltaNuevoResultado frameAltaNuevoResutado = new FrmInternalAltaNuevoResultado("");
        frameAltaNuevoResutado.setVisible(true);
        desktopPaneAltaNuevoResutado.add(frameAltaNuevoResutado);

        FrmInternalModificarResultado frameModificarResultado = new FrmInternalModificarResultado("");
        frameModificarResultado.setVisible(true);
        desktopPaneModificarResultado.add(frameModificarResultado);

        FrmInternalEliminarResultado frameEliminarResultado = new FrmInternalEliminarResultado("");
        frameEliminarResultado.setVisible(true);
        desktopPaneEliminarResultado.add(frameEliminarResultado);
    }
}
