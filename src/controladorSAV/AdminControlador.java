package controladorSAV;
//@author GarciHard
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modeloSAV.PreviewChooser;
import modeloSAV.SAVEmpleados;
import modeloSAV.SAVEmpleadosDAO;
import modeloSAV.SAVUsuarios;
import modeloSAV.SAVUsuariosDAO;
import vistaSAV.AdministradorSAV;
import vistaSAV.LoginCTV;
import vistaSAV.PanelAvionAdmin;
import vistaSAV.PanelEmpleadoAdmin;

public class AdminControlador implements MouseListener, ActionListener {

    AdministradorSAV admFrame = new AdministradorSAV();
    PanelEmpleadoAdmin panelAdminEmp = new PanelEmpleadoAdmin();
    PanelAvionAdmin panelAdminAvion = new PanelAvionAdmin();
    SAVEmpleados empleadoOb;
    SAVEmpleadosDAO empleadoDAO;
    SAVUsuarios usuarioOb;
    ArrayList<String> empArreglo = new ArrayList<String>();
    ArrayList<String> nvoEmp;
    String imURL;

    public AdminControlador(AdministradorSAV admFrame, SAVEmpleadosDAO empleadoDAO) {
        this.admFrame = admFrame;
        this.empleadoDAO = empleadoDAO;
        this.admFrame.btnAdminEmpleados.addActionListener(this);
        this.admFrame.btnAdminAviones.addActionListener(this);
        this.admFrame.btnAdminCerrarSesion.addActionListener(this);
        this.admFrame.btnAdminCerrarSesion.addMouseListener(this);
        this.panelAdminEmp.btnEmpAdminFoto.addActionListener(this);
        this.panelAdminEmp.btnEmpAdminNuevoEmp.addActionListener(this);
        this.panelAdminEmp.btnEmpAdminNuevoEmp.addMouseListener(this);
        this.panelAdminEmp.btnEmpAdminBuscarEmp.addActionListener(this);
        this.panelAdminEmp.btnEmpAdminBuscarEmp.addMouseListener(this);
        this.panelAdminEmp.btnEmpAdminListarEmpleados.addActionListener(this);
        this.panelAdminEmp.btnEmpAdminListarEmpleados.addMouseListener(this);
        this.panelAdminEmp.btnEmpAdminModificarEmp.addActionListener(this);
        this.panelAdminEmp.btnEmpAdminModificarEmp.addMouseListener(this);
        this.panelAdminEmp.btnEmpAdminEliminarEmp.addActionListener(this);
        this.panelAdminEmp.btnEmpAdminEliminarEmp.addMouseListener(this);
        this.panelAdminEmp.btnEmpAdminGuardarEmp.addActionListener(this);
        this.panelAdminEmp.btnEmpAdminGuardarEmp.addMouseListener(this);
        this.panelAdminEmp.btnEmpAdminCancelar.addActionListener(this);
        this.panelAdminEmp.btnEmpAdminCancelar.addMouseListener(this);
        this.panelAdminAvion.btnAvionAdminNuevoAvion.addActionListener(this);
        this.panelAdminAvion.btnAvionAdminNuevoAvion.addMouseListener(this);
        this.panelAdminAvion.btnAvionAdminBuscarAvion.addActionListener(this);
        this.panelAdminAvion.btnAvionAdminBuscarAvion.addMouseListener(this);
        this.panelAdminAvion.btnAvionAdminModificarAvion.addActionListener(this);
        this.panelAdminAvion.btnAvionAdminModificarAvion.addMouseListener(this);
        this.panelAdminAvion.btnAvionAdminEliminarAvion.addActionListener(this);
        this.panelAdminAvion.btnAvionAdminEliminarAvion.addMouseListener(this);
        this.panelAdminAvion.btnAvionAdminGuardarAvion.addActionListener(this);
        this.panelAdminAvion.btnAvionAdminGuardarAvion.addMouseListener(this);
    }

