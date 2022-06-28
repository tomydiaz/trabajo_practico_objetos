package vista;

import controller.LaboratorioController;
import modelo.Paciente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalModificarPeticion extends JInternalFrame {

    private JPanel pnlPrincipal;
    private JTextField textCodigoPeticionModificar;
    private JButton buscarButton;
    private JTextField textObraSocialModificar;
    private JTextField textFechaDeCargaModificar;
    private JTextField textEstadoModificar;
    private JButton cargarButton;

    public FrmInternalModificarPeticion(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                


            }
        });
    }
}