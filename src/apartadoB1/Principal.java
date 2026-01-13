package apartadoB1;

public class Principal {

public static void main(String[] args) {
		
		Punto puntoN1 = new Punto(5,0);
		
		
		System.out.println("El punto uno se ubica en (" + puntoN1.x + "," + puntoN1.y + ")");
		
		Punto puntoN2 = new Punto(10,10);
		
		puntoN2.x = 10;
		puntoN2.y = 10;
		
		System.out.println("El punto dos se ubica en (" + puntoN2.x + "," + puntoN2.y + ")");
		
		Punto puntoN3 = new Punto(-3,7);
		
		puntoN3.x = -3;
		puntoN3.y = 7;
		
		System.out.println("El punto tres se ubica en (" + puntoN3.x + "," + puntoN3.y + ")");
		
		puntoN1.x += 2;
		puntoN1.y *= 3;
		
		puntoN2.x -= 1;
		puntoN2.y /= 2;
		
		puntoN3.x *= 3.5;
		puntoN3.y /= 7;
		
		System.out.println("El punto uno se ubica en (" + puntoN1.x + "," + puntoN1.y + ")");
		
		System.out.println("El punto dos se ubica en (" + puntoN2.x + "," + puntoN2.y + ")");
		
		System.out.println("El punto tres se ubica en (" + puntoN3.x + "," + puntoN3.y + ")");
		
		
	}
}
