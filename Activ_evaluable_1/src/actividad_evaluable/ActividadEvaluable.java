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
		//Divisi�n
		int divisi�n = t / m;
		System.out.println("divisi�n: " + divisi�n);
		//Multiplicaci�n
		int multiplicaci�n = t * m; 
		System.out.println("multiplicaci�n: " + multiplicaci�n);
		//M�dulo
		int m�dulo = t % m;
		System.out.println("m�dulo: " + m�dulo);
	
			
	//realizamos conversiones de tipo ANCHO
	int suma1 = 1444;
		//Conversi�n de tipo ancho de int a long
		long sumalong = suma1;
		System.out.println("Conversi�n a long: " + sumalong);
		//Conversi�n de tipo ancho de int a double
		double sumaDecimal = suma1;
		System.out.println("Conversi�n a double: " + sumaDecimal);
	
	
	float numeroFloat = (float) sumaDecimal;
		System.out.println("Conversion de double a float: " + numeroFloat);
		/*Conversi�n de tipo estrecho de 
		 *float a 
		 *int
		 */
		int intFloat = (int) numeroFloat;
		System.out.println("Conversion de float a int: " + intFloat);
	
	
	}
	

}
