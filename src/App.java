public class App {
    public static void main(String[] args) throws Exception {
        
        // Crear instancias de cada tipo de vehiculo
        Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");

        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 5);

        // Mostrar la informacion de cada vehiculo
        System.out.println("Informacion del Auto:");
        auto.mostrarInfo();

        System.out.println("======================================");

        System.out.println("Informacion del Camion");
        camion.mostrarInfo();
        System.out.println();
     // Mostrar la informacion del metodo de mantenimiento
     System.out.println("Mantenimiento para el Auto");
     auto.realizarMantenimiento(50);
     System.out.println("=========================================================");
     System.out.println("Mantenimiento para el Camnion");
     camion.realizarMantenimiento(20);
     System.out.println();
     auto.CalcularCostoMantenimiento(0.7, 15000);
    }
}
