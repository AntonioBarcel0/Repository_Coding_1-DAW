package coche;

public class Furgoneta {
	private Motor motor;
	private Rueda[] ruedas;
	private Puerta[] puertas;
	private Ventana[] ventanas;
	
	public Furgoneta(int cilindrada, String combustible, int pulgadas, String colorPuertas, String colorTintado) {
		// Crear el motor
		this.motor = new Motor(cilindrada, combustible);
		
		// Crear las ruedas
		this.ruedas = new Rueda[4];
		int i;
		for (i = 0; i < 4; i++) {
			this.ruedas[i] = new Rueda(pulgadas);
		}
		
		// Crear las puertas
		this.puertas = new Puerta[5];
		for (i = 0; i < 5; i++) {
			this.puertas[i] = new Puerta(colorPuertas);
		}
	}
	
	public void arrancarMotor() {
		motor.arrancar();
	}
	public void apagarMotor() {
		motor.apagar();
	}
	public void inflarRuedas() {
		for (Rueda rueda : ruedas) {
			rueda.inflar();
		}
	}
	public void desinflarRuedas() {
		for (Rueda rueda : ruedas) {
			rueda.desinflar();
		}
	}
	public void abrirTodasLasPuertas() {
		for (Puerta puerta : puertas) {
			puerta.abrir();
		}
	}
	public void cerrarTodasLasPuertas() {
		for (Puerta puerta : puertas) {
			puerta.cerrar();
		}
	}
	public void subirLasVentanas() {
		for (Ventana ventana : ventanas) {
			ventana.subir();
		}
	}
	public void bajarLasVentanas() {
		for (Ventana ventana : ventanas) {
			ventana.bajar();
		}
	}
	
	// Getters para acceder a todos los componentes específicos
	public Motor getMotor() {
		return motor;
	}

	public Rueda[] getRuedas() {
		return ruedas;
	}

	public Puerta[] getPuertas() {
		return puertas;
	}

	public Ventana[] getVentanas() {
		return ventanas;
	}
	
	
	
	
	
	
	
	

}
