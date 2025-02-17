package bucles;
import java.util.ArrayList;

public class ForEachArrayList {
	public static void main (String []args) {
		ArrayList<String> listaFrutas = new ArrayList<>();
		listaFrutas.add("Manzana");
		listaFrutas.add("Pera");
		listaFrutas.add("Naranja");
		listaFrutas.add("Sandía");
		
		System.out.println("Lista de frutas: ");
		for (String fruta : listaFrutas) {
			System.out.println(fruta);
		}
	}

}
