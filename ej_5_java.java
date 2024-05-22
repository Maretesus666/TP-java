
package ejercicios;

import java.util.Scanner;
public class ej_5_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char opcion;
        boolean repetir = false;

        do {
            // Mostrar el menú de opciones
            System.out.println("Menú de calculadora:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir \n");
            System.out.print("Ingrese su opción: \n");
            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case '1':
              
                    realizarOperacion("+", scanner);
                    repetir = preguntarSiRepetir(scanner);
                    break;
                case '2':
                    realizarOperacion("-", scanner);
                    repetir = preguntarSiRepetir(scanner);
                    break;
                case '3':
                    realizarOperacion("*", scanner);
                    repetir = preguntarSiRepetir(scanner);
                    break;
                case '4':
                    realizarOperacion("/", scanner);
                    repetir = preguntarSiRepetir(scanner);
                    break;
                case '5':
                    System.out.println("Saliendo de la calculadora...");
                    repetir = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    repetir = true;
            }
        } while (repetir);

        scanner.close();
    }

    // Método para realizar la operación aritmética correspondiente
    public static void realizarOperacion(String operador, Scanner scanner) {
        double num1, num2, resultado;
        // Solicitar al usuario que ingrese los números
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        // Realizar la operación correspondiente según el operador ingresado
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operador no válido.");
        }
    }

    // Método para preguntar al usuario si desea repetir la operación
    public static boolean preguntarSiRepetir(Scanner scanner) {
        System.out.print("¿Desea realizar otra operación? (S/N): \n ");
        char respuesta = scanner.next().charAt(0);
        return respuesta == 'S' || respuesta == 's';
    }
}
