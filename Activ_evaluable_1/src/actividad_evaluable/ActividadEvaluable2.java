package actividad_evaluable;

public class ActividadEvaluable2 {
	public static void main (String[] args) {
	
	//Declaramos constantes
	final double PI = 3.1416; //De tipo "doble
	final int GRAVITY = 9; //De tipo int
	final long velocidadLuz = 299792458L; //De tipo long
	
	//Variables de distintos tipos
	byte b = 12;           // Variable b de tipo byte (rango de -128 a 127) 
    double m = 45.98;      // Variable m de tipo double
 
    //Valores de las variables y constantes
    System.out.println("Valor de b (byte): " + b);
    System.out.println("Valor de m (double): " + m);
    System.out.println("Valor de la constante GRAVITY (int): " + GRAVITY);
    System.out.println("Valor de la constante PI (double): " + PI);
    System.out.println("Valor de la constante velocidadLuz (long): " + velocidadLuz);
    
    //Operaciones aritm�ticas
    	// Suma 
 		double suma = b + m;
 		System.out.println("suma: " + suma);
 		//Resta
 		double resta = b - m;
 		System.out.println("resta: " + resta);
 		//Divisi�n
 		double divisi�n = b / m;
 		System.out.println("divisi�n: " + divisi�n);
 		//Multiplicaci�n
 		double multiplicaci�n = b * m; 
 		System.out.println("multiplicaci�n: " + multiplicaci�n);
 		//M�dulo
 		double m�dulo = b % m;
 		System.out.println("m�dulo: " + m�dulo);
 		
	//Conversiones de tipo ancho
 		//Conversi�n de byte a double
 		double btoDouble = (double) b;
 		System.out.println("Conversi�n de byte a double: " + btoDouble);
 		//Conversi�n de PI(float) a double
 		double PItoDouble = (double) PI;
 		System.out.println("Conversi�n de float a double: " + PItoDouble);
	//Conversiones de tipo estrecho
 		//Conversi�n de double a int
 		short mtoshort = (short) m;
 		System.out.println("Conversi�n de double a short: " + mtoshort);
 		//Conversi�n de long a int
 		int luztoInt = (int) velocidadLuz;
 		System.out.println("Conversi�n de long a int: " + luztoInt);
    
    
}

}
