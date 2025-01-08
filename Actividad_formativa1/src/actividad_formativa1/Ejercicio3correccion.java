package actividad_formativa1;

import java.util.Random;

public class Ejercicio3correccion {
	public static void main(String[] args) {
			
		Random random = new Random();
		int suma=0;
		
		for(int x=1;x<=5;x++) {
			int tirada=random.nextInt(6)+1;
			System.out.println("La tirada "+x+" vale: "+ tirada);
			suma=suma+tirada;
			//suma+=tirada;
		}
		System.out.println("La suma total de las tiradas es: "+suma);
		
	}
}
