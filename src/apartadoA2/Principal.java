package apartadoA2;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		//Creamos escaner
		Scanner sc = new Scanner(System.in);
		
		//Primer usuario
		
		Persona persona1 = new Persona();
		
		System.out.println("Primer Usuario");
		
		System.out.println();
		
		// Pedir DNI
		System.out.print("Introduzca su DNI: ");
		persona1.dni = sc.next();
		
		// Pedir nombre
		System.out.print("Introduzca su nombre: ");
		persona1.nombre = sc.next();
		
		// Pedir apellidos
		System.out.print("Introduca sus apellidos: ");
		persona1.apellidos = sc.next();
		
		// Pedir edad
		System.out.print("Introduca su edad: ");
		persona1.edad = sc.nextInt();
		
		// Segundo usuario
		
		Persona persona2 = new Persona();
		
		System.out.println("Segundo Usuario");
		
		System.out.println();
		
		// Pedir DNI
		System.out.print("Introduzca su DNI: ");
		persona2.dni = sc.next();
		
		// Pedir nombre
		System.out.print("Introduzca su nombre: ");
		persona2.nombre = sc.next();
		
		// Pedir apellidos
		System.out.print("Introduca sus apellidos: ");
		persona2.apellidos = sc.next();
		
		// Pedir edad
		System.out.print("Introduca su edad: ");
		persona2.edad = sc.nextInt();
		
		// Mostramos los datos de los dos usuarios
		
		String mayorEdad = (persona1.edad >= 18) ? " es mayor de edad" : "no es mayor de edad" ;
		
		System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + mayorEdad);
		
		mayorEdad = (persona2.edad >= 18) ? " es mayor de edad" : " no es mayor de edad" ;
		
		System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + mayorEdad);
		
		sc.close();
	}
}
