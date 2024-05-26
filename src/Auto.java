public class Auto extends VehiculoPasajeros{
    private String tipoCombtible;

    // Constructor
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible){
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombtible = tipoCombustible;
    }

    // Getter y Setter para tipoCombustible
    public String getTipoCombustible(){
        return tipoCombtible;
    }

    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombtible = tipoCombustible;
    }

    // Sobrescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de Combustible: " + tipoCombtible);
    }

     // Sobrescribir el metodo realizarMantenimiento()
     @Override
     public void realizarMantenimiento(int NivelAceite) {
         super.realizarMantenimiento(NivelAceite);
 
         if (NivelAceite <= 25) {
             NivelAceite = 100;
             System.out.println("Se ha cambiado el aceite del vehiculo");
             System.out.println("Nivel de aceite: "+NivelAceite+"%/100%");
         } else {
             System.out.println("Nivel de aceite: "+NivelAceite+"%/100%");
             System.out.println("No es necesario cambiar el aceite, siga las indicaciones al final");
         }
         System.out.println("Restos de acciones a realizar");
         System.out.println("-Se deben de cambiar las pastillas de freno");
         System.out.println("-Se deben de cambiar las bujias delanterass");
         System.out.println("-Se deben de cambiar las bujias traseras");
         System.out.println("-Se debe de realizar alineamiento en las llantas delanteras");
         System.out.println("-Limpiar el filtro de aceite del motor");
         System.out.println("-Revisar los fluidos del auto");
         System.out.println("Se le recurda traer a revision de mantenimiento el vehiculo cada 6 meses o al haber recorrido 10000Km");
     }
 
     //CalcularCostoMantinimiento
     void CalcularCostoMantenimiento(double CostoPorKm, int KmRecorridos){
         double CostoTotal = CostoPorKm * KmRecorridos;
         System.out.println("El costo total por el mantenimiento del auto es de: C$"+CostoTotal);
     }
}
