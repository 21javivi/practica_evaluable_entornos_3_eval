import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CirculoTest {

	@Test
	public void testArea() {
		Circulo circulo = new Circulo("círculo", 5);
		assertEquals(78.54, circulo.area(), 0.01);
	}

	@Test
	public void testPerimetro() {
		Circulo circulo = new Circulo("círculo", 5);
		assertEquals(31.42, circulo.perimetro(), 0.01);
	}

	@Test
	public void testDoble() {
		Circulo circulo = new Circulo("círculo", 5);
		circulo.doble();
		assertEquals(10, circulo.getRadio(), 0.01);
	}

	@Test
	public void testDivide2() {
		Circulo circulo = new Circulo("círculo", 5);
		circulo.divide2();
		assertEquals(2.5, circulo.getRadio(), 0.01);
	}
}
