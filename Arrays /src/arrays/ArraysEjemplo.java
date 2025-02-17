package arrays;

import java.util.Scanner;

/**
 * Crea un programa en Java que:
 * 
 * 1.Pida al usuario que ingrese 10 números enteros y los almacene en un array.
 * 2.Muestre el array ingresado. 
 * 3.Calcule y muestre la suma de todos los
 * números. 
 * 4.Encuentre y muestre el número mayor y el número menor. 
 * 5.Calcule y muestre el promedio de los números.
 */

public class ArraysEjemplo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Declaramos el array de 10 numeros enteros
		int[] numeros = new int[5];

		// 1. Pedimos los numeros al usuario
		System.out.println("Introduzca 10 números enteros: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Número " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}
		

		//2. Mostramos el array
		System.out.println("\nNúmeros ingresados: ");
		for (int num : numeros) {
			System.out.println(num + " ");
		}System.out.println();
		
		
		//3. Calculamos la suma 
		int suma = 0;
		for(int num : numeros) {
			suma += num;
		}
		System.out.println("Suma total: " + suma);
		
		//4. Encontrar el número mayor y menor 
		int max = numeros[0], min = numeros[0];
		for (int num : numeros) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.println("Número mayor: " + max);
		System.out.println("Número menor: " + min);
		
		//5. Calculo del promedio
		double promedio = (double) suma / numeros.length;
		System.out.println("Promedio: " + promedio);
		
		scanner.close();
	}

}
