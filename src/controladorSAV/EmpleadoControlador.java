package controladorSAV;
//<<Hecho con <3 por GarciHard xD n_n *-* :D>>
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modeloSAV.SAVPasajerosDAO;
import modeloSAV.SAVUsuariosDAO;
import vistaSAV.EmpleadoSAV;
import vistaSAV.LoginCTV;
import vistaSAV.PanelEmpleadoAdmin;
import vistaSAV.PanelOrdenesEmpleado;
import vistaSAV.PanelReservacionesEmpleado;


public class EmpleadoControlador implements MouseListener, ActionListener {

    EmpleadoSAV empFrame = new EmpleadoSAV();
    SAVPasajerosDAO pasajeroDAO = new SAVPasajerosDAO();
    PanelReservacionesEmpleado panelResEmp = new PanelReservacionesEmpleado();
    PanelOrdenesEmpleado panelOrdenEmp = new PanelOrdenesEmpleado();

    public EmpleadoControlador(EmpleadoSAV empFrame, SAVPasajerosDAO pasajeroDAO) {
        this.empFrame = empFrame;
        this.pasajeroDAO = pasajeroDAO;
        this.empFrame.btnEmpleadoVuelos.addActionListener(this);
        this.empFrame.btnEmpleadoVuelos.addMouseListener(this);
        this.empFrame.btnEmpleadoOrdenes.addActionListener(this);
        this.empFrame.btnEmpleadoOrdenes.addMouseListener(this);
        this.empFrame.btnEmpleadoCambiarUsuario.addActionListener(this);
        this.empFrame.btnEmpleadoCambiarUsuario.addMouseListener(this);
        this.empFrame.btnEmpleadoSalir.addActionListener(this);
        this.empFrame.btnEmpleadoSalir.addMouseListener(this);
        this.panelResEmp.btnResEmpNuevoPasajero.addActionListener(this);
        this.panelResEmp.btnResEmpNuevoPasajero.addMouseListener(this);
        this.panelResEmp.btnResEmpGuardarPas.addActionListener(this);
        this.panelResEmp.btnResEmpGuardarPas.addMouseListener(this);
        this.panelResEmp.btnResEmpModificarPas.addActionListener(this);
        this.panelResEmp.btnResEmpModificarPas.addMouseListener(this);
        this.panelResEmp.btnResEmpEliminarPas.addActionListener(this);
        this.panelResEmp.btnResEmpEliminarPas.addMouseListener(this);
        this.panelResEmp.btnResEmpBuscarPas.addActionListener(this);
        this.panelResEmp.btnResEmpBuscarPas.addMouseListener(this);
        this.panelResEmp.btnResEmpListarPasajeros.addActionListener(this);
        this.panelResEmp.btnResEmpListarPasajeros.addMouseListener(this);
        
    }
    
    public void inicializarEmp() {
        panelOrdenEmp.setSize(1158,610);
        panelOrdenEmp.setVisible(false);
        panelResEmp.setSize(1158, 610);
        empFrame.panelEmpleadoGral.add(panelResEmp);
        empFrame.panelEmpleadoGral.add(panelOrdenEmp);
        empFrame.setVisible(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == empFrame.btnEmpleadoSalir) {
            LoginControlador logFrame = new LoginControlador(new LoginCTV(), new SAVUsuariosDAO());
            empFrame.dispose();
            logFrame.inicializarLogin();
        }
        if (evt.getSource() == empFrame.btnEmpleadoVuelos) {
            panelResEmp.setVisible(true);
            panelOrdenEmp.setVisible(false);
        }
        if (evt.getSource() == empFrame.btnEmpleadoOrdenes) {
            panelResEmp.setVisible(false);
            panelOrdenEmp.setVisible(true);
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}    
}
