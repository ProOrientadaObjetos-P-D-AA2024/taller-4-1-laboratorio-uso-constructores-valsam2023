package ejecutar_02_04_1;

public class Ejecutar_02_04_1 {

    public static void main(String[] args) {
        //Primer Objeto
        Prov pvuno = new Prov("Chimborazo", 471933);
        Profee prcdoz = new Profee("Guido", "Velez", "1147859636", 1200, pvuno);
        
        prcdoz.calcularSueld_tot();
        
        System.out.println("===================================");
        System.out.println("    Datos del primer Docente");
        System.out.println("===================================");
        
        System.out.println(prcdoz.toString());

        //OBJETO 2
        Prov doz = new Prov("Esmeraldas", 553900);
        Profee prdoz = new Profee("Fernanda", "Lozano", "1158963285",2500, doz);
        
        prdoz.calcularSueld_tot();
        
        System.out.println("===================================");
        System.out.println("    Datos del segundo Docente");
        System.out.println("===================================");
        
        System.out.println(prdoz.toString());
    }
    
}

