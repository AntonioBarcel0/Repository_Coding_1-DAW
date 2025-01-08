package switchcases_ud3;

public class Diadelasemana {
	
	public static void main (String [] args) {
		int dia = 2;
		String diaSemana;
		switch (dia) {
		case 1: 
			diaSemana="Lunes";
			break;
		case 2: 
			diaSemana="Martes";
			break;
		case 3: 
			diaSemana="Miércoles";
			break;
		case 4: 
			diaSemana="Jueves";
			break;
		case 5: 
			diaSemana="Viernes";
			break;
		case 6: 
			diaSemana="Sábado";
			break;
		case 7: 
			diaSemana="Domingo";
			break;
		default:
			diaSemana ="Inválido";
		}
		
		System.out.println("El día de la sema es:  " + diaSemana);
	}

}
