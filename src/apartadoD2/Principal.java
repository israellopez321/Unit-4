package apartadoD2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Creamos escaner
		Scanner sc = new Scanner(System.in);
		
		
		//Primer usuario
		
		System.out.println("Primer Usuario");
		
		System.out.println();
		
		// Pedir DNI
		System.out.print("Introduzca su DNI: ");
		 String dni = sc.next();
		
		// Pedir nombre
		System.out.print("Introduzca su nombre: ");
		String nombre = sc.next();
		
		// Pedir apellidos
		System.out.print("Introduca sus apellidos: ");
		String apellidos = sc.next();
		
		// Pedir edad
		System.out.print("Introduca su edad: ");
		int edad = sc.nextInt();
		
		Persona persona1 = new Persona(dni, nombre, apellidos, edad);
		
		// Segundo usuario
		
		System.out.println("Segundo Usuario");
		
		System.out.println();
		
		// Pedir DNI
		System.out.print("Introduzca su DNI: ");
		dni = sc.next();
		
		// Pedir nombre
		System.out.print("Introduzca su nombre: ");
		nombre = sc.next();
		
		// Pedir apellidos
		System.out.print("Introduca sus apellidos: ");
		apellidos = sc.next();
		
		// Pedir edad
		System.out.print("Introduca su edad: ");
		edad = sc.nextInt();
		
		Persona persona2 = new Persona(dni, nombre , apellidos, edad);
		
		// Mostramos los datos de los dos usuarios
		
		boolean mayorEdad = persona1.esMayorEdad();
		
		System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " con DNI " + persona1.getDni() + "mayor de edad: " + mayorEdad);
		
		mayorEdad = persona2.esMayorEdad();
		
		System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " con DNI " + persona2.getDni() + "mayor de edad: " + mayorEdad);
		
		boolean jubilado = persona1.esJubilado();
		
		System.out.println("Esta juvidalado " + persona1.getNombre() + ": " + jubilado);
		
		int diferenciaEdad = persona1.diferenciaEdad(persona2);
		
		System.out.println("La diferencia de edad es de " + diferenciaEdad + " años");
		
		String datos = persona1.toString();
		
		System.out.println(datos);
		 
		sc.close();
	}
	
}
