package ejecutar_04_04_1;

public class Bank {
    String nom;
    int num_S;

    public Bank(String nombre, int nroSucursales) {
        this.nom = nombre;
        this.num_S = nroSucursales;
    }

    public String getNombre() {
        return nom;
    }

    public void setNombre(String nombre) {
        this.nom = nombre;
    }

    public int getNroSucursales() {
        return num_S;
    }

    public void setNroSucursales(int nroSucursales) {
        this.num_S = nroSucursales;
    }
}

