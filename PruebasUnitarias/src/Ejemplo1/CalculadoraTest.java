package Ejemplo1;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

	public class CalculadoraTest {
		Calculadora calculadora; 
		@Before
		public void preparacion() {
			System.out.println("Preparacion");
			this.calculadora = new Calculadora();
		}
	    @Test
	    public void testSumar() {
			System.out.println("Test Sumar");

	        int resultado = calculadora.sumar(2, 3);
	        assertEquals(5, resultado);
	    }

	    @Test
	    public void testRestar() {
			System.out.println("Test Restar");

	        int resultado = calculadora.restar(5, 3);
	        assertEquals(2, resultado);
	    }
	    @Test
	    public void testEspar() {
			System.out.println("Test Par");

	        boolean resultado = calculadora.Espar(4);
	        assertTrue(resultado);
	    }
	    @Test
	    public void testEsImpar() {
			System.out.println("Test Impar");

	        boolean resultado = calculadora.EsImpar(5);
	        assertTrue(resultado);
	    }
	}

