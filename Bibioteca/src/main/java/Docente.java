import java.util.List;
import java.util.Scanner;

public class Docente extends Persona implements Prestar{
    public Docente(String name, String lastname, int identification, String occupation) {
        super(name, lastname, identification, occupation);
    }

    public void PrestarLibro(List<Libro> booksavailable) {
       try{
        System.out.println("Bienvenido " + occupation + ": " + name + " " + lastname + " identificado con Cedula de ciudadania: " + identification);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Libros disponibles para alquilar: " + booksavailable);
        System.out.println("Cuantos libros deseas alquilar?");
        int bookstoapresent = entrada.nextInt();
        while(bookstoapresent >3 || bookstoapresent <=0 || bookstoapresent > booksavailable.size()){
         if(bookstoapresent > 3){
            System.out.println("Error, solo puedes alquilar maximo 3 libros al tiempo");
         }else if(bookstoapresent > booksavailable.size()) {
            System.out.println("el numero de libros solicitados supera los libros disponibles, lo siento");
             System.out.println("actualmente contamos con " + booksavailable.size() +" libros dispobibles");
         }else if(bookstoapresent <=0){
             System.out.println("Lamento que no quieras alquilas ningun libro, espero pronto quieras hacerlo, adios.");
             return;
         }
         System.out.println("Libros disponibles para alquilar: " + booksavailable);
         System.out.println("Cuantos libros deseas alquilar?");
         bookstoapresent = entrada.nextInt();
         entrada.nextLine();
        }

        String[] namebooks = new String[bookstoapresent];
        for (int i = 0; i < bookstoapresent; i++) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Ingrese el nombre del libro " + (i + 1) + " que desea alquilar:");
            String booksrequested = entrada.nextLine();
            boolean bookfound = false;
            for (int j = 0; j < booksavailable.size(); j++) {
                if (booksavailable.get(j).getNombre().equalsIgnoreCase(booksrequested)) {
                    namebooks[i] = booksrequested;
                    booksavailable.remove(j);
                    bookfound = true;
                    break;
                }
            }

            if (!bookfound) {
                System.out.println("El libro " + booksrequested + " no esta disponible. Intente con otro libro.");
                i--;
            }
        }

        System.out.println("Resumen de su prestamo:");
        for (String libro : namebooks) {
            System.out.println("Libro alquilado: " + libro);
        }
      }catch(Exception e){
             System.out.println("error dato invalido");
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
