package Practica5;


public class Ejercicio08 {
	 public static void main(String[] arvs) {
		 	System.out.println("Inicio del programa.\n");
		 	
	        String texto = "http://www.devbg.org/forum/index.php";
	        String regex ="://|/"; 
	        String[] array = separarURL(texto,regex);
	        
	        for (int i =0; i<array.length;i++) {
	        	System.out.println("Resultado "+(i+1)+": "+array[i]);
	        }
			System.out.println("\nFin del programa.");


	    }
	    
	    public static String[] separarURL(String texto, String regex) {
	        String[] array = texto.split(regex,3);
	        if(array.length==3) {
	        	array[2]="/"+array[2];
	        }
	        /*Pattern patron =Pattern.compile(regex);
	        Matcher con = patron.matcher(texto);
	        
	        if (con.find()) {
	            array[0] = con.group(1);
	            array[1] = con.group(2); 
	            array[2] = con.group(3); 
	        }*/
	        
	        return array;
	    }
	   
		
		
}
