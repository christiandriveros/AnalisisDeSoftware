package triangulo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

public class Triangulo_test {
	
	@Test
	public void test01_esIsoceles()  throws TriangleException {
		Triangulo t = new Triangulo(3, 2, 3);
		assertEquals("Isoceles", t.getTipo());
	}
	
	@Test
	public void test02_esEscaleno()  throws TriangleException {
		Triangulo t = new Triangulo(3, 4, 5);
		assertEquals("Escaleno", t.getTipo());
	}
	
	@Test
	public void test03_esEquilatero()  throws TriangleException {
		Triangulo t = new Triangulo(4, 4, 4);
		assertEquals("Equilatero", t.getTipo());
	}
	
	@Test(expected=TriangleException.class)
	public void test04_todoCero()  throws TriangleException {
		Triangulo t = new Triangulo(0, 0, 0);
		fail("no debió llegar hasta aca");
	}
	
	@Test(expected=TriangleException.class)
	public void test05_noEsUnTriangulo()  throws TriangleException {
		Triangulo t = new Triangulo(2, 5, 10);
		fail("no debió llegar hasta aca");
	}
	
	@Test(expected=TriangleException.class)
	public void test06_noEsUnTriangulo2()  throws TriangleException {
		Triangulo t = new Triangulo(5, 10, 2);
		fail("no debió llegar hasta aca");
	}
	
	@Test(expected=TriangleException.class)
	public void test07_noEsUnTriangulo3()  throws TriangleException {
		Triangulo t = new Triangulo(10, 5, 2);
		fail("no debió llegar hasta aca");
	}
	
	@Test
	public void test08_esIsoceles2()  throws TriangleException {
		Triangulo t = new Triangulo(3, 3, 4);
		assertEquals("Isoceles", t.getTipo());
	}
	
	@Test
	public void test09_esIsoceles3()  throws TriangleException {
		Triangulo t = new Triangulo(3, 4, 3);
		assertEquals("Isoceles", t.getTipo());
	}
	
	@Test
	public void test10_esIsoceles4()  throws TriangleException {
		Triangulo t = new Triangulo(4, 3, 3);
		assertEquals("Isoceles", t.getTipo());
	}
	
	@Test(expected=TriangleException.class)
	public void test11_ladoMenorACero()  throws TriangleException {
		Triangulo t = new Triangulo(4, 5, -1);
		fail("no debió llegar hasta aca");
	}
	
	
	@Test(expected=TriangleException.class)
	public void test12_noEsUnTriangulo4()  throws TriangleException {
		Triangulo t = new Triangulo(2, 3, 5);
		fail("no debió llegar hasta aca");
	}
	
	@Test(expected=TriangleException.class)
	public void test13_ladoIgualACero()  throws TriangleException {
		Triangulo t = new Triangulo(4, 5, 0);
		fail("no debió llegar hasta aca");
	}
	
	@Test(expected=TriangleException.class)
	public void test14_noEsUnTriangulo5()  throws TriangleException {
		Triangulo t = new Triangulo(5, 2, 3);
		fail("no debió llegar hasta aca");
	}
	
	@Test(expected=TriangleException.class)
	public void test15_noEsUnTriangulo6()  throws TriangleException {
		Triangulo t = new Triangulo(2, 5, 3);
		fail("no debió llegar hasta aca");
	}
	
	@Test(expected=TriangleException.class)
	public void test16_noEsUnTriangulo7()  throws TriangleException {
		Triangulo t = new Triangulo(3, 5, 10);
		fail("no debió llegar hasta aca");
	}
	
	@Test(expected=TriangleException.class)
	public void test17_noEsUnTriangulo8()  throws TriangleException {
		Triangulo t = new Triangulo(5, 10, 3);
		fail("no debió llegar hasta aca");
	}
	
	@Test(expected=TriangleException.class)
	public void test18_noEsUnTriangulo9()  throws TriangleException {
		Triangulo t = new Triangulo(10, 5, 3);
		fail("no debió llegar hasta aca");
	}
	
	@Test(expected=NumberFormatException.class)
	public void test19_tieneDecimal()  throws TriangleException {
		Triangulo t = new Triangulo("3,875648","5,231564","4,321651");
		fail("no debió llegar hasta aca");
	}
	
	@Test(expected=NumberFormatException.class)
	public void test20_tieneLetras1()  throws TriangleException {
		Triangulo t = new Triangulo("a","4","5");
		fail("no debió llegar hasta aca");
	}
	
	@Test(expected=NumberFormatException.class)
	public void test21_tieneLetras2()  throws TriangleException {
		Triangulo t = new Triangulo("3","a","5");
		fail("no debió llegar hasta aca");
	}
	
	@Test(expected=NumberFormatException.class)
	public void test22_tieneLetras3()  throws TriangleException {
		Triangulo t = new Triangulo("3","4","a");
		fail("no debió llegar hasta aca");
	}
	
	@Test(expected=NumberFormatException.class)
	public void test23_tieneLetras4()  throws TriangleException {
		Triangulo t = new Triangulo("~","\"",".");
		fail("no debió llegar hasta aca");
	}
	
	@Test
	public void test24_comoCadena()  throws TriangleException {
		Triangulo t = new Triangulo("3","3","3");
		assertEquals("Equilatero", t.getTipo());
	}
}
