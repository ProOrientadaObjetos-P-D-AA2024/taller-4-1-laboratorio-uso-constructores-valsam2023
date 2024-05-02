
package ejecutar_01_04_1;


public class Estud {
    private String e_nom;
    private double cal_1, cal_2, cal_3, prom;
    private University uni;

    public Estud(String nombreEstudiante, double califMateria1, double califMateria2, double califMateria3, University univer) {
        this.e_nom = nombreEstudiante;
        this.cal_1 = califMateria1;
        this.cal_2 = califMateria2;
        this.cal_3 = califMateria3;
        this.uni = univer;
    }


    public String getNombreEstudiante() {
        return e_nom;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.e_nom = nombreEstudiante;
    }

    public double getCalifMateria1() {
        return cal_1;
    }

    public void setCalifMateria1(double califMateria1) {
        this.cal_1 = califMateria1;
    }

    public double getCalifMateria2() {
        return cal_2;
    }

    public void setCalifMateria2(double califMateria2) {
        this.cal_2 = califMateria2;
    }

    public double getCalifMateria3() {
        return cal_3;
    }

    public void setCalifMateria3(double califMateria3) {
        this.cal_3 = califMateria3;
    }

    public double getPromedio() {
        return prom;
    }

    public void calcularPromedio() {
        prom = (cal_1 + cal_2 + cal_3) / 3;
    }

    public University getUni() {
        return uni;
    }

    public void setUni(University uni) {
        this.uni = uni;
    }

    @Override
    public String toString() {
        return "-Nombre: " + e_nom +
               "\n-Calificación Nº1: " + cal_1 + 
               "\n-Calificación Nº2: " + cal_2 +
               "\n-Calificación Nº3: " + cal_3 + 
               "\n-Promedio: " + prom +
               "\n------------------------"+
               "\nDatos de la Universidad"+
               "\n------------------------"+
               "\n-Nombre: " + getUni().getNombre() +
               "\n-Dirección: " + getUni().getDireccion();
    }
}