    public void inicializarAdmin() {
        panelAdminAvion.setSize(1158,610);
        admFrame.panelAdminGral.add(panelAdminAvion);
        /*******************PanelEmpleadoAdmin*****************************************************/
        //new Color(189, 195, 199) color por si no agrada el Color.LIGHT_GRAY
        //Aquí deshabilitamos todos los botones excepto Buscar, Listar y Nuevo
        panelAdminEmp.btnEmpAdminEliminarEmp.setEnabled(false);
        panelAdminEmp.btnEmpAdminEliminarEmp.setBackground(Color.LIGHT_GRAY);
        panelAdminEmp.btnEmpAdminEliminarEmp.setForeground(Color.BLACK);
        panelAdminEmp.btnEmpAdminGuardarEmp.setEnabled(false);
        panelAdminEmp.btnEmpAdminGuardarEmp.setBackground(Color.LIGHT_GRAY);
        panelAdminEmp.btnEmpAdminGuardarEmp.setForeground(Color.BLACK);
        panelAdminEmp.btnEmpAdminModificarEmp.setEnabled(false);
        panelAdminEmp.btnEmpAdminModificarEmp.setBackground(Color.LIGHT_GRAY);
        panelAdminEmp.btnEmpAdminModificarEmp.setForeground(Color.BLACK);
        panelAdminEmp.btnEmpAdminFoto.setEnabled(false);
        //Aqui deshabilitamos todos los campos de texto sin excepción alguna
        panelAdminEmp.lblEmpAdminNumeroEmpleado.setVisible(false);
        panelAdminEmp.txtEmpAdminNumeroEmpleado.setVisible(false);
        panelAdminEmp.txtEmpAdminNombre.setEnabled(false);
        panelAdminEmp.txtEmpAdminApellidoPaterno.setEnabled(false);
        panelAdminEmp.txtEmpAdminApellidoMaterno.setEnabled(false);
        panelAdminEmp.txtEmpAdminFechaNacimiento.setEnabled(false);
        panelAdminEmp.txtEmpAdminRFC.setEnabled(false);
        panelAdminEmp.rbtFemenino.setEnabled(false);
        panelAdminEmp.rbtMasculino.setEnabled(false);
        panelAdminEmp.txtEmpAdminDomicilio.setEnabled(false);
        panelAdminEmp.txtEmpAdminTelefono.setEnabled(false);
        panelAdminEmp.txtEmpAdminEMail.setEnabled(false);
        panelAdminEmp.txtEmpAdminNivelEstudios.setEnabled(false);
        panelAdminEmp.comboEmpAdminCargo.setEnabled(false);
        panelAdminEmp.comboEmpAdminHorario.setEnabled(false);
        panelAdminEmp.txtEmpAdminUsuario.setEnabled(false);
        panelAdminEmp.txtEmpAdminContraseña.setEnabled(false);
        panelAdminEmp.tablaEmpAdminListadoPersonal.setEnabled(true);//modificar a false
        panelAdminEmp.setSize(1158, 610);
        /****************FinPanelEmpleadoAdmin*****************************************************/
        admFrame.panelAdminGral.add(panelAdminEmp);
        panelAdminAvion.setVisible(false);
        admFrame.setVisible(true);
    }
    
