package libro;

public class Libro {
	private String isbn;
	private String titulo;
	private int anio;
	private boolean prestado;
	
	public Libro (String isbn, String titulo, int anio, boolean prestado) {
		this.isbn=isbn;
		this.anio=anio;
		this.titulo=titulo;
		this.prestado=false;
	}
	
	public void prestar() {
		prestado=true;
	}
	public void devolver() {
		prestado=false;
	}
	public void estadoLibro() {
		if (prestado=true) {
		System.out.println("El libro está disponible");	
		}
		else {System.out.println("El libro no está disponible");
			
		}
	}
	

}
