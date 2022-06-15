package vista;

import javax.swing.*;
import java.awt.*;

public class FrmPacientes extends JDialog {
    private JPanel pnlPrincipal;
    private JDesktopPane desktopPaneIngresarPaciente;
    private JDesktopPane desktopPaneModificarPaciente;
    private JDesktopPane desktopPaneEliminarPaciente;

    public FrmPacientes(Window owner, String titulo)
    {
        super(owner, titulo);

        this.setContentPane(pnlPrincipal);

        this.setSize(400, 400);
        //Esto no permite volver a la pantalla anterior hasta cerrar esta
        this.setModal(true);
        //Esto establece el comportamiento a la hora de cerrarse
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Esto Hace que la pantalla inicie centrada
        this.setLocationRelativeTo(null);

        FrmInternalIngresarPaciente frameIngresarPaciente = new FrmInternalIngresarPaciente("Datos Del Paciente");
        frameIngresarPaciente.setVisible(true);
        desktopPaneIngresarPaciente.add(frameIngresarPaciente);

        FrmInternalModificarPaciente frameModificarPaciente = new FrmInternalModificarPaciente("Modificar Paciente");
        frameModificarPaciente.setVisible(true);
        desktopPaneModificarPaciente.add(frameModificarPaciente);

        FrmInternalEliminarPaciente frameEliminarPaciente = new FrmInternalEliminarPaciente("Eliminar Paciente");
        frameEliminarPaciente.setVisible(true);
        desktopPaneEliminarPaciente.add(frameEliminarPaciente);
    }
}
