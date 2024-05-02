package ejecutar_03_04_1;

public class Auto {
    private String cedula;
    private int anio;
    private double vaVehiculo, vaMatricula;
    private Origen fabricacion;

    public Auto(String cedula, int anio, double vaVehiculo, Origen fabricacion) {
        this.cedula = cedula;
        this.anio = anio;
        this.vaVehiculo = vaVehiculo;
        this.fabricacion = fabricacion;
    }

    public Auto(String cedula, int anio, Origen fabricacion) {
        this.cedula = cedula;
        this.anio = anio;
        vaVehiculo = 4000;
        this.fabricacion = fabricacion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getVaVehiculo() {
        return vaVehiculo;
    }

    public void setVaVehiculo(double valorVehiculo) {
        this.vaVehiculo = valorVehiculo;
    }

    public double getMatricula() {
        return vaMatricula;
    }

    public void calcularMatricula() {
        vaMatricula = 0.00002 * vaVehiculo * (2024 - anio);
    }

    public Origen getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(Origen fabricacion) {
        this.fabricacion = fabricacion;
    }
    
    @Override
    public String toString() {
        return "===================================\n"+
                "DATOS DEL AUTOMOTOR\n"+
                "===================================\n"
                + "Cedula del dueño: " + cedula + "\n"
                + "Año de fabricacion: " + anio + "\n"
                + "Valor del vehículo: " + vaVehiculo + "\n"
                + "Valor de la matrícula: " + vaMatricula + "\n"
                + "===================================\n"+
                "DATOS DE FABRICACION\n"+
                "===================================\n"
                + "Nombre: " + getFabricacion().getNombreFabricante() + "\n"
                + "Ciudad de origen: " + getFabricacion().getCiudadOrigen() + "\n";
    }

}

