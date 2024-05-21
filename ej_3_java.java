import java.util.Scanner;

public class ej_3_java {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int numero;
	        do {
	            System.out.print("Ingrese un numero: ");
	            numero = scanner.nextInt();
	            
	            if (numero > 100 && esPrimo(numero)) {
	                System.out.println("numero mayor que 100 y es primo");
	                break;
	            }
	        } while (true);
	        
	        scanner.close();
	    }

	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
