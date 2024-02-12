package Ejemplo1;

public class Coordinante {
	private double x;
	private double y;
	public Coordinante (double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public void setX(double x) {
		if (x<=10&&x>=-10) {
			 this.x=x;
		}
	}
	public void setY(double y) {
		if (x<=10&&x>=-10) {
			 this.y=y;

		}
	}
	public double distanciaAlCentro() {
		return Math.sqrt(Math.pow(0-this.x,2)+Math.pow(this.y, 2));
	}
	
	public double distancia(Coordinante b) {
		return Math.sqrt(Math.pow(b.getX()-this.x, 2)+Math.pow(b.getY()-this.y, 2));
	}
}
