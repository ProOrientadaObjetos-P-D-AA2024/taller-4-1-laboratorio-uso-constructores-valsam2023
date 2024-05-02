package ejecutar_02_04_1;

public class Profee {
    private String nomb;
    private String per_apellido;
    private String per_ced;
    private double sueldoi, suldo_total;
    private Prov provin;

    public Profee(String nomb, String ape, String ced, double sb, Prov prov) {
        this.nomb = nomb;
        this.per_apellido = ape;
        this.per_ced = ced;
        this.sueldoi = sb;
        this.provin = prov;
    }
   
    
    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getPer_apellido() {
        return per_apellido;
    }

    public void setPer_apellido(String per_apellido) {
        this.per_apellido = per_apellido;
    }

    public String getPer_ced() {
        return per_ced;
    }

    public void setPer_ced(String per_ced) {
        this.per_ced = per_ced;
    }

    public double getSueldoi() {
        return sueldoi;
    }

    public void setSueldoi(double sueldoi) {
        this.sueldoi = sueldoi;
    }

     public double getSuldo_total() {
        return suldo_total;
    }

    public void calcularSueld_tot() {
        suldo_total = (sueldoi * 0.20) + sueldoi;
    }

    public Prov getProvin() {
        return provin;
    }

    public void setProvin(Prov provin) {
        this.provin = provin;
    }
    
    @Override
    public String toString() {
        return "-Nombre del Docente: " + nomb + 
                "\n-Apellido del Docente: " + per_apellido + 
                "\n-Cdula del Docente: " + per_ced +
                "\n-Sueldo basico: " + sueldoi +
                "\n-Sueldo total: " + suldo_total +
                "\n-------------------------"+
                "\n  Datos de la Provincia"+
                "\n-------------------------"+
                "\n-Nombre de la Provincia: "+getProvin().getNombreProvincia()+ 
                "\n-Número de habitantes: "+getProvin().getNumeroHabitantes()+"\n";
    }
    
}

