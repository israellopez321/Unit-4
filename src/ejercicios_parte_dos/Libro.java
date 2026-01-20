package ejercicios_parte_dos;

public class Libro {

	String titulo;
	String autor;
	int nEjemplares;
	int ejemPrestados;
	genero generoLibro;
	
	public enum genero {
		Narrativo,
		Lirico,
		Dramatico,
		Didactico,
		Poetico
	}
	
	//Constructores 
	
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public Libro(String titulo, String autor, int nEjemplares, int ejemPrestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nEjemplares = nEjemplares;
		this.ejemPrestados = ejemPrestados;
	}
	
	public Libro(String titulo, String autor, int nEjemplares, int ejemPrestados, genero generoLibro) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nEjemplares = nEjemplares;
		this.ejemPrestados = ejemPrestados;
		this.generoLibro = generoLibro;
	}
	
	
	
	
}
