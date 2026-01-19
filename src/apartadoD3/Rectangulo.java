package apartadoD3;

public class Rectangulo {

	int x1 ;
	int x2;
	int y1;
	int y2;
	
	Rectangulo (int x1, int x2, int y1, int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		
	}
	/**
	 * Cambiar datos X1Y1
	 * @param x1
	 * @param y1
	 */
	public void setX1Y1(int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
	}
	/**
	 * Cambiar datos X2Y2
	 * @param x2
	 * @param y2
	 */
	public void setX2Y2(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}
	/**
	 * Cambiar todos los datos
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public void setAll(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public double getPerimetro() {
		
		//Calculo anchura y altura
		int anchura = this.x2 - this.x1;
		int altura = this.y2 - this.y1;
		
		double perimetro = 2 * (anchura + altura);
		
		return perimetro;	
	}
	
	public double getArea() {
		
		int anchura = this.x2 - this.x1;
		int altura = this.y2 - this.y1;
		
		double area = anchura * altura;
		
		return area;	
	}
	
	public String toString() {
		
	}
	
	//Setting y getting
	
	public void setX1 (int x1) {
		if (x1 < x2) {
			this.x1 = x1;
		}
	}
	
	public void setX2 (int x2) {
		if (x1 < x2) {
			this.x2 = x2;
		}
	}
	
	public void setY1 (int y1) {
		if (y1 < y2) {
			this.y1 = y1;
		}
	}
	
	public void setY2 (int y2) {
		if (y1 < y2) {
			this.y2 = y2;
		}
	}
	
	public int getX1() {
		return x1;
	}
	
	public int getX2() {
		return x2;
	}
	
	public int getY1() {
		return y1;
	}
	
	public int getY2() {
		return y2;
	}
	
}
