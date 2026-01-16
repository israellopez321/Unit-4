package apartadoC4;

public class Articulo {
	
	private String nombre = "Sin nombre";
	private double precioBruto;
	private double iva;
	private int stock;
	
	Articulo (String nombre, double precioBruto, double iva, int stock){
		
		
		
		if (!nombre.isBlank()) {
		this.nombre = nombre;
		}
		
		if (precioBruto > 0) {
		this.precioBruto = precioBruto;
		}
		
		if (iva >= 0 && iva < 100) {
			this.iva = iva;	
		}
		
		if (stock >= 0) {
			this.stock = stock;	
		}
		
		
	}
	
	public void setNombre(String nombre) {
		if (!nombre.isBlank() ) {
			this.nombre = nombre.trim();
		}
	}
	
	public void setPrecio (double precioBruto) {
		if (precioBruto > 0) {
			this.precioBruto = precioBruto;
		}
	}
	
	public void setIva (int iva) {
		if (iva >= 0 && iva < 100) {
			this.iva = iva;
		}
	}
	
	public void setStock (int stock) {
		if (stock > 0) {
			this.stock = stock;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precioBruto;
	}
	
	public double getIva() {
		return iva;
	}
	
	public int getStock() {
		return stock;
	}
	
	
}
