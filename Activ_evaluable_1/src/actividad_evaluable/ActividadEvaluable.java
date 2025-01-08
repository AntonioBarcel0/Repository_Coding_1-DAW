package actividad_evaluable;

public class ActividadEvaluable {
	public static void main (String[] args) {
	
	/* Declaramos los 
	 * atributos o 
	 * variables 
	 */
	int t = 567;
	int m = 877;
	
	//Mostrar valores de las variables
    System.out.println("Valor de t: " + t);
    System.out.println("Valor de m: " + m);
    
		// Suma 
		int suma = t + m;
		System.out.println("suma: " + suma);
		//Resta
		int resta = t - m;
		System.out.println("resta: " + resta);
		//División
		int división = t / m;
		System.out.println("división: " + división);
		//Multiplicación
		int multiplicación = t * m; 
		System.out.println("multiplicación: " + multiplicación);
		//Módulo
		int módulo = t % m;
		System.out.println("módulo: " + módulo);
	
			
	//realizamos conversiones de tipo ANCHO
	int suma1 = 1444;
		//Conversión de tipo ancho de int a long
		long sumalong = suma1;
		System.out.println("Conversión a long: " + sumalong);
		//Conversión de tipo ancho de int a double
		double sumaDecimal = suma1;
		System.out.println("Conversión a double: " + sumaDecimal);
	
	
	float numeroFloat = (float) sumaDecimal;
		System.out.println("Conversion de double a float: " + numeroFloat);
		/*Conversión de tipo estrecho de 
		 *float a 
		 *int
		 */
		int intFloat = (int) numeroFloat;
		System.out.println("Conversion de float a int: " + intFloat);
	
	
	}
	

}
