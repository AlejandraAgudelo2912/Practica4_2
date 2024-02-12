package Ejemplo1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EstaticaTest {
	
	@Test
	public void TestFactorial() {
		int result = Estatica.factorial(4);
		assertEquals(24, result);
	}
	
	
}
