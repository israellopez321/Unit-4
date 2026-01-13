package apartadoB4;

public class Principal {
	
public static void main(String[] args) {
		
		//Declaramos el artículo 1 
		Articulo articulo1 = new Articulo("Pijama", 10, 0.21, 12);
		
		//Calculamos su precio total 
		double precioNeto = articulo1.precioBruto + (articulo1.precioBruto * articulo1.iva);
		
		//Mostramos el resultado
		System.out.println("Pijama -- Precio: " + articulo1.precioBruto + "€ - IVA: " + articulo1.iva + " - PVP: " + precioNeto + "€");
		
		articulo1.precioBruto = 17;
		
		//Calculamos su precio total 
		precioNeto = articulo1.precioBruto + (articulo1.precioBruto * articulo1.iva);
		
		//Mostramos el resultado
		System.out.println("Pijama -- Precio: " + articulo1.precioBruto + "€ - IVA: " + articulo1.iva + " - PVP: " + precioNeto + "€");
		
		
	}
}