    /*Eventos de los botones*/
    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == admFrame.btnAdminEmpleados) {
            this.panelAdminAvion.setVisible(false);
            panelAdminEmp.setVisible(true);
        }
        if(evt.getSource() == admFrame.btnAdminAviones) {
            this.panelAdminEmp.setVisible(false);
            this.panelAdminAvion.setVisible(true);
        }
        if (evt.getSource() == admFrame.btnAdminCerrarSesion) {
            LoginControlador logFrame = new LoginControlador(new LoginCTV(), new SAVUsuariosDAO());
            admFrame.dispose();
            logFrame.inicializarLogin();
        }
        //Evento del Boton Nuevo Empleado
        if (evt.getSource() == panelAdminEmp.btnEmpAdminNuevoEmp) {
            /****Deshabilitamos los campos Buscar, Listar para que no se puedan utilizar al momento de ingresar un nvoEmp****/
            /*También deshabilitamos los botones Modificar y Eliminar, ya que no serán requeridos al momento de ingresar nvoEmp*/
            panelAdminEmp.btnEmpAdminBuscarEmp.setEnabled(false);
            panelAdminEmp.btnEmpAdminBuscarEmp.setBackground(Color.LIGHT_GRAY);
            panelAdminEmp.btnEmpAdminBuscarEmp.setForeground(Color.BLACK);
            panelAdminEmp.btnEmpAdminListarEmpleados.setEnabled(false);
            panelAdminEmp.btnEmpAdminListarEmpleados.setBackground(Color.LIGHT_GRAY);
            panelAdminEmp.btnEmpAdminListarEmpleados.setForeground(Color.BLACK);
            panelAdminEmp.btnEmpAdminModificarEmp.setVisible(false);
            panelAdminEmp.btnEmpAdminEliminarEmp.setVisible(false);
            panelAdminEmp.btnEmpAdminNuevoEmp.setVisible(false);/*inclusive deshabilitamos
            el boton de nuevo, ya que solo podremos usar opción de guardar o cancelar*/
            panelAdminEmp.txtEmpAdminBuscarEmp.setEnabled(false);
            /****Habilitamos todos los campos para poder ingresar los datos en ellos obviiiiiii****/
            panelAdminEmp.btnEmpAdminCancelar.setBackground(new Color(0,100,133));
            panelAdminEmp.btnEmpAdminCancelar.setForeground(new Color(255,255,255));
            panelAdminEmp.btnEmpAdminCancelar.setVisible(true);
            panelAdminEmp.btnEmpAdminGuardarEmp.setEnabled(true);
            panelAdminEmp.btnEmpAdminGuardarEmp.setBackground(new Color(0,100,133));
            panelAdminEmp.btnEmpAdminGuardarEmp.setForeground(new Color(255,255,255));
            panelAdminEmp.btnEmpAdminFoto.setEnabled(true);
            panelAdminEmp.txtEmpAdminNombre.setEnabled(true);
            panelAdminEmp.txtEmpAdminApellidoPaterno.setEnabled(true);
            panelAdminEmp.txtEmpAdminApellidoMaterno.setEnabled(true);
            panelAdminEmp.txtEmpAdminFechaNacimiento.setEnabled(true);
            panelAdminEmp.txtEmpAdminRFC.setEnabled(true);
            panelAdminEmp.rbtFemenino.setEnabled(true);
            panelAdminEmp.rbtMasculino.setEnabled(true);
            panelAdminEmp.txtEmpAdminDomicilio.setEnabled(true);
            panelAdminEmp.txtEmpAdminTelefono.setEnabled(true);
            panelAdminEmp.txtEmpAdminEMail.setEnabled(true);
            panelAdminEmp.txtEmpAdminNivelEstudios.setEnabled(true);
            panelAdminEmp.comboEmpAdminCargo.setEnabled(true);
            panelAdminEmp.comboEmpAdminHorario.setEnabled(true);
            panelAdminEmp.txtEmpAdminUsuario.setEnabled(true);
            panelAdminEmp.txtEmpAdminContraseña.setEnabled(true);
        }
        //Fin del Evento del Boton Nuevo Empleado
        
        if (evt.getSource() == panelAdminEmp.btnEmpAdminGuardarEmp) {
            nvoEmp = new ArrayList<String>();
            nvoEmp.add(panelAdminEmp.txtEmpAdminNombre.getText());
            nvoEmp.add(panelAdminEmp.txtEmpAdminApellidoPaterno.getText());
            nvoEmp.add(panelAdminEmp.txtEmpAdminApellidoMaterno.getText());
            nvoEmp.add(panelAdminEmp.txtEmpAdminFechaNacimiento.getDate().toString());
            nvoEmp.add(panelAdminEmp.txtEmpAdminRFC.getText());
            if (panelAdminEmp.rbtMasculino.isSelected()) {
                nvoEmp.add("M");
            } if (panelAdminEmp.rbtFemenino.isSelected()) {
                nvoEmp.add("F");
            }
            nvoEmp.add(panelAdminEmp.txtEmpAdminDomicilio.getText());
            nvoEmp.add(panelAdminEmp.txtEmpAdminTelefono.getText());
            nvoEmp.add(panelAdminEmp.txtEmpAdminEMail.getText());
            nvoEmp.add(panelAdminEmp.txtEmpAdminNivelEstudios.getText());
            
            switch(panelAdminEmp.comboEmpAdminCargo.getSelectedIndex()) {
                case 1:
                    nvoEmp.add("Administrador Sistema");
                    break;
                case 2:
                    nvoEmp.add("Empleado Trafico");
                    break;
            }
            switch(panelAdminEmp.comboEmpAdminHorario.getSelectedIndex()) {
                case 1:
                    nvoEmp.add("Matutino 7:00 - 15:00");
                    break;
                case 2:
                    nvoEmp.add("Vespertino 15:00 - 23:00");
                    break;
            }
            nvoEmp.add(imURL);
            nvoEmp.add(panelAdminEmp.txtEmpAdminUsuario.getText());
            nvoEmp.add(panelAdminEmp.txtEmpAdminContraseña.getText());
            System.out.println(nvoEmp.size());
            for(int i = 0; i <= nvoEmp.size(); i++) {
                System.out.println(nvoEmp.get(i));
            }
            if (empleadoDAO.insertarEmpleado(nvoEmp)) {
                JOptionPane.showMessageDialog(null, "Empleado Agregado");
            } else {
                
            }
        }
        if (evt.getSource() == panelAdminEmp.btnEmpAdminFoto) {
            try {
                imURL = abrir().toString();
                ImageIcon imagenE = new ImageIcon(imURL);
                panelAdminEmp.btnEmpAdminFoto.setIcon(new ImageIcon(imagenE.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Debes elegir una imagen");
            }
        }
            
        
        
        
        if (evt.getSource() == panelAdminEmp.btnEmpAdminBuscarEmp) {/*<Boton buscar Empleados>*/
            if (panelAdminEmp.txtEmpAdminBuscarEmp.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo Buscar Vacio"
                        + "\n\nIntente nuevamente", "ERROR", 0, null);
                panelAdminEmp.txtEmpAdminBuscarEmp.setText("");
            } else {
                empleadoOb = new SAVEmpleados(panelAdminEmp.txtEmpAdminBuscarEmp.getText().toUpperCase());
                if (!(empArreglo = empleadoDAO.buscarEmpleado(empleadoOb)).isEmpty()) {
                    panelAdminEmp.txtEmpAdminNumeroEmpleado.setText(empArreglo.get(0));
                    panelAdminEmp.txtEmpAdminNombre.setText(empArreglo.get(1));
                    panelAdminEmp.txtEmpAdminApellidoPaterno.setText(empArreglo.get(2));
                    panelAdminEmp.txtEmpAdminApellidoMaterno.setText(empArreglo.get(3));
                    panelAdminEmp.txtEmpAdminFechaNacimiento.setDateFormatString(empArreglo.get(4));
                    panelAdminEmp.txtEmpAdminRFC.setText(empArreglo.get(5));
                    switch (empArreglo.get(6)) {
                        case "M":
                            panelAdminEmp.rbtMasculino.setSelected(true);
                            panelAdminEmp.rbtFemenino.setSelected(false);
                            break;
                        case "F":
                            panelAdminEmp.rbtMasculino.setSelected(false);
                            panelAdminEmp.rbtFemenino.setSelected(true);
                            break;
                    }
                    panelAdminEmp.txtEmpAdminDomicilio.setText(empArreglo.get(7));
                    panelAdminEmp.txtEmpAdminTelefono.setText(empArreglo.get(8));
                    panelAdminEmp.txtEmpAdminEMail.setText(empArreglo.get(9));
                    panelAdminEmp.txtEmpAdminNivelEstudios.setText(empArreglo.get(10));
                    switch (empArreglo.get(11)) {
                        case "Administrador Sistema":
                            panelAdminEmp.comboEmpAdminCargo.setSelectedIndex(1);
                            break;
                        case "Empleado Trafico":
                            panelAdminEmp.comboEmpAdminCargo.setSelectedIndex(2);
                            break;
                    }
                    switch (empArreglo.get(12)) {
                        case "Matutino 7:00 - 15:00":
                            panelAdminEmp.comboEmpAdminHorario.setSelectedIndex(1);
                            break;
                        case "Vespertino 15:00 - 23:00":
                            panelAdminEmp.comboEmpAdminHorario.setSelectedIndex(2);
                            break;
                    }
                    ImageIcon img = new ImageIcon(empArreglo.get(13));
                    panelAdminEmp.btnEmpAdminFoto.setIcon(new ImageIcon(img.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
                    panelAdminEmp.txtEmpAdminUsuario.setText(empArreglo.get(14));
                    panelAdminEmp.txtEmpAdminContraseña.setText(empArreglo.get(15));
                    empArreglo.clear();
                } else {
                    JOptionPane.showMessageDialog(null, "Empleado No Encontrado"
                            + "\n\nIntente nuevamente", "ERROR", 0, null);
                    panelAdminEmp.txtEmpAdminBuscarEmp.setText("");
                }
            }
        }
        if (evt.getSource() == panelAdminEmp.btnEmpAdminListarEmpleados) {
            if (!(empArreglo = empleadoDAO.listarEmpleado()).isEmpty()) {
                DefaultTableModel modelo = new DefaultTableModel();
                panelAdminEmp.tablaEmpAdminListadoPersonal.setModel(modelo);
                modelo.addColumn("No. Empleado");
                modelo.addColumn("Nombre(s)");
                modelo.addColumn("Apellido Pat.");
                modelo.addColumn("Apellido Mat.");
                String[] fila = new String[modelo.getColumnCount()];
                for (int i = 0; i < empArreglo.size(); i++) {
                    fila[i] = empArreglo.get(i);
                    modelo.addRow(fila);
                }
            }
        }//fin evento listar
    }
    
    /*Eventos Raton, cambiar el color de los botones al hacer click*/
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == admFrame.btnAdminCerrarSesion) {//boton cerrar sesion
            admFrame.btnAdminCerrarSesion.setBackground(new Color(192, 57, 43));
        }
        /**********************************Eventos de raton de los botones contenidos en el PanelEmpleadoAdmin******************************/
        if (e.getSource() == panelAdminEmp.btnEmpAdminCancelar) {
            panelAdminEmp.btnEmpAdminCancelar.setBackground(new Color(0, 81, 108));
        }
        //boton agregar nuevo empleado
        if (e.getSource() == panelAdminEmp.btnEmpAdminNuevoEmp && (panelAdminEmp.btnEmpAdminNuevoEmp.isEnabled())) {
            panelAdminEmp.btnEmpAdminNuevoEmp.setBackground(new Color(0, 81, 108));
        }
        //boton buscar empleado
        if (e.getSource() == panelAdminEmp.btnEmpAdminBuscarEmp && (panelAdminEmp.btnEmpAdminBuscarEmp.isEnabled())) {
            panelAdminEmp.btnEmpAdminBuscarEmp.setBackground(new Color(0, 81, 108));
        }
        //boton listar empleados
        if(e.getSource() == panelAdminEmp.btnEmpAdminListarEmpleados && (panelAdminEmp.btnEmpAdminListarEmpleados.isEnabled())) {
            panelAdminEmp.btnEmpAdminListarEmpleados.setBackground(new Color(0,81,108));
        }
        //boton modificar empleado
        if (e.getSource() == panelAdminEmp.btnEmpAdminModificarEmp && (panelAdminEmp.btnEmpAdminModificarEmp.isEnabled())){
            panelAdminEmp.btnEmpAdminModificarEmp.setBackground(new Color(0, 81, 108));
        }
        //boton eliminar empleado
        if (e.getSource() == panelAdminEmp.btnEmpAdminEliminarEmp && (panelAdminEmp.btnEmpAdminEliminarEmp.isEnabled())) {
            panelAdminEmp.btnEmpAdminEliminarEmp.setBackground(new Color(0, 81, 108));
        }
        //boton guardar empleado
        if (e.getSource() == panelAdminEmp.btnEmpAdminGuardarEmp && (panelAdminEmp.btnEmpAdminGuardarEmp.isEnabled())) {
            panelAdminEmp.btnEmpAdminGuardarEmp.setBackground(new Color(0, 81, 108));
        }
        /*************Fin de los Eventos de raton de los botones contenidos en el PanelEmpleadoAdmin*************/
        if (e.getSource() == panelAdminAvion.btnAvionAdminNuevoAvion) {
            panelAdminAvion.btnAvionAdminNuevoAvion.setBackground(new Color(22, 160, 133));
        }
        if (e.getSource() == panelAdminAvion.btnAvionAdminBuscarAvion) {
            panelAdminAvion.btnAvionAdminBuscarAvion.setBackground(new Color(22, 160, 133));
        }
        if (e.getSource() == panelAdminAvion.btnAvionAdminModificarAvion) {
            panelAdminAvion.btnAvionAdminModificarAvion.setBackground(new Color(22, 160, 133));
        }
        if (e.getSource() == panelAdminAvion.btnAvionAdminEliminarAvion) {
            panelAdminAvion.btnAvionAdminEliminarAvion.setBackground(new Color(22, 160, 133));
        }
        if (e.getSource() == panelAdminAvion.btnAvionAdminGuardarAvion) {
            panelAdminAvion.btnAvionAdminGuardarAvion.setBackground(new Color(22, 160, 133));
        }
    }
    
    /*Eventos Raton, regresa al color original del botón después de dar click*/
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == admFrame.btnAdminCerrarSesion) {
            admFrame.btnAdminCerrarSesion.setBackground(new Color(211, 84, 0));
        }
        if (e.getSource() == panelAdminEmp.btnEmpAdminCancelar) {
            panelAdminEmp.btnEmpAdminCancelar.setBackground(new Color(0, 100, 133));
        }
        if (e.getSource() == panelAdminEmp.btnEmpAdminNuevoEmp) {
            panelAdminEmp.btnEmpAdminNuevoEmp.setBackground(new Color(0, 100, 133));
        }
        if (e.getSource() == panelAdminEmp.btnEmpAdminBuscarEmp && (panelAdminEmp.btnEmpAdminBuscarEmp.isEnabled())) {
            panelAdminEmp.btnEmpAdminBuscarEmp.setBackground(new Color(0, 100, 133));
        }
        if (e.getSource() == panelAdminEmp.btnEmpAdminListarEmpleados && (panelAdminEmp.btnEmpAdminListarEmpleados.isEnabled())) {
            panelAdminEmp.btnEmpAdminListarEmpleados.setBackground(new Color(0,100,133));
        }
        if (e.getSource() == panelAdminEmp.btnEmpAdminModificarEmp && (panelAdminEmp.btnEmpAdminModificarEmp.isEnabled())) {
            panelAdminEmp.btnEmpAdminModificarEmp.setBackground(new Color(0, 100, 133));
        }
        if (e.getSource() == panelAdminEmp.btnEmpAdminEliminarEmp && (panelAdminEmp.btnEmpAdminEliminarEmp.isEnabled())) {
            panelAdminEmp.btnEmpAdminEliminarEmp.setBackground(new Color(0, 100, 133));
        }
        if (e.getSource() == panelAdminEmp.btnEmpAdminGuardarEmp && (panelAdminEmp.btnEmpAdminGuardarEmp.isEnabled())) {
            panelAdminEmp.btnEmpAdminGuardarEmp.setBackground(new Color(0, 100, 133));
        }
        if (e.getSource() == panelAdminAvion.btnAvionAdminNuevoAvion) {
            panelAdminAvion.btnAvionAdminNuevoAvion.setBackground(new Color(26,188,156));
        }
        if (e.getSource() == panelAdminAvion.btnAvionAdminBuscarAvion) {
            panelAdminAvion.btnAvionAdminBuscarAvion.setBackground(new Color(26,188,156));
        }
        if (e.getSource() == panelAdminAvion.btnAvionAdminModificarAvion) {
            panelAdminAvion.btnAvionAdminModificarAvion.setBackground(new Color(26,188,156));
        }
        if (e.getSource() == panelAdminAvion.btnAvionAdminEliminarAvion) {
            panelAdminAvion.btnAvionAdminEliminarAvion.setBackground(new Color(26,188,156));
        }
        if (e.getSource() == panelAdminAvion.btnAvionAdminGuardarAvion) {
            panelAdminAvion.btnAvionAdminGuardarAvion.setBackground(new Color(26,188,156));
        }
    }
    /*Cosas que estorban, pero sin ellas esto no sería posible xD*/
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    
    public File abrir() {
        File imagen;
        JFileChooser chosse = new JFileChooser("/Users/GarciHard/Pictures");
        chosse.setAccessory(new PreviewChooser(chosse));
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("png,jpg", "png", "jpg");
        chosse.setFileFilter(filtro);
        chosse.showOpenDialog(chosse);
        imagen = chosse.getSelectedFile();
        if (imagen != null) {
            return imagen;
        } else {
            return null;
        }
    }
}