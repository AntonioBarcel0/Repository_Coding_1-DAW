package coche;

public class Ventana {
	// Creo el atributo y se declara la variable subida
			private boolean subida;
			private boolean tintada; 
			private static String colorTintado;
			// Se crea el constructor de la clase Ventana
			public Ventana(String colorTintado) {
				this.subida = false; // Al principio la ventana est� bajada
				Ventana.colorTintado = colorTintado;
			}
			// Se crea el m�todo para subir la ventana  
			public void subir() {
				if (!subida) {
					subida = true;
					System.out.println("la ventana est� subida.");
				} else {
					System.out.println("La ventana ya est� subida.");
				}
			}
			// Se crea el m�todo para bajar la ventana
			public void bajar() {
				if (subida) {
					subida = false;
					System.out.println("La ventana se ha bajado.");
				} else {
					System.out.println("La ventana ya est� bajada.");
				}
			}
			// Se crea el m�todo para mostrar el estado de la ventana
			public void estadoVentana() {
				if (subida) {
					System.out.println("No puede seguir subiendo");
				} else {
					System.out.println("Mant�n pulsado el bot�n hasta que termine de subir");
				}
			}
			public static void main(String[] args) {
				Ventana ventana = new Ventana(colorTintado);// Se crea una instacia de Ventana 
				
				ventana.estadoVentana();
				ventana.subir();
				ventana.estadoVentana();
				ventana.bajar();
				ventana.estadoVentana();
			}
		}

