package arrays;
import java.util.Scanner;

/**
 * Crea un programa que pida 10 números enteros, los almacene en un array y
 * luego muestre el array invertido.
 */

public class ArrayEjemplo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[10];

		// 1.Pedir al usuario 10 numeros
		System.out.println("Señor usuario, deme ahora mismo 10 números: ");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Número " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}
		
		// 2.Mostrar el array
		System.out.println("Este es el array: ");
		for (int num : numeros) {
			System.out.println(num + " ");
		}
		System.out.println(); //Salto de linea
		
		//3. Invertir el array
		for (int i = 0; i < numeros.length / 2; i++) {
			int temp = numeros[i]; //Guardamos el valor de la posicion
			numeros[i] = numeros[numeros.length - 1 - i]; //Asignamos el valor opuesto
			numeros[numeros.length -1 -i] = temp; //Asignamos el valor guardadi en temp
		}
		
		//4. Mostramos el array invertido
		System.out.println("Array invertido: ");
		for (int num : numeros) {
			System.out.println(num + " ");
		}
		System.out.println(); //Salto de línea
		
		scanner.close();
	}

}
