package apartadoD2;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	
	/**
	 * Si la persona es mayor de edad sera verdadero
	 * @return Devuelve true si es mayor de edad
	 */
	public boolean esMayorEdad() {
		boolean mayor;
		if (this.edad >= 18 ) {
			mayor = true;
		} else {
			mayor = false;
		}
		return mayor;
	}
	/**
	 * Saber si la persona esta juvilado
	 * @return Devuelve true si tiene 65 años o más (false si no)
	 */
	public boolean esJubilado() {
		boolean jubilado;
		if (this.edad >= 65 ) {
			jubilado = true;
		} else {
			jubilado = false;
		}
		
		return jubilado;
	}
	
	/**
	 * Diferencia de edad
	 * @param p
	 * @return Devuelve la diferencia de edad entre ‘this’ y p.
	 */
	public int diferenciaEdad(Persona p) {
		int diferencia;
		
		if (this.edad > p.edad) {
			diferencia = this.edad - p.edad;
		} else {
			diferencia = p.edad - this.edad;
		}
		
		return diferencia;
	}
	
	public String toString() {
		String datos;
		
		datos = "DNI: " + this.dni + ", Nombre: " + this.nombre + ", Apellidos: " + this.apellidos + ", Edad: " + this.edad;
		
		return datos;
	}
	
	// Asignar get y set a Dni
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (dni != null || dni.length() == 9) {
			this.dni = dni;
		}

	}
	
	// Asignar get y set a Nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null) {
			this.nombre = nombre;
		}
	}

	// Asignar get y set a Apellidos
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		if (apellidos != null) {
			this.apellidos = apellidos;
		}
	}
	
	// Asignar get y set a Edad
	public int getEdad() {
		return edad;
	}
	
	public void setEdad (int edad) {
		if (edad > 0 && edad <= 110) {
			this.edad = edad;
		}
			
	}

	Persona(String dni, String nombre, String apellidos, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;

	}
	
	Persona (){
		
	}

}
