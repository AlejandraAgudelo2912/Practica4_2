package Practica5;

public class Ejercicio13 {

	    public static void main(String[] arvs) {
	    	
	    	System.out.println("Inicio del programa.\n");
	    	
	    	int dia = 29;
	    	int mes =02;
	    	int anio=2023;
	    	
	    	boolean valido=fechaValida(dia,mes,anio);
	    	System.out.print("Fecha: "+dia+"/"+mes+"/"+anio+"\nValidez ----> ");
			if(valido) {
				System.out.print("la fecha es válida.");
			}else {
				System.out.print("nula.");
			
			}
	       
	    	System.out.println("\n\nFin del programa.");

	    }

	    public static boolean fechaValida(int dia, int mes, int anio) {
	    	
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
	        if(anio<0) {
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
