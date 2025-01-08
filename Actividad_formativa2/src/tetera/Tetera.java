package tetera;

public class Tetera {
		//Atributos
		private int capacidadMaxima;
		private int cantidadActual;
		
		//Constructor predeterminado
		public Tetera() {
			this.capacidadMaxima=1000;
			this.cantidadActual=0;
		}
		//Constructor con la capacidad, llenando la tetera a su maxima capacidad
		public Tetera(int capacidadMaxima) {
			this.capacidadMaxima=capacidadMaxima;
			this.cantidadActual=capacidadMaxima;
		}
		//Constructor con la capacidad maxima y la cantidad actual.
		public Tetera(int capacidadMaxima, int cantidadActual) {
			this.capacidadMaxima=capacidadMaxima;
			//Si la cantidad actual es mayor que la capacidad maxima se ajusta al maximo
			if (cantidadActual > capacidadMaxima) {
				this.cantidadActual=capacidadMaxima;
			}
			else {
				this.cantidadActual=cantidadActual;
			}
			
		}
		//Observadores y modificadores
		public int getCapacidadMaxima() {
			return capacidadMaxima;
		}
		public void setCapacidadMaxima(int capacidadMaxima) {
			this.capacidadMaxima = capacidadMaxima;
		}
		public int getCantidadActual() {
			return cantidadActual;
		}
		public void setCantidadActual(int cantidadActual) {
			this.cantidadActual = cantidadActual;
			if (cantidadActual > capacidadMaxima) {
				this.cantidadActual=capacidadMaxima;
			}
			else {
				this.cantidadActual=cantidadActual;
			}
		}
		//Metodo para llenar la tetera
		public void llenarTe() {
			this.cantidadActual= capacidadMaxima;
		}
		//Metodo para servir una taza 
		public void servirTaza(int cantidadTaza) {
			//Si la cantidad actual es mayor o igual a la cantidad de la taza, servimos la taza completa
			if (cantidadActual >= cantidadTaza) {
				cantidadActual -= cantidadTaza;
				System.out.println("Se ha servido una taza de: " + cantidadTaza + "cc de té.");
			}
			else {
				// Si no alcanza, servimos lo que quede
				System.out.println("No hay suficiente te. Solo hay " + cantidadActual + "cc de té.");
				cantidadActual = 0;
				}
		}
		// Método para vaciar la tetera 
		public void vaciarTe() {
			this.cantidadActual = 0;
		}
		// Método para agregar más té a la tetera
		public void agregarTe(int cantidad) {
			// Si la cantidad a agregar excede la capacidad máxima, ajustamos al máximo
			if (cantidadActual + cantidad > capacidadMaxima) {
				cantidadActual = capacidadMaxima;
				System.out.println("Se ha llenado la tetera a su capacidad maxima de " + capacidadMaxima + " c.c");
			} else {
				cantidadActual += cantidad;
				System.out.println("Se ha agregado " + cantidad + "cc de té. Cantidad actual: " + cantidadActual + " c.c");
			}
		}
		
		public static void main (String[] args) {
			Tetera  miTetera = new Tetera();
			
			System.out.println("Capacidad máxima: " + miTetera.getCapacidadMaxima() + "c.c.");
			System.out.println("Cantidad actual: " + miTetera.getCantidadActual() + "c.c.");
			
			miTetera.llenarTe();
			System.out.println("Cantidad actual después de llenar: " + miTetera.getCantidadActual() + "c.c.");
			
			miTetera.servirTaza(300);
			System.out.println("Cantidad actual después de servir una taza: " + miTetera.getCantidadActual() + "c.c. ");
			
			miTetera.agregarTe(200);
			System.out.println("Cantidad actual después de agregar más té: " + miTetera.getCantidadActual() + "c.c. ");
			
			miTetera.vaciarTe();
			System.out.println("Cantidad actual después de vaciar la tetera: " + miTetera.getCantidadActual() + " c.c.");
	}
	
}

