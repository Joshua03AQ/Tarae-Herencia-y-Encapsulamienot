
// Vehiculo.java
public class Vehiculo {

    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;

    // Constructor
    public Vehiculo(String marca, String modelo, int año, int kilometraje){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
    }

    // Getters y Setters
    public String getMarca(){
        return marca;
    }
    public void setMarca(){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAño(){
        return año;
    }

    public void setAño(int año){
        this.año = año;
    }

    public int getKilometraje(){
        return kilometraje;
    }

    public void setKilometraje(int kilometraje){
        this.kilometraje = kilometraje;
    }

    // Metodo para mostrar la informacion del vehiculo
    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Kilometraje: " + kilometraje);
    }

    // Metodo de mantenimiento
    public void realizarMantenimiento(int NivelAceite){
        System.out.println("Revision general:");
        System.out.println("-Revision del motor");
        System.out.println("-Revision de llantas");
        System.out.println("-Revision de fluidos");
        System.out.println("-Revision de amortiguadores");
        System.out.println("-Revision de Luces");
        System.out.println();
    }
}
