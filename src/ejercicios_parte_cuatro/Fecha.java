package ejercicios_parte_cuatro;

public class Fecha {
	
	private int dia;
	private int mes;
	private int ano;
	
	//Constructores
	public Fecha(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	
	//Getter y setter
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia >= 0 && dia <= 31) {
			this.dia = dia;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes >= 0 && mes <= 12) {
			this.mes = mes;
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
