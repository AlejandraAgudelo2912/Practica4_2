package EjercicioPOO2;


public class Alumno {

	private String nombre;
	private String apellidos;
	private String nre;
	private String email;
	private String direccion;

	public Alumno() {
		
	}
	
	public Alumno(String nombre, String apellidos, String nre, String direccion, String email) {
		this.apellidos= apellidos;
		this.nombre= nombre;
		this.nre= nre;
		this.email= email;
		this.direccion= direccion;

	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	public String getNRE() {
		return nre;
	}
	
	public void setNRE(String nre) {
		this.nre=nre;
	}
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	public String info () {
		String informacion ="Informacion del alumno\n";
		informacion += "Nombre: "+this.nombre+"\n";
		informacion += "Apellidos: "+this.apellidos+"\n";
		informacion += "NRE: "+this.nre+"\n";
		informacion += "Email: "+this.email+"\n";
		informacion += "Direccion: "+this.direccion+"\n";

		return informacion;
	}

}
