package ejecutar_04_04_1;

public class Cheq {
    private Clien cli;
    private Bank ban;
    private double val_ck;
    private double com_bk;

    public Cheq(Clien cli, Bank ban, double valorCheque) {
        this.cli = cli;
        this.ban = ban;
        this.val_ck = valorCheque;
    }

    public Clien getCli() {
        return cli;
    }

    public void setCli(Clien cli) {
        this.cli = cli;
    }

    public Bank getBan() {
        return ban;
    }

    public void setBan(Bank ban) {
        this.ban = ban;
    }

    public double getValorCheque() {
        return val_ck;
    }

    public void setValorCheque(double valorCheque) {
        this.val_ck = valorCheque;
    }

    public double getComisionBanco() {
        return com_bk;
    }

    public void calcularComisionBanco() {
        com_bk = val_ck * 0.003;
    }

    @Override
    public String toString() {
        return "-Valor del cheque: " + val_ck + 
               "\n-Comision del banco: " + com_bk +
               "\n-------------------------"+
               "\n   Datos del Cliente "+
                "\n-------------------------"+
               "\n-Nombre del Cliente: " + getCli().getNombres() +
               "\n-Apellido del Cliente: " + getCli().getApellidos() +
               "\n-Cédula del Cliente: " + getCli().getCedula() +
                "\n-------------------------"+
               "\n   Datos de la Banco"+
               "\n-------------------------"+
               "\n-Nombre del Banco: " + getBan().getNombre() + 
               "\n-Número de sucursales: " + getBan().getNroSucursales() +"\n";
    
    }
}
