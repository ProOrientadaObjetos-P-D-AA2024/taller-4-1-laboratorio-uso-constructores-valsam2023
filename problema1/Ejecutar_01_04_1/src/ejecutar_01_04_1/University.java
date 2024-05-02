
package ejecutar_01_04_1;


public class University {
    private String nom;
    private String direcc;

    public University(String per_nombre, String lug_direc) {
        this.nom = per_nombre;
        this.direcc = lug_direc;
    }

    public String getNombre() {
        return nom;
    }

    public void setNombre(String nombre) {
        this.nom = nombre;
    }

    public String getDireccion() {
        return direcc;
    }

    public void setDireccion(String direccion) {
        this.direcc = direccion;
    }
    
}

