package restaurante;

public class Pedido {
	//Atributos de la clase Pedido
	public double precioPrimerPlato;
	public double precioSegundoPlato;
	public double precioBebida;
	public double precioPostre;
	public String primerPlato;
	public String segundoPlato;
	public String bebida;
	public String postre;
	
	// Constructor para inicializar los atributos
	public Pedido(String primerPlato, double precioPrimerPlato, String segundoPlato, double precioSegundoPlato, String bebida, double precioBebida, String postre, double precioPostre) {
		this.primerPlato = primerPlato;
		this.precioPrimerPlato = precioPrimerPlato;
		this.segundoPlato = segundoPlato;
		this.precioSegundoPlato = precioSegundoPlato;
		this.bebida = bebida;
		this.precioBebida = precioBebida;
		this.postre = postre;
		this.precioPostre = precioPostre;
	}
	
	// Método para calcular el total del pedido
	public double calcularTotal() {
		return precioPrimerPlato + precioSegundoPlato + precioBebida + precioPostre;
	}
	
	// Método para mostrar la información del pedido
	public void mostrarPedido() {
		System.out.println("Primer plato: " + primerPlato + " - $" + precioPrimerPlato);
		System.out.println("Segundo plato: " + segundoPlato + " - $" + precioSegundoPlato);
		System.out.println("bebida: " + bebida + " - $" + precioBebida);
		System.out.println("Postre: " + postre + " - $" + precioPostre);
	}
	
	// Pedido 1
	public double calcularPedido1() {
		return precioPrimerPlato + precioBebida;
	}
	// Pedido 2
	public double calcularPedido2() {
		return precioPrimerPlato + precioSegundoPlato + precioBebida;
	}
	// Pedido 3
	public double calcularPedido3() {
		return precioPrimerPlato + precioSegundoPlato + precioBebida + precioPostre;
	}
	
	
	
	public static void main(String[] args) {
		// Crear un objeto Pedido
		Pedido miPedido = new Pedido("Sopa", 6.0, "Pollo asado", 10.5, "Agua", 1.5, "melón", 2.0);
		// Mostrar la información de los pedidos
		System.out.println("Valor del pedido 1: " + miPedido.calcularPedido1());
		System.out.println("Valor del pedido 2: " + miPedido.calcularPedido2());
		System.out.println("Valor del pedido 3: " + miPedido.calcularPedido3());
	}
	
	
	
	


}
