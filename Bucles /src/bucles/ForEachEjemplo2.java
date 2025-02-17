package bucles;

public class ForEachEjemplo2 {
	public static void main(String[]args) {
		String[] nombres = {"Pepe", "Juan", "Ana", "Luisa"};
		
		System.out.println("Lista de nombres: ");
		for(String nombre : nombres) {
			System.out.println(nombre);
		}
	}

}
