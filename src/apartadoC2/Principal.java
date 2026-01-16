package apartadoC2;

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
				
				String mayorEdad = (persona1.getEdad() >= 18) ? " es mayor de edad" : " no es mayor de edad" ;
				
				System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " con DNI " + persona1.getDni() + mayorEdad);
				
				mayorEdad = (persona2.getEdad() >= 18) ? " es mayor de edad" : " no es mayor de edad" ;
				
				System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " con DNI " + persona2.getDni() + mayorEdad);
				
				sc.close();
			
		
	}
}
