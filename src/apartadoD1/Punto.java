package apartadoD1;

import java.util.Scanner;

public class Punto {
	
	Scanner sc = new Scanner (System.in);
	
	private int x;
	private int y;
	
	
	Punto (int x, int y){
		
		this.x = x;
		this.y = y;
			
	}
	/**
	 * Cambio de valores de coordenadas
	 * @param valor coordenada x
	 * @param valor coordenada y
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * Desplazamiento de los punto x e y
	 * @param desplazamiento dx
	 * @param desplazamiento dy
	 */
	public void desplaza(int   dx,   int   dy) {
		this.x = x + dx;
		this.y = y + dy;
	}
	/**
	 * Calcular distancia entre un punto dado y el punto ya puesto
	 * @param Otro punto p
	 * @return distancia entro los dos puntos
	 */
	public double distancia(Punto p) {
		double resultado;
		
		resultado = p.x - this.x;
		
		return resultado;
	}
	/**
	 * Devolver cadena coordenadas
	 */
	public String toString() {
		
		String coordenadas;
		
		coordenadas = "(" + this.x + ", " + this.y + ")";
		
		return coordenadas;
		
	}
	
	public int getX() {
		return x;
	}
	public void setX (int x) {
		this.x = x;
	}
	
	
	
	public int getY() {
		return y;
	}
	public void setY (int y) {
		this.y = y;
	}
	
	
}
