
public class ej_2_java {

	    public static void main(String[] args) {
	        for (int i = 1; i <= 10000; i++) {
	            boolean esPrimo = true;
	            for (int j = 2; j <= i / 2; j++) {
	                if (i % j == 0) {
	                    esPrimo = false;
	                    System.out.print(i + " no es primo, sus divisores son: ");
	                    for (int k = 2; k <= i / 2; k++) {
	                        if (i % k == 0) {
	                            System.out.print(k + " ");
	                        }
	                    }
	                    System.out.println();
	                    break;
	                }
	            }
	            if (esPrimo) {
	                System.out.println(i + " es primo");
	            }
	        }
	    }
	}

