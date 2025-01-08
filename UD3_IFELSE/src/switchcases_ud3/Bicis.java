package switchcases_ud3;

public class Bicis {
		static String marca;
		enum Biciss{
			Yamaha,
			Suzuki,
			Peugeot,
			Orbea, 
			Monty,
			Canyon;
		}
		public static void main (String [] args) {
			Biciss b;
			b=Biciss.Orbea;
			
			switch (b) {
			case Yamaha:
				marca="Yamaha";
				break;
			case Suzuki:
				marca="Suzuki";
				break;
			case Peugeot:
				marca="Peugeot";
				break;
			case Orbea:
				marca="Orbea";
				break;
			case Monty:
				marca="Monty";
				break;
			case Canyon:
				marca="Canyon";
				break;
			default:
				marca="inválida";
			}
			System.out.println("La marca de la bici es: " + marca);
	}

}
