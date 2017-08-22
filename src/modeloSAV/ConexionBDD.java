package modeloSAV;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDD {

    private final String USUARIO = "savbdd";
    private final String PASS = "rootbddsav";
    private final String SID = "XE";
    private final String HOST = "localhost";
    private final int PUERTO = 1521;
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void registrarDriver() throws SQLException {
        oracle.jdbc.driver.OracleDriver oracleDriver = new oracle.jdbc.driver.OracleDriver();
        DriverManager.registerDriver(oracleDriver);
    }

    public void conectar() throws SQLException {
        if (connection == null || connection.isClosed() == true) {
            String cadenaConexion = "jdbc:oracle:thin:@" + HOST + ":" + PUERTO + ":" + SID;
            registrarDriver();
            connection = DriverManager.getConnection(cadenaConexion, USUARIO, PASS);
        }
    }

    public void cerrar() throws SQLException {
        if (connection != null && connection.isClosed() == false) {
            connection.close();
        }
    }
}
