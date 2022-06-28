package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInternalAltaNuevaPractica extends JInternalFrame{
    private JPanel pnlPrincipal;
    private JTextField textField1;
    private JButton ingresarButton;
    private JTextField textField2;

    public FrmInternalAltaNuevaPractica(String titulo) {
        super(titulo);
        this.setContentPane(pnlPrincipal);
        this.setBorder(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "La carga de la practica fue exitosa");


            }
        });

    }
}

