package Tarea3_1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilsTest {
@Test
public void TestTriangulo() {
	String result = Utils.tipoTriangulo(4,5,4);
	assertEquals("Isósceles", result);
	result = Utils.tipoTriangulo(4,4,4);
	assertEquals("Equilátero", result);
	System.out.println(result);
	result = Utils.tipoTriangulo(4,5,6);
	assertEquals("Escaleno", result);
	result = Utils.tipoTriangulo(40,5,6);
	assertEquals("ERROR", result);
}
@Test
public void TestMasFrecuente() {
	int n []={1,2,2,4,5};
	int result = Utils.masFrecuenteInt(n);
	assertEquals(2, result);
	int s []={1,2,2,4,4};
	result = Utils.masFrecuenteInt(s);
	assertEquals(2, result);
}

@Test
public void TestBuscarInt() {
	int n []={1,2,2,4,5};
	int result = Utils.buscarInt(n,2);
	assertEquals(1, result);
	result = Utils.buscarInt(n,6);
	assertEquals(-1, result);
}
}
