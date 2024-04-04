
public class Rectangulo implements Figura {
	// ATRIBUTOS
	String nombre;
	int base;
	int altura;

	// CONSTRUCTORES
	public Rectangulo(String nombre, int base, int altura) {
		if (base <= 1000 && altura <= 1000) {
			this.nombre = nombre;
			this.base = base;
			this.altura = altura;
		}
	}

	// METODOS DE LA CLASE
	@Override
	public int area() {
		return base * altura;
	}

	@Override
	public int perimetro() {
		return (base * 2) + (altura * 2);
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
