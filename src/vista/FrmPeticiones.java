package vista;

import javax.swing.*;
import java.awt.*;

public class FrmPeticiones extends JDialog {

    private JDesktopPane desktopPaneNuevaPeticion;
    private JDesktopPane desktopPaneModificarPeticion;
    private JDesktopPane desktopPaneEliminarPeticion;
    private JPanel pnlPrincipal;

    public FrmPeticiones(Window owner, String titulo){
        super(owner, titulo);

        this.setContentPane(pnlPrincipal);
        this.setSize(400, 400);
        //Esto no permite volver a la pantalla anterior hasta cerrar esta
        this.setModal(true);
        //Esto establece el comportamiento a la hora de cerrarse
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Esto Hace que la pantalla inicie centrada
        this.setLocationRelativeTo(null);

        FrmInternalNuevaPeticion frameNuevaPeticion = new FrmInternalNuevaPeticion("");
        frameNuevaPeticion.setVisible(true);
        desktopPaneNuevaPeticion.add(frameNuevaPeticion);

        FrmInternalModificarPeticion frameModificarPeticion = new FrmInternalModificarPeticion("");
        frameModificarPeticion.setVisible(true);
        desktopPaneModificarPeticion.add(frameModificarPeticion);

        FrmInternalEliminarPeticion frameEliminarPeticion = new FrmInternalEliminarPeticion("");
        frameEliminarPeticion.setVisible(true);
        desktopPaneEliminarPeticion.add(frameEliminarPeticion);
    }
}
