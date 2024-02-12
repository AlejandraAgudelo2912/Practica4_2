package Ejercicio04;

public class Punto {

	public double x;
	public double y;
	
	public Punto() {
		
	}
	
	public Punto(double x, double y) {
		setX(x);
		setY(y);
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setX(double x) {
			this.x=x;
		
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setY(double y) {
			this.y=y;
		
	}
	
	public static String cuadrante (double x,double y) {
		if (x ==0.0&&y==0.0) {			
				return "El punto se encuentra en el eje de coordenadas.";						
		}else if (y==0&&x!=0) {
			if (x>0) {
				return "El punto se encuentra entre el primer cuadrate y el cuarto cuandrante";
			}else if (x<0){
				
				return "El punto se encuentra entre el segundo cuadrante y el tercer cuadrante";				
		}
		
		}else if (x==0&&y!=0){
		if(y<0) {
			
			return "El punto se encuentra entre el tercer cuadrate y el cuarto cuandrante";

			}else if (y>0){
				return "El punto se encuentra entre el primer cuadrate y el segundo cuandrante";

			}
			
		}else {
			if(x<0&&y>0) {
				return "El punto se encuentra en el segundo cuadrante";			

			}else if (x>0&&y>0) {
			
				return "El punto se encuentra en el primer cuadrante";			
		}else if (x<0&&y<0){
			return "El punto se encuentra en el tercer cuadrante";			

		}else if (x>0&&y<0) {
			return "El punto se encuentra en el cuarto cuadrante";			

		}
		
		}
		return "";
	}
}
	


