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
    int identification;
    String occupation;

    public Persona(String name, String lastname, int identification, String occupation) {
        this.name = name;
        this.lastname = lastname;
        this.identification = identification;
        this.occupation = occupation;
    }
    public abstract void PrestarLibro(List<Libro> booksavailable);
}