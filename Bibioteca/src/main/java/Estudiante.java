import java.util.List;
import java.util.Scanner;

public class Estudiante extends Persona implements Prestar{
    public Estudiante(String name, String lastname, int identificacion, String ocupacion) {
        super(name, lastname, identificacion, ocupacion);
    }
    @Override
    public void PrestarLibro(List<Libro> librosDisponibles) {
      try{
        System.out.println("Bienvenido " + ocupacion + ": " + name + " " + lastname + " id: " + identificacion);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Libros disponibles para alquilar: " + librosDisponibles);
        System.out.println("Cuantos libros deseas alquilar?");
        int numLibrosPrestar = entrada.nextInt();
        entrada.nextLine();
        if(numLibrosPrestar > 5){
            System.out.println("Error, solo puedes alquilar maximo 5 libros al tiempo");
         }else if(numLibrosPrestar > librosDisponibles.size()) {
            System.out.println("el numero de libros solicitados supera los libros disponibles, lo siento");
             System.out.println("actualmente contamos con " + librosDisponibles.size() +" libros dispobibles");
         }
        while(numLibrosPrestar >3 || numLibrosPrestar <=0 || numLibrosPrestar > librosDisponibles.size()){
        System.out.println("Libros disponibles para alquilar: " + librosDisponibles);
        System.out.println("Cuantos libros deseas alquilar?");
        numLibrosPrestar = entrada.nextInt();
        entrada.nextLine();  
        if(numLibrosPrestar > 5){
            System.out.println("Error, solo puedes alquilar maximo 5 libros al tiempo");
         }else if(numLibrosPrestar > librosDisponibles.size()) {
            System.out.println("el numero de libros solicitados supera los libros disponibles, lo siento");
             System.out.println("actualmente contamos con " + librosDisponibles.size() +" libros dispobibles");
         }
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

        System.out.println("Resumen de su prestamo:");
        for (String libro : namesLibros) {
            System.out.println("Libro alquilado: " + libro);
        }
      }catch(Exception e){
             System.out.println("error: "+ e);
            }
    }

    public void realizarAcciones(Object librosDisponibles) {
    }
    @Override
    public void prestarLibro(List<Libro> librosDisponibles) {
    }
    
}