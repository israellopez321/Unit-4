package examenPrueba;

import java.util.Objects;

/**
 * Clase Vehiculo 
 */
public class Vehiculo {
	
	private String matricula;
	private String modelo;
	private double precioBasePorDia;
	private double porcRecargo;
	private static double precioSeguroDiario;
	private int diaAlquilados;
	
	/**
	 * Constructor inicial
	 * @param matricula
	 * @param modelo
	 * @param precioBasePorDia
	 * @param porcRecargo
	 * @param precioSeguroDiario
	 */
	public Vehiculo(String matricula, String modelo, double precioBasePorDia, double porcRecargo,
			double precioSeguroDiario) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.precioBasePorDia = precioBasePorDia;
		this.porcRecargo = porcRecargo;
		this.precioSeguroDiario = precioSeguroDiario;
		this.diaAlquilados = diaAlquilados;
	}
	
	public Vehiculo(String matricula, String modelo, double precioBasePorDia,
            double porcentajeRecargoPremium, int diasAlquilados) {

		this.matricula = matricula;
		this.modelo = modelo;
		this.precioBasePorDia = precioBasePorDia;
		this.porcRecargo = porcentajeRecargoPremium;
		this.diaAlquilados = diasAlquilados;
	}

	//Getter y setters
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecioBasePorDia() {
		return precioBasePorDia;
	}

	public void setPrecioBasePorDia(double precioBasePorDia) {
		this.precioBasePorDia = precioBasePorDia;
	}

	public double getPorcRecargo() {
		return porcRecargo;
	}

	public void setPorcRecargo(double porcRecargo) {
		this.porcRecargo = porcRecargo;
	}

	public double getPrecioSeguroDiario() {
		return precioSeguroDiario;
	}

	public static void setPrecioSeguroDiario(double precio) {
	    precioSeguroDiario = precio;
	}

	public int getDiaAlquilados() {
		return diaAlquilados;
	}

	public void setDiaAlquilados(int diaAlquilados) {
		if (diaAlquilados <= 0) {
			this.diaAlquilados = diaAlquilados;
		} else {
			System.out.println("Introduzca un valor positivo");
		}
	}
	
	/**
	 * Funcion que calculan el Recargo Premium de un objeto
	 * @return Recargo Premium
	 */
	public double calcularRecargoPremium(){
		
		double recargoPremium = 0;
		
		recargoPremium = precioBasePorDia * porcRecargo / 100;
		
		return recargoPremium;
	}
	
	public double calcularImporteTotal() {
		
		double importeTotal = 0;
		
		importeTotal = diaAlquilados * precioSeguroDiario;
		
		return importeTotal;
	}
	
	public double calcularIngresoTotal() {		
		
		return precioBasePorDia * diaAlquilados + calcularRecargoPremium() + precioSeguroDiario;
		
	}

	@Override
	public String toString() {
		return matricula + " - " + modelo + " | Precio Base/Dia: " + precioBasePorDia
				+ "| Recargo Premium: " + calcularRecargoPremium() + " | Días Alquilado: " + diaAlquilados + " | Total Generado: "
				+ calcularIngresoTotal();
	}
	
	
	public boolean esRecargoAlto() {
		
		return porcRecargo > 12;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	
	
	
	
}
