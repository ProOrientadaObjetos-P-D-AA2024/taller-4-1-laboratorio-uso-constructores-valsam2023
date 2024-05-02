package ejecutar_03_04_1;

public class Ejecutar_03_04_1 {

    public static void main(String[] args) {
        // Primer objeto
        Origen fabricacion1 = new Origen("Toyota", "Japon");
        Auto auto1 = new Auto("1123456787", 2009, 12000, fabricacion1);
        auto1.calcularMatricula();
        System.out.println("-------------- 1 --------------");
        System.out.println(auto1.toString());

        // Segundo objeto
        Origen fabricacion2 = new Origen("Kia", "Inglaterra");
        Auto auto2 = new Auto("1167548709", 2000, fabricacion2);
        auto2.calcularMatricula();
        System.out.println("-------------- 2 --------------");
        System.out.println(auto2.toString());

    }
}

