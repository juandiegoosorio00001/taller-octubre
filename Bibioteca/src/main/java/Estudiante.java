import java.util.List;
import java.util.Scanner;

public class Estudiante extends Persona implements Prestar{
    public Estudiante(String name, String lastname, int identification, String occupation) {
        super(name, lastname, identification, occupation);
    }
    @Override
    public void PrestarLibro(List<Libro> booksavailable) {
      try{
        System.out.println("Bienvenido " + occupation + ": " + name + " " + lastname + " identificado con Cedula de ciudadania: " + identification);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Libros disponibles para alquilar: " + booksavailable);
        System.out.println("Cuantos libros deseas alquilar?");
        int bookstoapresent = entrada.nextInt();
        entrada.nextLine();
        if(bookstoapresent > 5){
            System.out.println("Error, solo puedes alquilar maximo 5 libros al tiempo");
         }else if(bookstoapresent > booksavailable.size()) {
            System.out.println("el numero de libros solicitados supera los libros disponibles, lo siento");
             System.out.println("actualmente contamos con " + booksavailable.size() +" libros dispobibles");
         }
        while(bookstoapresent >5 || bookstoapresent <=0 || bookstoapresent > booksavailable.size()){
        System.out.println("Libros disponibles para alquilar: " + booksavailable);
        System.out.println("Cuantos libros deseas alquilar?");
        bookstoapresent = entrada.nextInt();
        entrada.nextLine(); 
        if(bookstoapresent <=0){
             System.out.println("Lamento que no quieras alquilas ningun libro, espero pronto quieras hacerlo, adios.");
             return;
         }
        if(bookstoapresent > 5){
            System.out.println("Error, solo puedes alquilar maximo 5 libros al tiempo");
         }else if(bookstoapresent > booksavailable.size()) {
            System.out.println("el numero de libros solicitados supera los libros disponibles, lo siento");
             System.out.println("actualmente contamos con " + booksavailable.size() +" libros dispobibles");
         }
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
             System.out.println("error dato invalido ");
            }
    }

    public void realizarAcciones(Object booksavailable) {
    }
    @Override
    public void prestarLibro(List<Libro> booksavailable) {
    }
    
}