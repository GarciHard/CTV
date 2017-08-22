package controladorSAV;
//@author GarciHard
import java.awt.Color;
import vistaSAV.LoginCTV;
import modeloSAV.SAVUsuariosDAO;
import modeloSAV.SAVUsuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import modeloSAV.SAVEmpleadosDAO;
import modeloSAV.SAVPasajerosDAO;
import vistaSAV.AdministradorSAV;
import vistaSAV.EmpleadoSAV;

public class LoginControlador implements MouseListener, ActionListener {
    SAVUsuariosDAO userDAO;
    SAVUsuarios user;
    LoginCTV logFrame = new LoginCTV();
    
    public LoginControlador(LoginCTV logFrame, SAVUsuariosDAO userDAO) {
        this.userDAO = userDAO;
        this.logFrame = logFrame;
        this.logFrame.btnAcceso.addActionListener(this);
        this.logFrame.btnAcceso.addMouseListener(this);
        logFrame.menuAcercade.addActionListener(this);
        logFrame.menuAyudaLogin.addActionListener(this);
        logFrame.menuSalir.addActionListener(this);
    }
    
    public void inicializarLogin() {
        logFrame.setLocationRelativeTo(null);
        logFrame.setVisible(true);
        logFrame.btnAcceso.grabFocus();
    }
    
    @Override
    /*Evento del boton de acceso, valida los datos del usuario brindandole acceso al sistema*/
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == logFrame.btnAcceso) {
            user = new SAVUsuarios(logFrame.txtUsuario.getText().toLowerCase(), logFrame.txtContraseña.getText().toLowerCase());
            switch (userDAO.validarLogin(user)) {
                case "administrador sistema":
                    AdminControlador admFrame = new AdminControlador(new AdministradorSAV(), new SAVEmpleadosDAO());
                    logFrame.dispose();
                    admFrame.inicializarAdmin();
                    break;
                case "empleado trafico":
                    EmpleadoControlador empFrame = new EmpleadoControlador(new EmpleadoSAV(), new SAVPasajerosDAO());
                    logFrame.dispose();
                    empFrame.inicializarEmp();
                    break;
                case "":
                    logFrame.txtUsuario.setText(null);
                    logFrame.txtContraseña.setText(null);
                    break;
            }
        }
        /*MenuAcercaDe, da una breve explicación acerca de la aplicación*/
        if (evt.getSource() == logFrame.menuAcercade) {
            JOptionPane.showMessageDialog(null, "Aplicación desarrollada para el tráfico de\n"
                    + "vuelos de una aerolinea privada.\n\n"
                    + "Desarrollada por Alexis García.\n\n"
                    + "Version 0.3", "Acerca de", -1, null);
        }
        /*MenuAyuda, da una breve explicación acerca del funcionamiento de logeo*/
        if (evt.getSource() == logFrame.menuAyudaLogin) {
            JOptionPane.showMessageDialog(null, "Usuario = \'Usuario previamente registrado por el empleado para tener acceso al sistema.\'\n"
                    + "Contraseña = \'Contraseña registrada por el empleado al dar de alta su usuario.\'\n"
//                    + "Administrador =\'En caso de tener rol Administrativo\'\n"
//                    + "Personal = \'Opción para la mayoría de empleados\'\n\n"
                    + "\n\'\'En caso de olvidar usuario y/o contraseña contactar al administrador\'\'",
                    "Ayuda de Inicio de Sesión", 2, null);
        }
        /*MenuSalir, cierra la aplicación(JFrame Principal)*/
        if (evt.getSource() == logFrame.menuSalir) {
            System.exit(0);
        }
    }
    /*Eventos del ratón*/
    @Override
    public void mousePressed(MouseEvent evt) {
        logFrame.btnAcceso.setBackground(new Color(192, 57, 43));
    }
    @Override
    public void mouseReleased(MouseEvent evt) {
        logFrame.btnAcceso.setBackground(new Color(211,84,0));
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        logFrame.btnAcceso.setBackground(new Color(192, 57, 43));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        logFrame.btnAcceso.setBackground(new Color(211,84,0));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        logFrame.btnAcceso.setBackground(new Color(211,84,0));
    }
}
