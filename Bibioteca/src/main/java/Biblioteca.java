import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner register = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        String answer;
        System.out.println("¿cual es tu ocupacion? \n 1/estudiante,\n 2/administrador,\n 3/Docente");
        answer = entrada.nextLine().toLowerCase();
        switch (answer) {
         case "1":
             System.out.println("Eres estudiante.");
             System.out.println("ingrese nombre");
             String name = register.nextLine();
             System.out.println("ingrese apellido");
             String lastname = register.nextLine();
             System.out.println("ingrese ocupacion");
             String ocupation = register.nextLine();
             System.out.println("ingrese id");
             int id = register.nextInt();
             Estudiante student = new Estudiante(name,lastname,id,ocupation);
             student.prestarLibro();
             break;
          case "2":
             System.out.println("ingrese ocupacion");
             String ocupation1 = register.nextLine();
             System.out.println("ingrese nombre");
             String name1 = register.nextLine();
             System.out.println("ingrese apellido");
             String lastname1 = register.nextLine();
             System.out.println("ingrese id");
             int id1 = register.nextInt();
             
             System.out.println("Eres administrador");
             Administrador admin = new Administrador(name1,lastname1,id1,ocupation1);
             admin.crearpersona();
             break;
          case "3":
             System.out.println("ingrese nombre");
             String name2 = register.nextLine();
             System.out.println("ingrese apellido");
             String lastname2 = register.nextLine();
             System.out.println("ingrese ocupacion");
             String ocupation2 = register.nextLine();
             System.out.println("ingrese id");
             int id2 = register.nextInt();
             Docente teacher = new Docente(name2,lastname2,id2,ocupation2);
             System.out.println("Eres administrador");
             teacher.Profesor();
             break;
        }
    }
}