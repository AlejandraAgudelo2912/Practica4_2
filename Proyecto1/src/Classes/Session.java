package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Session {

	User currentUser;
	private boolean logged;
	private final String FILE_PATH = "./assets/files/";//".\\assets\\files\\" para windows ./assets/files/ para linux
	private final String USERS_FILE ="users.txt";

	public Session() {
		this.logged = false;
		this.currentUser= new User();
	}
	
	public void login() {
		
		currentUser.username = Input.getString("Nombre de usuario: ");
		
		if (currentUser.username.length()==0) {
			System.out.println("El nombre de usuario esta vacío.");
			return;
		}
		
		String password = Input.getString("Contraseña: ");

		//La clase Buffered almacena datos en búfer
		 try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH+USERS_FILE))) { 
	            String linea;
	            while ((linea = reader.readLine()) != null) {
	                String[] parts = linea.split("#");
					
					if (parts[0].equalsIgnoreCase(currentUser.username) && parts[1].equals(password)) {
	                    logged= true;
	                    
	                    /*Cuando el usuario incie sesion existosamente 
	                    se guardan todos los datos del usuario 
	                    desde el array hasta los atributos de la clase
	                    */
	                    currentUser.name = parts[2];
	                    currentUser.nif = parts[3];
	                    currentUser.email = parts[4];
	                    currentUser.addres = parts[5];
	                    currentUser.birthday = parts[6];
	                    currentUser.role = parts[7];
	                    
	                    System.out.println("Inicio de sesion existoso.");
	                    Input.toContinue();
	                    return;
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 System.out.println("Inicio de sesión inválido. Verifique su nombre de ususario o contraseña.");
	     Input.toContinue();

	}
		
	public void singup() {
		do {		
			currentUser.username =Input.getString("Nombre de usuario: ");
			if (currentUser.username.length()==0) {
				System.out.println("El nombre de usuario esta vacío.");
				Input.toContinue();
				return;
			}
			try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH+USERS_FILE))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] parts = line.split("#");
	                if (parts[0].equals(currentUser.username)) {
	                    System.out.println("El nombre de usuario ya está en uso. Intente con otro.");
	            		logged=false;
	                    break;
	                }else{
	                	logged=true;
	                }
	            }
	        }catch (IOException e) {
	            e.printStackTrace();
	        }
			
		}while(!logged);
		logged=false;
		currentUser.name =Input.getString("Nombre: ");
		if (currentUser.name.length()==0) {
			System.out.println("El nombre de usuario esta vacío. Por favor, introduzca algún valor.");
			Input.toContinue();
			return;
		}
	
		currentUser.nif =Input.getString("NIF: ");
		if (currentUser.nif.length()==0) {
			System.out.println("El NIF esta vacío. Por favor, introduzca algún valor.");
			Input.toContinue();
			return;
		}
	
		currentUser.email =Input.getString("Email: ");
		if (currentUser.email.length()==0) {
			System.out.println("El Email esta vacío. Por favor, introduzca algún valor.");
			Input.toContinue();
			return;
		}
	
		currentUser.addres =Input.getString("Dirección: ");
		if (currentUser.addres.length()==0) {
			System.out.println("La dirección esta vacía. Por favor, introduzca algún valor.");
			Input.toContinue();
			return;
		}
		
		currentUser.birthday =Input.getString("Fecha de cumpleaños: ");
		if (currentUser.birthday.length()==0) {
			System.out.println("La fecha de cumpleaños esta vacía. Por favor, introduzca algún valor.");
			Input.toContinue();
			return;
		}
	
		currentUser.role =Input.getString("Rol: ");
		if (currentUser.birthday.length()==0) {
			System.out.println("El rol esta vacío. Por favor, introduzca algún valor.");
			Input.toContinue();
			return;
		}
		
		String password= Input.getString("Contraseña: ");
		String password2=Input.getString("Corfime contraseña: ");
		if(!password.equals(password2)) {
			System.out.println("Las contraseñas no coinciden!");
			return;
		}
		
		if (password.length()==0) {
			System.out.println("La contraseña esta vacía. Por favor, introduzca algún valor.");
			Input.toContinue();
			return;
		} 
       
        try (FileWriter fw = new FileWriter(FILE_PATH+USERS_FILE, true)) {       	       	
			fw.write("\n"+currentUser.username + "#" + password +"#"+currentUser.name+ "#"
                     +currentUser.nif+ "#"+currentUser.email+ "#"+currentUser.addres+ "#"
					 +currentUser.birthday+ "#"+currentUser.role);
			
            System.out.println("Registro exitoso.");
            logged=false;
        }catch (IOException e) {
            e.printStackTrace();
        }
        Input.toContinue();

	}
	public boolean isLogged() {
		return this.logged;
	}
	
	public void showUSER() {
		 if (isLogged()) {
			 
			 System.out.println("\nInformación del usuario:\n-----------------------");
		     System.out.println("Nombre: "+ currentUser.name);
		     System.out.println("Nombre de usuario: " + currentUser.username);
		     System.out.println("NIF: "+ currentUser.nif);
		     System.out.println("Email: "+currentUser.email);
		     System.out.println("Dirección: "+ currentUser.addres);
		     System.out.println("Fecha de cumpleaños: " + currentUser.birthday);
		     System.out.println("Rol: "+currentUser.role);
		     Input.toContinue();
		    
		 }
	}
	
	public void logout() {
		System.out.println("Cierre de sesión exitoso.");
		logged=false;
		this.currentUser=new User();
        Input.toContinue();
	}
}
 