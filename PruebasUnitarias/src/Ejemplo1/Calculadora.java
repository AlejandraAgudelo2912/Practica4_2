package Ejemplo1;

public class Calculadora {
	public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }
    public boolean Espar (int num) {
    	if (num%2==0) {
    		return true;
    	}else {
    		return false;
    	}
    	 
    }
    public boolean EsImpar (int num) {
    	if (num%2==1) {
    		return true;
    	}else {
    		return false;
    	}
    	 
    }
}
