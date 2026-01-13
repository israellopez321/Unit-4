package ejemplo1;

public class PrincipalPersona {
	
	public static void main(String[] args) {
		Persona daniel = new Persona("Claudia", 8, 1.20);
		
		System.out.println(daniel);
		
		System.out.println(daniel.nombre);
		daniel.nombre = "Daniel";
		System.out.println(daniel.nombre);
		System.out.println(daniel.edad);
		System.out.println(daniel.estatura);
		System.out.println(daniel.carnet);
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = p1;
		
		
	}
}
