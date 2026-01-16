package apartadoC2;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;

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
