
public class Cuadrado implements Figura {
	// ATRIBUTOS
	String nombre;
	int lado;

	// CONSTRUCTORES
	public Cuadrado(String nombre, int lado) {
		this.nombre = nombre;
		this.lado = lado;
	}

	// METODOS DE LA CLASE
	@Override
	public int area() {

		return lado * lado;
	}

	@Override
	public int perimetro() {

		return lado * 4;
	}

	@Override
	public void duplica(Integer nuevo) {
		nuevo = nuevo * 2;

	}

	@Override
	public void divide2(Integer nuevo) {
		if (nuevo % 2 >= 0) {
			nuevo = (int) nuevo / 2;
		}

	}

	public void muestra() {

	}
}
