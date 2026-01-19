package ejemplo1;

public class FuncionesRecursivas {

	public static void main(String[] args) {
		
		System.out.println(sumatorio(5));
		
	}
	
	public static int sumatorio(int n) {
		int resultado;
		
		if (n==1) {
			resultado = 1;
		} else{
		resultado = n + sumatorio(n-1);
		}
		
		return resultado;
	}
}


