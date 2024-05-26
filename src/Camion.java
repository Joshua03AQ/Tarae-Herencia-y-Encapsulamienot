public class Camion extends VehiculoCarga{
    private int numEjes;

    // Constructor
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes){
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    }

    // Getter y Setter para numEjes
    public int getNumEjes(){
        return numEjes;
    }

    public void setNumEjes(int numEjes){
        this.numEjes = numEjes;
    }

    // Sobrescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de Ejes: " + numEjes);
    }

    // Sobrescribir el metodo realizarMantenimiento()
    @Override
    public void realizarMantenimiento(int NivelAceite) {
        super.realizarMantenimiento(NivelAceite);
        if (NivelAceite <= 25) {
            NivelAceite = 100;
            System.out.println("Se ha cambiado el aceite del vehiculo, siga las indicaciones indicadas al final");
            System.out.println("Nivel de aceite: "+NivelAceite+"%/100%");
        } else {
            System.out.println("Nivel de aceite: "+NivelAceite+"%/100%");
            System.out.println("No es necesario cambiar el aceite, vuelva dentro de un mes para su proxima revision de aceite");
        }
        System.out.println("Restos de acciones a realizar");
        System.out.println("-Cambio de los amortiguadores traseros");
        System.out.println("-Cambio de la banda de tiempo");
        System.out.println("-Cambiar los discos de freno delanteros y traseros");
        System.out.println("-Limpiar el filtro de combustible");
        System.out.println("-Limpiar el filtro de aceite del motor");
        System.out.println("-Revisar los fluidos del camnion");
        System.out.println("Se le recurda traer a revision de mantenimiento el vehiculo cada 6 meses o al haber recorrido 25000Km");
    }
}
