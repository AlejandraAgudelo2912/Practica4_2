package Tare3_3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Session {
		
	public boolean login(String username,String password) {

		try (BufferedReader reader = new BufferedReader(new FileReader("./assets/usuarios.txt"))) { 
		    String linea;
		    while ((linea = reader.readLine()) != null) {
		    	String[] parts = linea.split("#");
						
				if (parts[0].equalsIgnoreCase(username) && parts[1].equals(password)) {
					return true;                  
		        }
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}	 
}
