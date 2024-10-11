
import java.util.InputMismatchException;
import java.util.Scanner;
public class Docente extends Persona{
    
    public Docente(String name, String lastname, int identificacion, String ocupacion) {
        super(name, lastname, identificacion, ocupacion);
    }
    public void Profesor(){
        System.out.println("Bienvenido "+ocupacion+": "+name +" "+ lastname +" id: "+ identificacion);
        int[] space = new int[3];
        int maxLibros = space.length;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Ingrese la cantidad de libros que desea alquilar:");
            int numLibrosPrestar;
            
            int intentos = 0;
            do {
                numLibrosPrestar = entrada.nextInt();
                if (numLibrosPrestar <= 0 || numLibrosPrestar > maxLibros) {
                    System.out.println("¡Error! Ingrese un numero entero positivo y menor o igual a " + maxLibros + ".");
                    intentos++;
                    if (intentos==3) {
                        System.out.println("Has hecho demasiados intentos, intentalo luego nuevamente.");
                        break;
                    }
                }
            } while (numLibrosPrestar <= 0 || numLibrosPrestar > maxLibros && intentos < 3);
            
            
            String[] namesLibros = new String[numLibrosPrestar];
            System.out.println("Ingrese el name del libro " + 1 + " que desea alquilar:");
            namesLibros[0] = entrada.nextLine();
            for (int i = 0; i < numLibrosPrestar; i++) {
                namesLibros[i] = entrada.nextLine();
                System.out.println("Ingrese el name del libro " + (i+2) + " que desea alquilar:");
            }
            System.out.println("Resumen de su prestamo:");
            for (int i = 0; i < numLibrosPrestar; i++) {
                System.out.println("Libro " + (i + 1) + ": " + namesLibros[i]);
            }
        }
    }
}
