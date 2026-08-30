package actividadpoo;

public class Persona {

    private String nombre;
    private int edad;
    private String documento;

    public Persona(String nombre, int edad, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDocumento() {
        return documento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Documento: " + documento);
    }
    public boolean esMayorDeEdad() {
        return edad > 18;
    }
}