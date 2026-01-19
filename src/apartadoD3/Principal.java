package apartadoD3;


public class Principal {
	
	public static void main(String[] args) {
		
		Rectangulo rectangulo1 = new Rectangulo(0, 0, 5, 5);
		
		Rectangulo rectangulo2 = new Rectangulo(7, 9, 2 ,3);
		
		mostrar(rectangulo1);
		
		mostrar(rectangulo2);
		
		rectangulo1.setX1Y1(4, 2);
		
		mostrar(rectangulo1);
		
	}
	/**
	 * 
	 * @param rectangulo
	 */
	public static void mostrar(Rectangulo rectangulo) {
		
		//Calculo anchura y altura
		int anchura = rectangulo.getX2() - rectangulo.getX1();
		int altura = rectangulo.getY2() - rectangulo.getY1();
		
		//Calculo perimetro y area
		int perimetro = 2 * (anchura + altura);
		double area = anchura * altura;
		
		System.out.println("Las coordenadas del rectángulo son (" + rectangulo.getX1() + "," + rectangulo.getY1() + ")(" + rectangulo.getX2() + "," + rectangulo.getY2() + ").");
		
		System.out.println("El perimetro es " + perimetro);
		System.out.println("El área es " + area);
		
		
	}
}
