package ejemplo1;

public class Persona {
	
	Persona (String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	Persona (String nombre) {
		this.nombre = nombre;
	}
	
	Persona (String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	Persona (){
		
	}
	
	
	String nombre = "Sin nombre";
	int edad; // Por defecto, los numeros se inicializan en 0
	double estatura = 0.30;
	String genero; // Se inicializa en null
	boolean carnet = false;  
	
}
