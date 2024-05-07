import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CuadradoTest {

	@Test
	public void testArea() {
		Cuadrado cuadrado = new Cuadrado("cuadrado", 5);
		assertEquals(25, cuadrado.area(), 0.01);
	}

	@Test
	public void testPerimetro() {
		Cuadrado cuadrado = new Cuadrado("cuadrado", 5);
		assertEquals(20, cuadrado.perimetro(), 0.01);
	}

	@Test
	public void testDoble() {
		Cuadrado cuadrado = new Cuadrado("cuadrado", 5);
		cuadrado.doble();
		assertEquals(10, cuadrado.getLado(), 0.01);
	}

	@Test
	public void testDivide2() {
		Cuadrado cuadrado = new Cuadrado("cuadrado", 5);
		cuadrado.divide2();
		assertEquals(2.5, cuadrado.getLado(), 0.01);
	}
}
