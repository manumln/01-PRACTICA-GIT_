import java.util.Scanner;

public class Matematicas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero= sc.nextInt();
		if (numero%2==0)
		System.out.println("El número es par");
		else
		System.out.println("El número es impar");
	}
		public static boolean esPar(int numero){
			if (numero%2==0) return true;
			else return false;
		}
	public static boolean esDivisiblePorTres(int numero1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un número entero");
			numero1 = 9;
			int contador = 3;
			sc.close();

			if (numero1 == 0) {
				System.out.println("0 no tiene divisores");
				System.exit(1);
			}

			do {
				if (contador % 3 == 0) {
					if (numero1 < 0) {
						System.out.print(-contador + "\t");
					} else {
						System.out.print(contador + "\t");
					}
				}
				contador++;
			} while (contador <= Math.abs(numero1));
		return false;
			}
}


