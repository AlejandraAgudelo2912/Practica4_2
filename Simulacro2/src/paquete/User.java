package paquete;

public class User {

		public String id;
		public String name;
		public String apellidos;
		public String nif;
		public String email;
		public String direccion;
		public String telefono;

			
		public User(){
		}
		public User(String id, String name, String apellidos, String nif, String email, String direccion, String telefono){
			setId(id);
			setName(name);
			setApellidos(apellidos);
			setNif(nif);
			setEmail(email);
			setDireccion(direccion);
			setTelefono(telefono);

		}
				
			
		public String getId() {
			return this.id;
		}
		public String getName() {
			return this.name;
		}
		public String getApellidos() {
			return this.apellidos;
		}
		public String getNif() {
			return this.nif;
		}
		public String getEmail() {
			return this.email;
		}
		public String getDireccion() {
			return this.direccion;
		}
		public String getTelefono() {
			return this.telefono;
		}
			
		public void setDireccion(String direccion) {	
			this.direccion=direccion;		
		}
		public void setName(String name) {	
			this.name=name;		
		}
		public void setId(String id) {	
			this.id=id;		
		}
		public void setNif(String nif) {	
			this.nif=nif;		
		}
		public void setApellidos(String apellidos) {	
			this.apellidos=apellidos;		
		}
		public void setEmail(String email) {	
			this.email=email;		
		}
		public void setTelefono(String telefono) {	
			this.telefono=telefono;		
		}

	}
