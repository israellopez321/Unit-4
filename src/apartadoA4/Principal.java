package apartadoA4;

public class Principal {
	
	public static void main(String[] args) {
		
		//Declaramos el artículo 1 
		Articulo articulo1 = new Articulo();
		
		//Definimos las variables del articulo 1 
		articulo1.nombre = "Pijama";
		
		articulo1.precioBruto = 10;
		
		articulo1.stock = 12;
		
		//Calculamos su precio total 
		double precioNeto = articulo1.precioBruto + (articulo1.precioBruto * articulo1.IVA);
		
		//Mostramos el resultado
		System.out.println("Pijama -- Precio: " + articulo1.precioBruto + "€ - IVA: " + articulo1.IVA + " - PVP: " + precioNeto + "€");
		
		articulo1.precioBruto = 17;
		
		//Calculamos su precio total 
		precioNeto = articulo1.precioBruto + (articulo1.precioBruto * articulo1.IVA);
		
		//Mostramos el resultado
		System.out.println("Pijama -- Precio: " + articulo1.precioBruto + "€ - IVA: " + articulo1.IVA + " - PVP: " + precioNeto + "€");
		
		
	}
	
	
}
