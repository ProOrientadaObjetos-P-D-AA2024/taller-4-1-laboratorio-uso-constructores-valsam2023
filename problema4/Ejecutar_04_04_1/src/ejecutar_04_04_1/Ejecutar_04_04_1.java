package ejecutar_04_04_1;

public class Ejecutar_04_04_1 {


    public static void main(String[] args) {
        // Primer Objeto
        Clien uno = new Clien("Jostin Estiben", "Guallo", "1155986352");
        Bank b1uno = new Bank("JEP", 2);
        Cheq ckuno = new Cheq(uno, b1uno, 2500);
        
        ckuno.calcularComisionBanco();
        
        System.out.println("===================================");
        System.out.println("    Datos del primer Cheque");
        System.out.println("===================================");
        
        System.out.println(ckuno.toString());

        //Segundo Objeto
        Clien clidoz = new Clien("Maria Paula", "Vega", "028936452");
        Bank bkdoz = new Bank("Banco de loja", 5);
        Cheq ckdoz = new Cheq(clidoz, bkdoz,3200);
        ckdoz.calcularComisionBanco();
        
        System.out.println("===================================");
        System.out.println("    Datos del primer Cheque");
        System.out.println("===================================");
        
        System.out.println(ckdoz.toString());
        
    }
    
}

