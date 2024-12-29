
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // Crear una instancia única del Scanner
        
        while (true) {
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1 - Soles Peruanos a dolares\n"
                    + "2 - Pesos Mexicanos a dolares\n"
                    + "3 - Pesos Colombianos a dolares\n"
                    + "4 - Pesos Chilenos a dolares\n"
                    + "5 - Yenes a dolares\n"
                    + "6 - Salir");
            System.out.print("INGRESE UNA OPCION: ");
            
            char opcion = leer.next().charAt(0);
            
            switch (opcion) {
                case '1':
                    convertir(3.58, "Soles Peruanos", leer);
                    break;
                case '2':
                    convertir(22.15, "Pesos Mexicanos", leer);
                    break;
                case '3':
                    convertir(3851.90, "Pesos Colombianos", leer);
                    break;
                case '4':
                    convertir(989.20, "Pesos Chilenos", leer);
                    break;
                case '5':
                    convertir(157.87, "Yenes", leer);
                    break;
                case '6':
                    System.out.println("CERRANDO PROGRAMA");
                    leer.close(); // Cerrar el Scanner antes de salir
                    return; // Salir del programa5      
                default:
                    System.out.println("OPCIÓN INCORRECTA");
            }
        }
    }

    static void convertir(double valorDolar, String pais, Scanner leer) {
        System.out.printf("Ingrese la cantidad de %s: ", pais);
        double cantidadMoneda = leer.nextDouble();
        
        double dolares = cantidadMoneda / valorDolar;
        dolares = Math.round(dolares * 100.0) / 100.0;
        
        System.out.println("----------------------------------");
        System.out.printf("│  Tienes $%.2f Dolares          │%n", dolares);
        System.out.println("----------------------------------");
    }
}