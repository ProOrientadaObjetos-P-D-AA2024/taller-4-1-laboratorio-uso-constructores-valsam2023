package ejecutar_04_04_1;


public class Clien {
    String nomb;
     String ape;
     String cedula;

    public Clien(String nombres, String apellidos, String cedula) {
        this.nomb = nombres;
        this.ape = apellidos;
        this.cedula = cedula;
    }

    public String getNombres() {
        return nomb;
    }

    public void setNombres(String nombres) {
        this.nomb = nombres;
    }

    public String getApellidos() {
        return ape;
    }

    public void setApellidos(String apellidos) {
        this.ape = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}

