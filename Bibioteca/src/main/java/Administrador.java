import java.util.List;
import java.util.Scanner;

public class Administrador extends Persona implements Prestar {
    public Administrador(String name, String lastname, int identification, String occupation) {
        super(name, lastname, identification, occupation);
    }
    @Override
    
    public void PrestarLibro(List<Libro> booksavailable) {
     try{
        System.out.println("Bienvenido " + occupation + ": " + name + " " + lastname + " identificado con Cedula de ciudadania: " + identification);
        Scanner entrada = new Scanner(System.in);
        boolean prueba = false;
        while (!prueba) {
            System.out.println("Cuantos libros desea registrar?");
            int numLibros = entrada.nextInt();
            if (numLibros <= 0 || numLibros > 20) {
                System.out.println("Por favor, ingresa un valor valido (mayor a 0 y menor a 20).");
                entrada.nextLine();
            } else {
                prueba = true;
                entrada.nextLine();
                for (int i = 0; i < numLibros; i++) {
                    System.out.println("--------------------------------------------");
                    System.out.println("Ingrese el nombre del libro " + (i + 1) + ":");
                    String nombreLibro = entrada.nextLine();
                    booksavailable.add(new Libro(nombreLibro));
                    System.out.println("El libro " + nombreLibro + " ha sido registrado.");
                }
            }
        }
     }catch(Exception e){
             System.out.println("error: "+ e);
      }
}
    public void realizarAcciones(Object booksavailable) {
    }
    public void PrestarLibro(Object booksavailable) {
    }

    public void prestarLibro(Object booksavailable) {
    }
    @Override
    public void prestarLibro(List<Libro> booksavailable) {
    }
}
