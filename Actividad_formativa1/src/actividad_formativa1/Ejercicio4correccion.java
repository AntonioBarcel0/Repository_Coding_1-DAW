package actividad_formativa1;

public class Ejercicio4correccion {

		//Declaración atributos
		private String nombre;
		private String color;
		private Integer edad;
		private Integer victorias;
		private Integer derrotas;
		private Integer trofeos;
		
		//Declaración constructores
		public Ejercicio4correccion (String nombre, String color, Integer edad, Integer victorias, Integer derrotas, Integer trofeos) {
			this.nombre=nombre;
			this.color= color;
			this.edad= edad;
			this.victorias=victorias;
			this.derrotas=derrotas;
			this.trofeos=trofeos;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Integer getVictorias() {
			return victorias;
		}

		public void setVictorias() {
			//this.victorias = victorias;
			this.victorias++;
		}

		public Integer getDerrotas() {
			return derrotas;
		}

		public void setDerrotas() {
			//this.derrotas = derrotas;
			this.derrotas++;
		}

		public Integer getTrofeos() {
			return trofeos;
		}

		public void setTrofeos() {
			//this.trofeos = trofeos;
			this.trofeos++;
		}

		public String getColor() {
			return color;
		}

		public Integer getEdad() {
			return edad;
		}
		
		public void setEdad() {
			//this.edad=edad;
			this.edad++;
		}

		
		

	}


