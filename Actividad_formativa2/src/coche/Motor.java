package coche;

public class Motor {
	// Creo el atributo y se declara la variable encendido
	private static String combustible;
	private static int cilindrada;
	private boolean encendido;
	// Se crea el constructor de la clase Motor
	public Motor(String combustible, int cilindrada) {
		this.encendido = false; // Al principio el motor está apagado
		Motor.combustible = combustible;
		Motor.cilindrada = cilindrada;
	}
	public Motor(int cilindrada2, String combustible2) {
		// TODO Auto-generated constructor stub
	}
	// Se crea el método para arrancar el motor
	public void arrancar() {
		if (!encendido) {
			encendido = true;
			System.out.println("El motor ha sido arrancado.");
		} else {
			System.out.println("El motor ya ha sido encendido.");
		}
	}
	// Se crea el método para apagar el motor
	public void apagar() {
		if (encendido) {
			encendido = false;
			System.out.println("El motor ha sido apagado.");
		} else {
			System.out.println("El motor ya está apagado.");
		}
	}
	// Se crea el método para mostrar el estado del motor
	public void mostrarEstado() {
		if (encendido) {
			System.out.println("El motor está en marcha.");
		} else {
			System.out.println("El motor está apagado.");
		}
	}
	public static void main(String[] args) {
		Motor motor = new Motor(combustible, cilindrada);// Se crea una instacia de Motor
		
		motor.mostrarEstado();
		motor.arrancar();
		motor.mostrarEstado();
		motor.apagar();
		motor.mostrarEstado();
	}
}
