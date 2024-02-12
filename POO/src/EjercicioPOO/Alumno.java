package EjercicioPOO;

public class Alumno {

	private String nombre ;
	private String apellidos ;
	private String nre ;
	private String email ;
	private String direccion ;
	
	public String getNombre() {
		
		return nombre;
	}
	public void setNombre(String nombre) {
		if (nombre.trim().length()>0) {
			this.nombre=nombre;
	
		}
		
	}
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	
	public String getNre() {	
		return nre;
	}
	
	public void setNre(String nre) {
		if (nombre.trim().length()>0) {
			this.nre=nre;
		}		
	}
	
	public String getEmail() {		
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getDireccion() {		
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	
	//constructor
	
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre, String apellidos, String nre, String email, String direccion){
		setNombre(nombre);
		setApellidos(apellidos);
		setNre(nre);
		setEmail(email);
		setDireccion(direccion);
	}
	
	
	public String info() {
		String info1 = nombre + " "+ apellidos;
		info1+="--------- ";
		info1+="NRE: "+nre+"\n";

		info1+="Email: "+email+"\n";

		info1+="Direccion: "+direccion+"\n";


		return info1;
	}
}
