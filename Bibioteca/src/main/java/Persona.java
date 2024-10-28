import java.util.List;

class Libro {
    private final String nombre;

    public Libro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

abstract class Persona {
    String name;
    String lastname;
    int identificacion;
    String ocupacion;

    public Persona(String name, String lastname, int identificacion, String ocupacion) {
        this.name = name;
        this.lastname = lastname;
        this.identificacion = identificacion;
        this.ocupacion = ocupacion;
    }
    public abstract void PrestarLibro(List<Libro> librosDisponibles);
}