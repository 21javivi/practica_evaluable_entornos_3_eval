import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RectanguloTest {

	@Test
	public void testArea() {
		Rectangulo rectangulo = new Rectangulo("rectangulo", 4, 6);
		assertEquals(24, rectangulo.area(), 0.01);
	}

	@Test
	public void testPerimetro() {
		Rectangulo rectangulo = new Rectangulo("rectangulo", 4, 6);
		assertEquals(20, rectangulo.perimetro(), 0.01);
	}

	@Test
	public void testDoble() {
		Rectangulo rectangulo = new Rectangulo("rectangulo", 4, 6);
		rectangulo.doble();
		assertEquals(8, rectangulo.getBase(), 0.01);
		assertEquals(12, rectangulo.getAltura(), 0.01);
	}

	@Test
	public void testDivide2() {
		Rectangulo rectangulo = new Rectangulo("rectangulo", 4, 6);
		rectangulo.divide2();
		assertEquals(2, rectangulo.getBase(), 0.01);
		assertEquals(3, rectangulo.getAltura(), 0.01);
	}
}
