package Supuesto4_1;

import java.util.Scanner;

public class Supuesto4_1 {
public static Scanner teclado = new Scanner (System.in);
public static final int n=2;
	
	public static void main (String []arvs) {
		System.out.println("\nInicio del programa");
		Usuario []array;
		do {
			array = pedirUsuario(n);
			if (!ComprobarUsuario(array)) {	
				System.out.println("ERROR: Alguno de los valores introducidos no es valido. Vuelva a introducir los datos.");
			}
			
		}while(!ComprobarUsuario(array)) ;
		
		System.out.println("\nSelecciona un usuario\n-----------------");

		
		for (int i =0; i<array.length;i++) {
			System.out.println((i+1)+"- "+array[i].getApellidos()+" , "+array[i].getNombre());
		}
		
		int a =0;
		try {
					
			 a= pedirInt("Selecciona: ");		 
			 mostrarUsuario(array, (a-1));
		
		}catch(Exception e) {
			System.out.println("ERROR: Usuario no encontrado.");
		}
		
		
		System.out.println("\nFin del programa");

	}
	
	public static Usuario[] pedirUsuario(int n) {
		
		Usuario[] usuario = new Usuario[n];
		
		for (int i =0; i<usuario.length; i++) {
			
			System.out.print("\n"+(i+1)+"º Usuario\n---------\nIntroduce nombre: ");
			String nombre= teclado.nextLine();
			
			
			System.out.print("Introduce apellidos: ");
			String apellidos= teclado.nextLine();
			
			
			System.out.print("Introduce email: ");
			String email= teclado.nextLine();
			Usuario user= new Usuario(nombre,apellidos,email);
			
			usuario[i]=user;
			

		}
		
		String []apellidos= new String [n];
		for (int i=0; i<apellidos.length;i++) {
			apellidos[i]=usuario[i].getApellidos();
		}
		
		for (int i =1; i<apellidos.length-1;i++) {
			for (int j =0; j<apellidos.length-i;j++) {
				if ((apellidos[j].trim().compareToIgnoreCase(apellidos[j+1].trim()))>0){
					String aux = apellidos[j];
					apellidos[j]=apellidos[j+1];					
					apellidos[j+1]=aux;
				}
			}
		}
		/*
			for (int i =1; i<array.length-1;i++) {
				for (int j =0; j<array.length-i;j++) {
					if ((array[j].trim().compareToIgnoreCase(array[j+1].trim()))>0){
						String aux = array[j];
						array[j]=array[j+1];
						array[j+1]=aux;
					}
				}
			}*/
		
		for (int i =0; i<apellidos.length; i++) {
			System.out.println((i+1)+"º : "+apellidos[i]);
		}
		for (int i =0; i<apellidos.length;i++) {
			for (int j =0; j<apellidos.length;j++) {
				if (apellidos[i].equals(usuario[j].getApellidos())) {
					usuario[i].setNombre(usuario[j].getNombre());
					usuario[i].setApellidos(usuario[j].getApellidos());
					usuario[i].setEmail(usuario[j].getEmail());
				}
			}
			
		}
		
		return usuario;
	}
	
	public static void mostrarUsuario(Usuario[]usuario,int n) {
		System.out.println("\nUsuario\n----------\nNombre: "+usuario[n].getNombre()+"\nApellidos: "+usuario[n].getApellidos()+"\nEmail: "+usuario[n].getEmail());
		
	

	}
	public static int pedirInt(String texto) {
		int n =0;
		boolean valido= false;
		while(!valido) {
			try {
				System.out.print(texto);
				n=Integer.parseInt(teclado.nextLine());
				valido=true;
			}catch(Exception e) {
				System.out.println("ERROR: Introduzca numeros");
			}
		}
		return n;
	}
	public static boolean ComprobarUsuario(Usuario[]usuario) {
		for (int i =0; i<usuario.length;) {
			if(usuario[i].getNombre()==null||usuario[i].getApellidos()==null||usuario[i].getEmail()==null) {
				return false;
				
			}else {
				return true;
			}
		}
		return false;
	
	}
}

