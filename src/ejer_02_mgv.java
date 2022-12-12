import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejer_02_mgv {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            List<Becario> listaBecarios = new ArrayList<>();

            while (true) {
                System.out.print("Introduce el nombre completo del becario(FIN=TERMINAR): ");
                String nombreComp = sc.nextLine();

                if (nombreComp.equalsIgnoreCase("FIN")) break;

                System.out.print("Introduce el sexo del becario(H/M): ");
                String sexo = sc.next();

                System.out.print("Introduce la edad del becario(20 a 60): ");
                int edad = sc.nextInt();
                sc.nextLine();

                System.out.print("Introduce el numero de suspensos del curso anterior del becario(0 a 4): ");
                int numSuspensos = sc.nextInt();
                sc.nextLine();

                System.out.print("Introduce la residencia familiar(Si/No): ");
                String residencia = sc.nextLine();

                System.out.print("Introduce los ingresos anuales de la familia del becario: ");
                int ingresos = sc.nextInt();
                sc.nextLine();

                Becario becario = new Becario(nombreComp,sexo,edad,numSuspensos,residencia, ingresos);
                listaBecarios.add(becario);
            }

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datosbeca.dat"))) {
                oos.writeObject(listaBecarios);
            }
        }
    }
}
