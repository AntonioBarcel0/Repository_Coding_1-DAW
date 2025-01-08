package actividad_formativa1;

import java.util.Random;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Random random = new Random();
		int tirada1 = random.nextInt (6) + 1;
		int tirada2 = random.nextInt (6) + 1;
		int tirada3 = random.nextInt (6) + 1;
		int tirada4 = random.nextInt (6) + 1;
		int tirada5 = random.nextInt (6) + 1;
		int sumaTotal = tirada1 + tirada2 + tirada3 + tirada4 + tirada5;
		
		
			System.out.println("La tirada1 da el valor de: " + tirada1);
			System.out.println("La tirada2 da el valor de: " + tirada2);
			System.out.println("La tirada3 da el valor de: " + tirada3);
			System.out.println("La tirada4 da el valor de: " + tirada4);
			System.out.println("La tirada5 da el valor de: " + tirada5);
			System.out.println("La suma del total de las tiradas es: " + sumaTotal);
		
	}

}
