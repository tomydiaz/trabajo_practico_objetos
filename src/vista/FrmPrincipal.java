package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmPrincipal extends JFrame {

    private JPanel pnlPrincipal;
    private JPanel pnlMenu;
    private JButton pacientesButton;
    private JButton resultadosButton;
    private JButton practicasButton;
    private JButton peticionesButton;
    private JPanel pnlTitulo;
    private JButton sucursalesButton;
    private JButton usuariosButton1;
    private JPanel pnlBottom;

    private FrmPrincipal self;

    public FrmPrincipal(String titulo)
    {
        super(titulo);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        this.setContentPane(pnlPrincipal);
        this.setSize(700, 700);
        //Esto establece el comportamiento a la hora de cerrarse
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Esto Hace que la pantalla inicie centrada
        this.setLocationRelativeTo(null);
        this.asociarEventos();

        this.self = this;
    }

    private void asociarEventos() {
        pacientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                FrmPacientes frame = new FrmPacientes(self, "Pacientes"); /////////////ACA QUEDE MIN 41.28
                frame.setVisible(true);
                            }
        });
    }

    public static void main(String[] args) {
        FrmPrincipal frame = new FrmPrincipal("GESTIÓN DE LABORATORIO");
        frame.setVisible(true);
    }
}
