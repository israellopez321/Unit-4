package apartadoD1;

public class Principal {
	
	public static void main(String[] args) {
		
		double distancia;
		String ubicacion;
		
		Punto puntoN1 = new Punto(5,0);
		
		ubicar(puntoN1);
		
		Punto puntoN2 = new Punto(10,10);
		
		ubicar(puntoN2);
		
		Punto puntoN3 = new Punto(-3,7);

		ubicar(puntoN3);
		
		puntoN1.setX(puntoN1.getX() * 2);
		puntoN1.setY(puntoN1.getY() + 7 );
		
		ubicar(puntoN1);
		
		puntoN1.setXY(4,6);
		
		ubicar(puntoN1);
		
		puntoN1.desplaza(7, 2);
		
		ubicar(puntoN1);
		
		distancia = puntoN1.distancia(puntoN3);
		
		System.out.println(distancia);
		
		ubicacion = puntoN1.toString();
		
		System.out.println(ubicacion);
		
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

