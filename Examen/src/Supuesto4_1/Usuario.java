package Supuesto4_1;

public class Usuario {
	private String nombre;
	private String apellidos;
	private String email;

	public Usuario(){
		
	}
	public Usuario(String nombre, String apellidos, String email){
		setNombre(nombre);
		setApellidos(apellidos);
		setEmail(email);
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getEmail() {
		return email;
	}
	
	
	public void setNombre(String nombre) {
		if (nombre.length()>=4){
			this.nombre=nombre;
		}
	}
	public void setApellidos(String apellidos) {
		if (apellidos.length()>=4){
			this.apellidos=apellidos;
		}
	}
	public void setEmail(String email) {
		if (email.length()>6){
			for (int i=0; i <email.length();i++) {
				if(email.charAt(0)=='@'||email.charAt(email.length()-1)=='@'){

				}else if (email.charAt(i)=='@') {
					this.email=email;

				}
			}
		}
	}
	
	
}
