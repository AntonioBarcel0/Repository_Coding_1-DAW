package coche;

public class Puerta {
	// Creo el atributo y se declara la variable cerrada
				private boolean cerrada;
				private static String color;
				// Se crea el constructor de la clase Puerta
				public Puerta(String color) {
					this.cerrada = false; // Al principio la puerta está abierta
					Puerta.color = color;
				}
				// Se crea el método para cerrar la puerta  
				public void cerrar() {
					if (!cerrada) {
						cerrada = true;
						System.out.println("la puerta se cierra.");
					} else {
						System.out.println("La puerta ya está cerrada.");
					}
				}
				// Se crea el método para abrir la puerta
				public void abrir() {
					if (cerrada) {
						cerrada = false;
						System.out.println("Abre la puerta.");
					} else {
						System.out.println("La puerta ya esta abierta");
					}
				}
				// Se crea el método para mostrar el estado de la puerta
				public void estadoPuerta() {
					if (cerrada) {
						System.out.println("Está cerrada.");
					} else {
						System.out.println("Cierra la puerta.");
					}
				}
				public static void main(String[] args) {
					Puerta puerta = new Puerta(color);// Se crea una instacia de puerta. 
					
					puerta.estadoPuerta();
					puerta.cerrar();
					puerta.estadoPuerta();
					puerta.abrir();
					puerta.estadoPuerta();
				}
			}


