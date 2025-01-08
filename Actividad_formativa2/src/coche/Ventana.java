package coche;

public class Ventana {
	// Creo el atributo y se declara la variable subida
			private boolean subida;
			private boolean tintada; 
			private static String colorTintado;
			// Se crea el constructor de la clase Ventana
			public Ventana(String colorTintado) {
				this.subida = false; // Al principio la ventana está bajada
				Ventana.colorTintado = colorTintado;
			}
			// Se crea el método para subir la ventana  
			public void subir() {
				if (!subida) {
					subida = true;
					System.out.println("la ventana está subida.");
				} else {
					System.out.println("La ventana ya está subida.");
				}
			}
			// Se crea el método para bajar la ventana
			public void bajar() {
				if (subida) {
					subida = false;
					System.out.println("La ventana se ha bajado.");
				} else {
					System.out.println("La ventana ya está bajada.");
				}
			}
			// Se crea el método para mostrar el estado de la ventana
			public void estadoVentana() {
				if (subida) {
					System.out.println("No puede seguir subiendo");
				} else {
					System.out.println("Mantén pulsado el botón hasta que termine de subir");
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

