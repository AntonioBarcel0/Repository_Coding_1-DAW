package actividad_formativa1;



public class Ejercicio6 {
	public static void main(String[] args) {
	public class movil{
		private String marca;
		private String modelo;
		private String capacidad;
		private float precio;
		private int numeroSerie;
		
		public movil (String marca, String modelo, String capacidad, float precio,int numeroSerie) {
			this.marca = marca;
			this.modelo = modelo;
			this.capacidad=capacidad;
			this.precio=precio;
			this.numeroSerie=numeroSerie;
		}

		public String getCapacidad() {
			return capacidad;
		}

		public void setCapacidad(String capacidad) {
			this.capacidad = capacidad;
		}

		public float getPrecio() {
			return precio;
		}

		public void setPrecio(float precio) {
			this.precio = precio;
		}

		public String getMarca() {
			return marca;
		}

		public String getModelo() {
			return modelo;
		}

		public int getNumeroSerie() {
			return numeroSerie;
		}

		public void comprar() {
			// TODO Auto-generated method stub
			
		}
	}
	
	public class Movilmain {
	    public Movilmain(String string) {
			
		}

	    public Movilmain(String string, String string2, String string3, String string4, String string5) {
			
		}

		public void main(String[] args) {
	        
	        // Comprar el movil
	        Movilmain movil1 = new Movilmain ("Iphone ", "14pro, ","256gb, ","1199.99",", 894388192813");
	        
	        // Mostrar información de los moviles
	        System.out.println("Este es mi móvil: "+ movil1);
	      

	    }
	}
	}

}


