package Classes;

public class User {
	public String username;
	public String name;
	public String nif;
	public String email;
	public String addres;
	public String birthday;
	public String role;

	public User(String username, String name, String nif, String email, String addres, String birthday, String role) {
		this.username = username;
	    this.name = name;
	    this.nif = nif;
	    this.email = email;
	    this.addres = addres;
	    this.birthday = birthday;
	    this.role = role;
	}

	// Constructor vacío
	public User() {
	       
	}
}
