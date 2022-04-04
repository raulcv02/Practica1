
public class Persona {

    String dni;
    String nombre;
    String apellidos;
    int edad;
    private String poblacion;

    public Persona(String dni, String nombre, String apellidos, int edad, String poblacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.poblacion = poblacion;
    }
    public void setPoblacion(String poblacion){
        poblacion = pobl;

    }

    public String getPoblacion(){
    return poblacion;
    }

}
