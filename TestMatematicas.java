import java.util.Scanner;

public class TestMatematicas {
	static Scanner sc = new Scanner(System.in);
	private static void main(String[] args) {
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		if (Matematicas.esPar(numero) )
			System.out.println("El numero es par");
		else
			System.out.println("El número es impar");
		}

	
	}
