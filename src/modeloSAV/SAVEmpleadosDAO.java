package modeloSAV;
//@GarciHard
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vistaSAV.PanelEmpleadoAdmin;

public class SAVEmpleadosDAO {

    ConexionBDD conexionOracle = new ConexionBDD();
    PanelEmpleadoAdmin panelEmpAdmin = new PanelEmpleadoAdmin();
    ArrayList<String> arreglo;
    
    public boolean insertarEmpleado(ArrayList<String> nvoEmp) {
        try {
            conexionOracle.conectar();
            Connection conn = conexionOracle.getConnection();
            CallableStatement cstmt = conn.prepareCall("{call nuevoEmp(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cstmt.setString(1, nvoEmp.get(1));
            cstmt.setString(2, nvoEmp.get(2));
            cstmt.setString(3, nvoEmp.get(3));
            cstmt.setString(4, nvoEmp.get(4));
            cstmt.setString(5, nvoEmp.get(5));
            cstmt.setString(6, nvoEmp.get(6));
            cstmt.setString(7, nvoEmp.get(7));
            cstmt.setString(8, nvoEmp.get(8));
            cstmt.setString(9, nvoEmp.get(9));
            cstmt.setString(10, nvoEmp.get(10));
            cstmt.setString(11, nvoEmp.get(11));
            cstmt.setString(12, nvoEmp.get(12));
            cstmt.setString(13, nvoEmp.get(13));
            cstmt.setString(14, nvoEmp.get(14));
            cstmt.setString(15, nvoEmp.get(15));
            cstmt.execute();
        } catch (SQLException ext) {
            return false;
        }
        return true;
    }
    
    public ArrayList<String> buscarEmpleado(SAVEmpleados empleadoOb) {//metodo para listar todos los datos de los empleados
        String queryBuscarEmpleado = "select e.emp_id, e.emp_nombre, e.emp_apellido_pat, e.emp_apellido_mat, e.emp_fecha_nacimiento, e.emp_rfc, e.emp_sexo, e.emp_domicilio, e.emp_telefono, e.emp_email, e.emp_lvl_estudios, c.cargo_nombre, e.emp_horario, e.emp_foto, u.emp_usuario, u.emp_pwd from savbdd.empleados e join savbdd.cargos c on (e.cargo_id = c.cargo_id) join savbdd.usuarios u on (e.emp_id = u.emp_id) where upper(e.emp_id) = '"+empleadoOb.getEmpID()+"'";
        try {
            conexionOracle.conectar();
            Connection conn = conexionOracle.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rset = stmt.executeQuery(queryBuscarEmpleado);
            if (rset.next() != false) {
                arreglo = new ArrayList<String>();
                arreglo.add(rset.getString(1));
                arreglo.add(rset.getString(2));
                arreglo.add(rset.getString(3));
                arreglo.add(rset.getString(4));
                arreglo.add(rset.getString(5));
                arreglo.add(rset.getString(6));
                arreglo.add(rset.getString(7));
                arreglo.add(rset.getString(8));
                arreglo.add(rset.getString(9));
                arreglo.add(rset.getString(10));
                arreglo.add(rset.getString(11));
                arreglo.add(rset.getString(12));
                arreglo.add(rset.getString(13));
                arreglo.add(rset.getString(14));
                arreglo.add(rset.getString(15));
                arreglo.add(rset.getString(16));
                stmt.close();
                conexionOracle.cerrar();
            }
        } catch (SQLException ext) {
            JOptionPane.showMessageDialog(null, "Error"
                    + "\n\nCodigo de error:" + ext, "ERROR", 0, null);
        }
        return arreglo;
    }
    
    public ArrayList<String> listarEmpleado() {//metodo p/listar ID, Nombre y Apellidos del usuario para la tabla.
        String queryListarEmp = "select emp_id, emp_nombre, emp_apellido_pat, emp_apellido_mat from savbdd.empleados";
        try {
            conexionOracle.conectar();
            Connection conn = conexionOracle.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rset = stmt.executeQuery(queryListarEmp);

            if (rset.next() != false) {
                arreglo = new ArrayList<String>();
                arreglo.add(rset.getString(1));
                arreglo.add(rset.getString(2));
                arreglo.add(rset.getString(3));
                arreglo.add(rset.getString(4));
                stmt.close();
                conexionOracle.cerrar();
            }
        } catch (SQLException ext) {
            JOptionPane.showMessageDialog(null, "Error"
                    + "\n\nCodigo de error:" + ext, "ERROR", 0, null);
        }
        return arreglo;
    }
}
