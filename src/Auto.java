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
}
