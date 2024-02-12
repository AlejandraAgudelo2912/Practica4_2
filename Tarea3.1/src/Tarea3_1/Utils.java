package Tarea3_1;

public class Utils {

		public static String tipoTriangulo(int a, int b, int c){
			if (!esTriangulo( a, b, c)) {
				return "ERROR";
			}
			if (a==b && b==c ){
	            return "Equilátero";
	        }else if (a!=b && b!=c && a!=c){
	            return "Escaleno";
	        }else{
	            return "Isósceles";
	        }
		
		}

	    public static boolean esTriangulo(int a, int b, int c){
	        
	        if (a+b<=c || a+c<=b || b+c<=a || a<=0 || b<=0 || c<=0){
	            return false;  
	        }
	        return true;
	        
	    }
	   
	    public static int masFrecuenteInt(int n[]) {

	        int frecuencia=0;
	        int nMasfrecuente =n[0];
	        
	        for (int i=0; i<n.length; i++) {
	            int s=1;
	        
	            for (int j=i+1; j<n.length; j++) {
	                if (n[i] == n[j]) {
	                    s++;
	                }
	            }
	        
	            if (s>frecuencia) {
	                frecuencia=s;
	                nMasfrecuente=n[i];
	            }
	        }
	        
	        return nMasfrecuente;
	    }

	    public static int buscarInt (int []vector, int num ){

            for (int i =0; i <vector.length; i++){
                if (vector[i]==num ){
                    return i ;
                } 
            }
            return -1;   
	    }
}
