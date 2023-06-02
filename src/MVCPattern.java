import javax.swing.*;
import java.util.Scanner;

public class MVCPattern {
        public static String name;
        public static String rol;

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            student model  = retriveStudentFromDatabase();

            studentView view = new studentView();

            studentController controller = new studentController(model, view);

            System.out.println("Ingrese el nombre:");

            name = scanner.nextLine();

            System.out.println("Ingrese el id:");

            rol = scanner.nextLine();

            controller.updateView();

            controller.setStudentName(name);

            controller.setStudentRollNo(rol);

            controller.updateView();

            scanner.close();
        }

        private static student retriveStudentFromDatabase()
        {

            Scanner scanner = new Scanner(System.in);
            student student = new student();
            student.setName(name);
            student.setRollNo(rol);

            System.out.println("Ingrese el nombre:");

            name = scanner.nextLine();

            System.out.println("Ingrese el id:");

            rol = scanner.nextLine();

            scanner.close();


            return student;
        }

    }

