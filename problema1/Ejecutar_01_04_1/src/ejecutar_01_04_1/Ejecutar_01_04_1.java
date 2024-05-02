
package ejecutar_01_04_1;


public class Ejecutar_01_04_1 {


    public static void main(String[] args) {
        //Primer Objeto
        University uno = new University("Universidad San Francisco de Quito", "Quito");
        
        Estud unoz = new Estud("Maria Paula", 10, 9.5, 9.8, uno);
        
        unoz.calcularPromedio();
     
        System.out.println("===================================");
        System.out.println("    Datos del primer Estudiante");
        System.out.println("===================================");
        System.out.println(unoz.toString());

        //Segundo Objeto
        University doz = new University("Universidad de Las Américas", "Quito");
        
        Estud dozp = new Estud("Valentina", 9.3, 8, 9.3,doz);
        
        dozp.calcularPromedio();
        
        System.out.println("===================================");
        System.out.println("    Datos del segundo Estudiante");
        System.out.println("===================================");
        System.out.println(dozp.toString());

    }

}

