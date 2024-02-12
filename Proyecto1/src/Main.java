/**
 * Main.java
 * Programa principal del sistema para resolver un laberinto
 * DMS - 2021.11.27
 * version 0.1.0
 */
import Classes.Config;	
import Classes.Input;	
import Classes.Session;

public class Main {

	public static Session currentSession = new Session();
	public static void main(String[] args) {
	
		System.out.println(Config.WELCOME);
		int opcion =-1;
		
		do {
			if (currentSession.isLogged()) {
				opcion = Input.getInt(Config.LOGGED_MENU);
				if (opcion ==1||opcion==2||opcion==3||opcion==4) {
					System.out.println("PROXIMAMENTE...");
					Input.toContinue();
				}else if(opcion==5) {
					currentSession.showUSER();
				}else if (opcion==6) {
					currentSession.logout();
				}else if(opcion!=0){
					System.out.println("ERROR: Introduzca una opción válida, por favor.");
				}
			}else {
				opcion = Input.getInt (Config.UNLOGGED_MENU);
				if (opcion ==1) {
					currentSession.login();
				}else if (opcion ==2) {
					currentSession.singup();
				}else if(opcion!=0){
					System.out.println("ERROR: Introduzca una opción válida, por favor.");
				}
			}
		}while (opcion !=0);
				
		System.out.println("OPCION "+opcion);		
		System.out.println(Config.GODBYE);

	}
}