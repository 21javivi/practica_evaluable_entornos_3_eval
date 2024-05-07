
public class Cuadrado implements Figura {
	// ATRIBUTOS
	String nombre;
	float lado;

	// CONSTRUCTORES
	public Cuadrado(String nombre, float lado) {
		if (lado <= 1000) {
			this.nombre = nombre;
			this.lado = lado;
		}
	}

	// METODOS DE LA CLASE
	@Override
	public float area() {

		return lado * lado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public float perimetro() {

		return lado * 4;
	}

	@Override
	public void doble() {

		if (this.lado * 2 <= 1000) {
			this.lado = this.lado * 2;
		}

	}

	@Override
	public void divide2() {

		if (this.lado / 2 > 0) {
			this.lado = this.lado / 2;
		}

	}

	public void muestra() {

	}
}
