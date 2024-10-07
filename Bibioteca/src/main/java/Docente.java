
import java.util.InputMismatchException;
import java.util.Scanner;
public class Docente extends Persona{
    
    public Docente(String name, String lastname, int identificacion, String ocupacion) {
        super(name, lastname, identificacion, ocupacion);
    }
    public void Profesor(){
        System.out.println("Bienvenido profesor "+name +" "+ lastname + ocupacion +" id: "+ identificacion );
        Scanner entrada = new Scanner(System.in);
        int[] space = new int[20];
        int maxLibros = space.length;

        System.out.println("Ingrese la cantidad de libros que desea ingresar:");
        int Numbooks;

        int intentos = 0;
        do {
        try {
              Numbooks = entrada.nextInt();
                if (Numbooks <= 0 || Numbooks > maxLibros) {
                 System.out.println("Error: Ingrese un número entero positivo y menor o igual a " + maxLibros + ".");
                 intentos++;
                    if (intentos==3) {
                        System.out.println("Has hecho demasiados intentos, intentalo luego nuevamente.");
                        entrada.close();
                    }
                }
            }catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                entrada.next(); 
                Numbooks = 0;
                
    }
        } while (Numbooks <= 0 || Numbooks > maxLibros && intentos < 3); 

        String[] namesLibros = new String[Numbooks];
        System.out.println("Ingrese el name del libro " + 1 + " que desea ingresar:");
            namesLibros[0] = entrada.nextLine();
        for (int i = 0; i < Numbooks; i++) {
            namesLibros[i] = entrada.nextLine();
            System.out.println("Ingrese el name del libro " + (i+2) + " que desea ingresar:");
        }
        System.out.println("Resumen de sus libros ingresados:");
        for (int i = 0; i < Numbooks; i++) {
            System.out.println("Libro " + (i + 1) + ": " + namesLibros[i]);
        }
        entrada.close();
    }
}
