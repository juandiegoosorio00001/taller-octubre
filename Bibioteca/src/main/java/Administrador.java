
import java.util.List;
import java.util.Scanner;

public class Administrador extends Persona{
public Administrador(String name, String lastname, int identificacion, String ocupacion) {
        super(name, lastname, identificacion, ocupacion);
    }

    public void registrarLibros(List<Libro> librosDisponibles) {
        Scanner entrada = new Scanner(System.in);
        boolean prueba;
        prueba = false;
        while(!prueba){
         System.out.println("Cuantos libros desea registrar?");
         int numLibros = entrada.nextInt();
            if (numLibros <0 || numLibros >20) {
                System.out.println("por favor ingresa un valor valido mayor a 0 y menor a 20");
                entrada.nextLine();
            }else{
              prueba=true;
              entrada.nextLine();
              for (int i = 0; i < numLibros; i++) {
               System.out.println("Ingrese el nombre del libro " + (i + 1) + ":");
               String nombreLibro = entrada.nextLine();
               librosDisponibles.add(new Libro(nombreLibro));
               System.out.println("Libro " + nombreLibro + " registrado.");
              }
            }
        }  
    }
    
}
