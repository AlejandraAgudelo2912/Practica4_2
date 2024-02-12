package Tarea3_2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EstudianteTest {
	
		Estudiante estudiante1;
		Estudiante estudiante2; 
		Estudiante estudiante3; 
		@Before
		public void crearEstudiantes() {
			
			estudiante1 = new Estudiante("Pablo",16,8.3);
			estudiante2 = new Estudiante("Antonio",14,2.6);
			estudiante3 = new Estudiante("Mario",45,10);
		}
		@Test
		public void testNota() {
				String result  = estudiante1.obtenerEstadoAcademico();
		        assertEquals("Notable", result);
		        result  = estudiante2.obtenerEstadoAcademico();
		        assertEquals("Suspenso", result);
		        result  = estudiante3.obtenerEstadoAcademico();
		        assertEquals("Sobresaliente", result);
		}
}