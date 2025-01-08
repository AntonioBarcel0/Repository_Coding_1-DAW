package actividad_formativa1;

public class Ejercicio4 {
	
	class Caballo{
			private String nombre;
			private String color;
			private Integer victorias;
			private Integer derrotas;
			private Integer trofeos;
			
			public Caballo (String nombre, String color, Integer victorias, Integer derrotas, Integer trofeos) {
				this.nombre=nombre;
				this.color= color;
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

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public Integer getVictorias() {
				return victorias;
			}

			public void setVictorias(Integer victorias) {
				this.victorias = victorias;
			}

			public Integer getDerrotas() {
				return derrotas;
			}

			public void setDerrotas(Integer derrotas) {
				this.derrotas = derrotas;
			}

			public Integer getTrofeos() {
				return trofeos;
			}

			public void setTrofeos(Integer trofeos) {
				this.trofeos = trofeos;
			}

			

		}
	}
