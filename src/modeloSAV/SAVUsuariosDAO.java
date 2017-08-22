package modeloSAV;
//@GarciHard

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class SAVUsuariosDAO {
    ConexionBDD conexionOracle = new ConexionBDD();
    String puesto = "";
    
    public String validarLogin(SAVUsuarios usuarioOb) {
        if(usuarioOb.getEmpUsuario().length() != 0 && usuarioOb.getEmpPwd().length() == 0) {
            JOptionPane.showMessageDialog(null,"El campo contraseña no puede estar vacio", 
                    "ERROR",0,null );
        } else if (usuarioOb.getEmpUsuario().length() == 0 && usuarioOb.getEmpPwd().length() != 0) {
            JOptionPane.showMessageDialog(null,"El campo usuario no puede estar vacio", 
                    "ERROR",0,null );
        } else if (usuarioOb.getEmpUsuario().length() == 0 && usuarioOb.getEmpPwd().length() == 0) {
            JOptionPane.showMessageDialog(null,"¡ Campos Vacios !"
                    +"\n\nIngrese los datos solicitados","ERROR",0,null );
        } else {
            String queryValidacionLogin =
                    "select lower(c.cargo_nombre) from savbdd.empleados e join savbdd.cargos c on (c.cargo_id = e.cargo_id) join savbdd.usuarios u on (e.emp_id = u.emp_id) where lower(emp_usuario) = '"+usuarioOb.getEmpUsuario()+"' and lower(emp_pwd) = '"+usuarioOb.getEmpPwd()+"'";
            try {
                conexionOracle.conectar();
                Connection conn = conexionOracle.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rset = stmt.executeQuery(queryValidacionLogin);
                
                if(rset.next() != false) {
                    puesto = rset.getString(1);
                } else {
                    JOptionPane.showMessageDialog(null,"Acceso Denegado"
                            + "\n\nUsuario y/o Contraseña incorrecta"
                            + "\n\nIntente nuevamente","ERROR",0,null );
                }
                stmt.close();
                conexionOracle.cerrar();
            } catch (SQLException ext) {
                JOptionPane.showMessageDialog(null,"Error Con La Base de Datos"
                        + "\n\n Contacte Al Administrador Del Sistema"
                        + "\n\nCodigo de error: "+ext, "ERROR",0,null );
            }
        }
        return puesto;
    }
}