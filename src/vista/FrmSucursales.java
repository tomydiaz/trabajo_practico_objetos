package vista;

import javax.swing.*;
import java.awt.*;

public class FrmSucursales extends JDialog{

    private JPanel pnlPrincipal;
    private JTabbedPane tabbedPane1;
    private JDesktopPane desktopPaneEliminarSucursal;
    private JDesktopPane desktopPaneModificarSucursal;
    private JDesktopPane desktopPaneAltaNuevaSucursal;

    public FrmSucursales(Window owner, String titulo) {
        super(owner, titulo);

        this.setContentPane(pnlPrincipal);

        this.setSize(400, 400);
        //Esto no permite volver a la pantalla anterior hasta cerrar esta
        this.setModal(true);
        //Esto establece el comportamiento a la hora de cerrarse
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Esto Hace que la pantalla inicie centrada
        this.setLocationRelativeTo(null);

    }
}
