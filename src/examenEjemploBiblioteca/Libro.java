package examenEjemploBiblioteca;

/**
 * Libros de una biblioteca para identificar
 */
public class Libro {

	public enum estado {
		disponible, prestado
	}
	
	private int codigo;
	private String titulo;
	private int stock;
	private String autor;
	private String genero;
	private estado estado;
	
	
	/**
	 * Constructor de Libros
	 * @param codigo
	 * @param titulo
	 * @param stock
	 * @param autor
	 * @param genero
	 * @param estado
	 */
	public Libro(int codigo, String titulo, int stock, String autor, String genero, estado estado ) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.stock = stock;
		this.autor = autor;
		this.genero = genero;
		this.estado = disponible;
	}

	
	//Getters y setters
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public estado getEstado() {
		return estado;
	}
	public void setEstado(estado estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	

}
