package modeloSAV;
//@GarciHard

public class SAVCargos {

    private String cargoID;
    private String cargoNombre;

    public SAVCargos(String cargoID, String cargoNombre) {
        this.cargoID = cargoID;
        this.cargoNombre = cargoNombre;
    }

    public String getCargoID() {
        return cargoID;
    }

    public void setCargoID(String cargoID) {
        this.cargoID = cargoID;
    }

    public String getCargoNombre() {
        return cargoNombre;
    }

    public void setCargoNombre(String cargoNombre) {
        this.cargoNombre = cargoNombre;
    }
}
