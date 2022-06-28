package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalModificarPractica extends JInternalFrame{
    private JPanel pnlPrincipal;
    private JTextField textField1;
    private JButton buscarButton;
    private JTextField textCodigoModificar;
    private JTextField textNombreModificar;
    private JTextField textHorasResultadoModificar;
    private JButton guardarButton;

    public FrmInternalModificarPractica(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "La modificación fue exitosa");

            }
        });
    }
}