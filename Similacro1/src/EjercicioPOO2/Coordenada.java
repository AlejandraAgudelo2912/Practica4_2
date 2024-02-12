package EjercicioPOO2;

public class Coordenada {
	private double x;
	private double y;

public double getX() {
	return x;
}

public void setX(double x) {
	this.x=x;
}
public double gety() {
	return y;
}

public void sety(double y) {
	this.y=y;
}

public Coordenada() {
	
}

public Coordenada(double x, double y){
	this.x=x;
	this.y=y;

}
public double distancia (Coordenada b) {
	return Math.sqrt(Math.pow(b.getX()-this.x,2)+Math.pow(b.gety()-this.y,2));
}
public String toString () {
	return "("+this.x+" , "+this.y+")";
}
}