package pizzas;

/*Crea la clase Pizza con los atributos y métodos necesarios. 
Para cada una de las pizzas se necesita saber el tamaño - 
mediana o familiar - el tipo - barbacoa, cuatro quesos o 
carbonara - y su estado - pedida o servida. 
La clase debe almacenar información sobre el número 
total de pizzas que se han pedido y que se han servido. 
Siempre que se crea una pizza nueva, su estado es "pedida", etc. 
Échale imaginación.*/

public class Ejercicio5 {
	
	public class pizza{
		private String tamanio;
		private String tipo;
		private String estado;
		
		// Atributos estáticos para almacenar información sobre el total de pizzas pedidas
		private int totalPedidas = 0;
		private int totalServidas = 0;
		
		public pizza (String tamanio, String tipo) {
			this.tamanio = tamanio;
			this.tipo = tipo;
			this.estado = "pedida";
			totalPedidas++; // Cada vez que se crea una pizza, incrementa el total de pedidas
		}
		public void servir() {
			estado = "servida";
			totalServidas++;
		}
		public int totalPedidas() {
			return totalPedidas;
		}
		public  int totalServidas() {
			return totalServidas;
		}
		
		// Clase principal para probar la clase Pizza
		public class Pizzamain {
		    public void main(String[] args) {
		        // Crear dos pizzas nuevas
		        Pizza pizza1 = new Pizza();
		        Pizza pizza2 = new Pizza();

		        // Servir la primera pizza
		        pizza1.servir();

		        // Mostrar información de las pizzas
		        System.out.println("Pizza 1: " + pizza1.getTamanio() + ", " + pizza1.getTamanio() + ", Estado: " + pizza1.getEstado());
		        System.out.println("Pizza 2: " + pizza2.getTamanio() + ", " + pizza2.getTamanio() + ", Estado: " + pizza2.getEstado());

		        // Mostrar el total de pizzas pedidas y servidas
		        System.out.println("Total de pizzas pedidas: " + Pizza.getTotalPedidas());
		        System.out.println("Total de pizzas servidas: " + Pizza.getTotalPedidas());
		    }
		}
	}
}


			
	

