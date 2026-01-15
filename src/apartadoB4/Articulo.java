package apartadoB4;

public class Articulo {
	String nombre = "Sin nombre";
	double precioBruto;
	double iva;
	int stock;
	
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
}
