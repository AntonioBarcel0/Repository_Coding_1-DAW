package switchcases_ud3;

public class Estaciones {
	public static void main (String [] args) {
        int mesdelanyo = 7; // Julio
		String estacion;
		
		switch(mesdelanyo) {
		case 1:
		case 2:
		case 12:
			estacion = "Invierno";
			break;
			
		case 6:
		case 7:
		case 8:
			estacion = "Verano";
			break;
			
		case 3:
		case 4:
		case 5:
			estacion = "Primavera";
			break;
		case 9:
		case 10:
		case 11:
			estacion = "Oto�o";
			break;
		default:
			estacion ="Inv�lido";
		}
		System.out.println("Estamos en la estaci�n de: " + estacion);
	}
}
