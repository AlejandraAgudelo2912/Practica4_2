package Practica5;

public class Ejercicio14 {
	public static void main (String []arvs) {
		System.out.println("Inicio del programa.\n");
		
		String fecha ="29/02/2023";
		boolean valido=fechaValida(fecha);
    	System.out.print("Fecha: "+fecha+"\nValidez ----> ");
    	
		if(valido) {
			System.out.print("la fecha es válida.\n");
		}else {
			System.out.print("nula.\n");
		
		}
		System.out.println("\nFin del programa.\n");

	}

	public static boolean fechaValida(String fecha) {
		    	
		String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";

		boolean resultado = fecha.matches(regex);
		if (!resultado) {
			return false;
		}
		String[] partes = fecha.split("/");
		int dia = Integer.parseInt(partes[0]);
		int mes = Integer.parseInt(partes[1]);
		int anio = Integer.parseInt(partes[2]);

		boolean bi=false;
		if ((anio%4==0&&anio%100!=0) || (anio%400==0)) {
			bi=true;
		}
		if(dia<1||dia>31) {
			return false;
		}

		if (mes<1 || mes>12) {
			return false;
		}
		if (anio<1) {
			return false;
			
		}
		if (mes==2) {
			if (bi && dia == 29) {
				return true;
			} else if (dia <= 28) {
				return true;
			}else {
				return false;
			}
		}

		if (mes==7 || mes==8 ||mes==10 || mes== 1||mes==3||mes==5||mes==12) {
			if(dia<=31) {
				return true;
			}
		        	
		           
		}else {
			if(dia<=30) {
				return true;
			}
		}
		return false;

	}
}
