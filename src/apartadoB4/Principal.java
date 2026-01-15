package apartadoB4;

public class Principal {
	
public static void main(String[] args) {
		
		//Declaramos el artículo 1 
		Articulo articulo1 = new Articulo("Pijama", 10, 0.21, 12);
		Articulo articulo2 = new Articulo("", -20, 210, -5);
		
		mostrar(articulo1);
		mostrar(articulo2);
		
		
	}
	/**
	 * 
	 * @param articulo
	 */
	static void mostrar(Articulo articulo) {
		
		double precioNeto = articulo.precioBruto + (articulo.precioBruto * articulo.iva);
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println(articulo.nombre + " | Precio : " + articulo.precioBruto + "€ | IVA: " + articulo.iva + "% | PVP: " + precioNeto + "€ | Stock: " + articulo.stock);
		System.out.println("--------------------------------------------------------------------------------");
	}
}
