package apartadoB3;

public class Principal {
	
	public static void main(String[] args) {
		
		Rectangulo rectangulo1 = new Rectangulo(0, 0, 5, 5);
		
		System.out.println("Las coordenadas del rectángulo son (" + rectangulo1.x1 + "," + rectangulo1.y2 + ")(" + rectangulo1.x2 + "," + rectangulo1.y2 + ").");
		
		int anchura = rectangulo1.x2 - rectangulo1.x1;
		int altura = rectangulo1.y2 - rectangulo1.y1;
		
		int perimetro = 2 * (anchura + altura);
		int area = anchura * altura;
		
		System.out.println("El perimetro es " + perimetro);
		System.out.println("El área es " + area);
		
		
		Rectangulo rectangulo2 = new Rectangulo(7, 9, 2 ,3);
		
		System.out.println("Las coordenadas del rectángulo son (" + rectangulo2.x1 + "," + rectangulo2.y2 + ")(" + rectangulo2.x2 + "," + rectangulo2.y2 + ").");
		
		 anchura = rectangulo2.x2 - rectangulo2.x1;
		 altura = rectangulo2.y2 - rectangulo2.y1;
		
		 perimetro = 2 * (anchura + altura);
		 area = anchura * altura;
		
		System.out.println("El perimetro es " + perimetro);
		System.out.println("El área es " + area);
		
	}
}
