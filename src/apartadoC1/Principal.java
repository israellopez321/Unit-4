package apartadoC1;

public class Principal {
	
	public static void main(String[] args) {

		Punto puntoN1 = new Punto(5,0);
		
		ubicar(puntoN1);
		
		Punto puntoN2 = new Punto(10,10);
		
		ubicar(puntoN2);
		
		Punto puntoN3 = new Punto(-3,7);

		ubicar(puntoN3);
		
		puntoN1.setX(puntoN1.getX() * 2);
		puntoN1.setY(puntoN1.getY() + 7 );
		
		ubicar(puntoN1);

	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	static void ubicar(Punto puntos) {
		
		System.out.println("El punto se ubica en (" + puntos.getX() + "," + puntos.getY() + ")");
		
	}
	
}
