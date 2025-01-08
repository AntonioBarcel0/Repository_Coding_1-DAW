package coche;

public class Rueda {
	// Creo el atributo y se declara la variable inflada
		private boolean inflada;
		private static int pulgadas;
		// Se crea el constructor de la clase Rueda
		public Rueda(int pulgadas) {
			this.inflada = false; // Al principio la rueda esta desinflada
			Rueda.pulgadas = pulgadas;
		}
		// Se crea el m�todo para inflar la rueda
		public void inflar() {
			if (!inflada) {
				inflada = true;
				System.out.println("la rueda ha sido inflada.");
			} else {
				System.out.println("La rueda ya se ha inflado.");
			}
		}
		// Se crea el m�todo para desinflar la rueda
		public void desinflar() {
			if (inflada) {
				inflada = false;
				System.out.println("La rueda se ha desinflado");
			} else {
				System.out.println("La rueda ya est� desinflada");
			}
		}
		// Se crea el m�todo para mostrar el estado de la rueda
		public void estadoRueda() {
			if (inflada) {
				System.out.println("La rueda est� lista");
			} else {
				System.out.println("Hay que inflar la rueda");
			}
		}
		public static void main(String[] args) {
			Rueda rueda = new Rueda(pulgadas);// Se crea una instacia de Rueda
			
			rueda.estadoRueda();
			rueda.inflar();
			rueda.estadoRueda();
			rueda.desinflar();
			rueda.estadoRueda();
		}
	}


