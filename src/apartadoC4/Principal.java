package apartadoC4;

public class Principal {

public static void main(String[] args) {
		
		//Declaramos el artículo 1 
		Articulo articulo1 = new Articulo("Pijama", 10, 0.21, 12);
		Articulo articulo2 = new Articulo("", -20, 210, -5);
		
		mostrar(articulo1);
		mostrar(articulo2);
		
		articulo1.setPrecio(-15.0);
		
		mostrar(articulo1);
	}
	/**
	 * 
	 * @param articulo
	 */
	static void mostrar(Articulo articulo) {
		
		double precioNeto = articulo.getPrecio() + (articulo.getPrecio() * articulo.getIva());
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println(articulo.getNombre() + " | Precio : " + articulo.getPrecio() + "€ | IVA: " + articulo.getIva() + "% | PVP: " + precioNeto + "€ | Stock: " + articulo.getStock());
		System.out.println("--------------------------------------------------------------------------------");
	}
	
}
