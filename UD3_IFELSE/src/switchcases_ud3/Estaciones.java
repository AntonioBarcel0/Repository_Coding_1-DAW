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
			estacion = "Otoño";
			break;
		default:
			estacion ="Inválido";
		}
		System.out.println("Estamos en la estación de: " + estacion);
	}
}
