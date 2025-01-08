package switchcases_ud3;

public class SystemaCalificacion {
	public static void main (String [] args) {
		
		int calificacion = 10;
		String SystemaCalificacion;
		switch(calificacion) {
		case 1:
		case 2:
		case 3:
		case 4:
			 SystemaCalificacion = "Insuficiente";
			break;
			
		case 5:
			 SystemaCalificacion = "Suficiente";
			break;
			
		case 6:
			 SystemaCalificacion = "Bien";
			break;
			
		case 7:
		case 8:
			 SystemaCalificacion = "Notable";
			break;
			
		case 9:
			 SystemaCalificacion = "Sobresaliente";
			break;
		case 10:
			 SystemaCalificacion = "Excelente";
			break;
		
		default:
			 SystemaCalificacion ="Inválido";
		}
		System.out.println("Su calificación es de: " +  SystemaCalificacion);
	}

}
