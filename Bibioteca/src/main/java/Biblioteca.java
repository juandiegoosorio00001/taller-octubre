import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        List<Libro> booksavailable = new ArrayList<>();
        while (true) {
         try{
            System.out.println("--------------------------");
            System.out.println("*        MENU            *");
            System.out.println("--------------------------");
            System.out.println("*  1. Estudiante         *");
            System.out.println("--------------------------");
            System.out.println("*  2. Administrador      *");
            System.out.println("--------------------------");
            System.out.println("*  3. Profesor           *");
            System.out.println("--------------------------");
            System.out.println("*  4. Salir              *");
            System.out.println("--------------------------");
            String answer = scanner.nextLine();

            switch (answer) {
                case "1":
                    System.out.println("Eres estudiante.");
                    System.out.println("Ingrese nombre:");
                    String name = scanner.nextLine();
                    System.out.println("Ingrese apellido:");
                    String lastname = scanner.nextLine();
                    System.out.println("Ingrese occupation:");
                    String occupation = scanner.nextLine();
                    System.out.println("Ingrese ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Estudiante student = new Estudiante(name, lastname, id, occupation);
                    student.PrestarLibro(booksavailable);
                    break;

                 case "2":
                    System.out.println("Eres administrador.");
                    System.out.println("Ingrese nombre:");
                    String nameAdmin = scanner.nextLine();
                    System.out.println("Ingrese apellido:");
                    String lastnameAdmin = scanner.nextLine();
                    System.out.println("Ingrese occupation:");
                    String occupationAdmin = scanner.nextLine();
                    System.out.println("Ingrese ID:");
                    int idAdmin = scanner.nextInt();
                    scanner.nextLine();
                    Administrador admin = new Administrador(nameAdmin, lastnameAdmin, idAdmin, occupationAdmin);
                    admin.PrestarLibro(booksavailable);
                    break;

                case "3":
                    System.out.println("Eres profesor.");
                     System.out.println("Ingrese nombre:");
                        String nameTeacher = scanner.nextLine();
                    System.out.println("Ingrese apellido:");
                     String lastnameTeacher = scanner.nextLine();
                     System.out.println("Ingrese occupation:");
                         String occupationTeacher = scanner.nextLine();
                        System.out.println("Ingrese ID:");
                    int idTeacher = scanner.nextInt();
                    scanner.nextLine();
                    Docente teacher = new Docente(nameTeacher, lastnameTeacher, idTeacher, occupationTeacher);
                    teacher.PrestarLibro(booksavailable);
                    break;
                case "4":
                    System.out.println("Vuelve Pronto");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ese dato no es valido");
                    break;
            }
            }catch(Exception e){
             System.out.println("error: "+ e);
            }
        }
    }
}