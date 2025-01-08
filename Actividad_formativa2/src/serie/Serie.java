package serie;

public class Serie {
	// Atributos
	private  String titulo;
	private  String autor;
	private  int actores;
	
	//constructor con parámetros
	public Serie(String titulo, String autor, int autores) {
		this.titulo = titulo;
		this.autor = autor;
		this.actores = 0;
	}
	
	//Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.autor = "";
		this.actores = 0;
	}
	
	//Creamos observadores y modificadores(getters and setters)
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getActores() {
		return actores;
	}

	public void setActores(int actores) {
		this.actores = actores;
	}
	
	
	

}
