
public class Circulo implements Figura {
	// ATRIBUTOS
	String nombre;
	int radio;

	// CONSTRUCTORES
	public Circulo(String nombre, int radio) {
		if (radio <= 1000) {
			this.nombre = nombre;
			this.radio = radio;
		}
	}

	// METODOS DE LA CLASE
	@Override
	public int area() {
		return (int) (Math.PI * Math.pow(radio, 2));

	}

	@Override
	public int perimetro() {
		return (int) (2 * Math.PI * radio);
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
		System.out.println("Circulo [nombre=" + nombre + ", radio=" + radio + ", area()=" + area() + ", perimetro()="
				+ perimetro() + "]");
	}

}
