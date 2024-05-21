import java.util.Scanner;
import java.util.ArrayList;

public class ej_4_java {

	    public static void main(String[] args) {
	        // Creo una lista de nombres de gaseosas
	        ArrayList<String> nombres = new ArrayList<>();
	        nombres.add("Cocacola");
	        nombres.add("Pepsi");
	        nombres.add("Manaos");
	        nombres.add("Paso de los toros");

	        // Usamos un bucle for-each para imprimir cada nombre en la lista
	        System.out.println("Lista de nombres de estudiantes:");
	        for (String nombre : nombres) {
	            System.out.println(nombre);
	        }
	    }
	}

