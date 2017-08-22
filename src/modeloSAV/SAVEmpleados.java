package modeloSAV;
//@GarciHard
public class SAVEmpleados {

    private String empID;
    private String empNombre;
    private String empApellidoPat;
    private String empApellidoMat;
    private String empFechaNacimiento;
    private String empRFC;
    private char empSexo;
    private String empDomicilio;
    private String empTelefono;
    private String empEmail;
    private String empLvlEstudios;
    private String cargoID;
    private String empHorario;
    private String empFoto;
 
    public SAVEmpleados(String empID) {//Constructor para buscar empleado
        this.empID = empID;
    }

    public SAVEmpleados(String empID, String empNombre, String empApellidoPat, String empApellidoMat, String empFechaNacimiento, String empRFC, char empSexo, String empDomicilio, String empTelefono, String empEmail, String empLvlEstudios, String cargoID, String empHorario, String empFoto) {
        this.empID = empID;
        this.empNombre = empNombre;
        this.empApellidoPat = empApellidoPat;
        this.empApellidoMat = empApellidoMat;
        this.empFechaNacimiento = empFechaNacimiento;
        this.empRFC = empRFC;
        this.empSexo = empSexo;
        this.empDomicilio = empDomicilio;
        this.empTelefono = empTelefono;
        this.empEmail = empEmail;
        this.empLvlEstudios = empLvlEstudios;
        this.cargoID = cargoID;
        this.empHorario = empHorario;
        this.empFoto = empFoto;
    }
    
    //Constructor para insertarNuevoEmpleado
    public SAVEmpleados(String empNombre, String empApellidoPat, String empApellidoMat, String empFechaNacimiento, String empRFC, char empSexo, String empDomicilio, String empTelefono, String empEmail, String empLvlEstudios, String cargoID, String empHorario, String empFoto) {
        this.empNombre = empNombre;
        this.empApellidoPat = empApellidoPat;
        this.empApellidoMat = empApellidoMat;
        this.empFechaNacimiento = empFechaNacimiento;
        this.empRFC = empRFC;
        this.empSexo = empSexo;
        this.empDomicilio = empDomicilio;
        this.empTelefono = empTelefono;
        this.empEmail = empEmail;
        this.empLvlEstudios = empLvlEstudios;
        this.cargoID = cargoID;
        this.empHorario = empHorario;
        this.empFoto = empFoto;
    }
    
    
    
    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    public String getEmpApellidoPat() {
        return empApellidoPat;
    }

    public void setEmpApellidoPat(String empApellidoPat) {
        this.empApellidoPat = empApellidoPat;
    }

    public String getEmpApellidoMat() {
        return empApellidoMat;
    }

    public void setEmpApellidoMat(String empApellidoMat) {
        this.empApellidoMat = empApellidoMat;
    }

    public String getEmpFechaNacimiento() {
        return empFechaNacimiento;
    }

    public void setEmpFechaNacimiento(String empFechaNacimiento) {
        this.empFechaNacimiento = empFechaNacimiento;
    }

    public String getEmpRFC() {
        return empRFC;
    }

    public void setEmpRFC(String empRFC) {
        this.empRFC = empRFC;
    }

    public char getEmpSexo() {
        return empSexo;
    }

    public void setEmpSexo(char empSexo) {
        this.empSexo = empSexo;
    }

    public String getEmpDomicilio() {
        return empDomicilio;
    }

    public void setEmpDomicilio(String empDomicilio) {
        this.empDomicilio = empDomicilio;
    }

    public String getEmpTelefono() {
        return empTelefono;
    }

    public void setEmpTelefono(String empTelefono) {
        this.empTelefono = empTelefono;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpLvlEstudios() {
        return empLvlEstudios;
    }

    public void setEmpLvlEstudios(String empLvlEstudios) {
        this.empLvlEstudios = empLvlEstudios;
    }

    public String getCargoID() {
        return cargoID;
    }

    public void setCargoID(String cargoID) {
        this.cargoID = cargoID;
    }

    public String getEmpHorario() {
        return empHorario;
    }

    public void setEmpHorario(String empHorario) {
        this.empHorario = empHorario;
    }

    public String getEmpFoto() {
        return empFoto;
    }

    public void setEmpFoto(String empFoto) {
        this.empFoto = empFoto;
    }
}