package Tare3_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SessionTest {
	
	Session usuario1 = new Session ();
	Session usuario2 = new Session ();
	Session usuario3 = new Session ();
	Session usuario4 = new Session ();
			
	@Test
	public void TestLoggin() {
		//Usuarios que devuelven true
		boolean result  = usuario1.login("Dmunuera","123456");
		assertEquals(true, result);
		result  = usuario2.login("pepe","654321");
		assertEquals(true, result);
		
		//Usuarios que devuelven false
		result  = usuario3.login("marta","987654321");
		assertEquals(false, result);
		result  = usuario4.login("pablo","123456");
		assertEquals(false, result);
			     
	}
}
