package modeloSAV;
//@GarciHard

public class SAVUsuarios {

    private String empID;
    private String empUsuario;
    private String empPwd;

    public SAVUsuarios(String empID, String empUsuario, String empPwd) {//Constructor Crear Nvo User
        this.empID = empID;
        this.empUsuario = empUsuario;
        this.empPwd = empPwd;
    }

    public SAVUsuarios(String empUsuario, String empPwd) {//Constructor Inicio Sesion
        this.empUsuario = empUsuario;
        this.empPwd = empPwd;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpUsuario() {
        return empUsuario;
    }

    public void setEmpUsuario(String empUsuario) {
        this.empUsuario = empUsuario;
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd;
    }
}