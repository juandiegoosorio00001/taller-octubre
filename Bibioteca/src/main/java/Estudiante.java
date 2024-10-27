import java.util.List;
import java.util.Scanner;

public class Estudiante extends Persona {
public Estudiante(String name, String lastname, int identificacion, String ocupacion) {
        super(name, lastname, identificacion, ocupacion);
    }

    public void prestarLibro(List<Libro> librosDisponibles) {
    System.out.println("Bienvenido " + ocupacion + ": " + name + " " + lastname + " id: " + identificacion);
    Scanner entrada = new Scanner(System.in);
    System.out.println("Libros disponibles para alquilar: " + librosDisponibles);
    System.out.println("¿Cuántos libros deseas alquilar?");
    int numLibrosPrestar = entrada.nextInt();
    entrada.nextLine();
    if (numLibrosPrestar <= 0 || numLibrosPrestar > librosDisponibles.size() || numLibrosPrestar>5) {
        System.out.println("Numero invalido de libros intentalo mas tarde.");
        System.out.println("Recuerda que solo puedes alquilar 3 libros");
        return;
    }

    String[] namesLibros = new String[numLibrosPrestar];
    for (int i = 0; i < numLibrosPrestar; i++) {
        System.out.println("Ingrese el nombre del libro " + (i + 1) + " que desea alquilar:");
        String libroSolicitado = entrada.nextLine();
        boolean libroEncontrado = false;
        for (int j = 0; j < librosDisponibles.size(); j++) {
            if (librosDisponibles.get(j).getNombre().equalsIgnoreCase(libroSolicitado)) {
                namesLibros[i] = libroSolicitado;
                librosDisponibles.remove(j); 
                libroEncontrado = true;
                break;
            }
        }

        if (!libroEncontrado) {
            System.out.println("El libro " + libroSolicitado + " no está disponible. Intente con otro libro.");
            i--;
        }
    }
    System.out.println("Resumen de su préstamo:");
    for (String libro : namesLibros) {
        System.out.println("Libro alquilado: " + libro);
    }
}
}
