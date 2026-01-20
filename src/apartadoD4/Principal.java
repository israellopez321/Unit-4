package apartadoD4;

public class Principal {
	
public static void main(String[] args) {
		
		//Declaramos el artículo 1 
		Articulo articulo1 = new Articulo("Pijama", 10, 21, 12);
		Articulo articulo2 = new Articulo("", -20, 210, -5);
		
		mostrar(articulo1);
		mostrar(articulo2);
		
		articulo1.setPrecio(-15.0);
		
		mostrar(articulo1);
		
		double precioConIva = articulo1.getPVP();
		
		System.out.println("El precio con IVA includio seria de " + precioConIva + "€");
		
		double precioConDescuento = articulo1.getPVPDescuento(10);
		
		System.out.println("El precio con descuento seria de " + precioConDescuento + "€");
		
		boolean esPosibleVender = articulo1.vender(3);
		
		if (esPosibleVender == true) {
			System.out.println("Es posible vender el articulo");
		} else {
			System.out.println("No es posible vender el articulo");
		}
		
		System.out.println(articulo1.toString());
		
		articulo1.almacenar(7);
		
		System.out.println(articulo1.toString());
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


