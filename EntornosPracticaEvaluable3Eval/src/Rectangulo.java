
public class Rectangulo implements Figura {
	// ATRIBUTOS
	String nombre;
	float base;
	float altura;

	// CONSTRUCTORES
	public Rectangulo(String nombre, float base, float altura) {
		if (base <= 1000 && altura <= 1000) {
			this.nombre = nombre;
			this.base = base;
			this.altura = altura;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	// METODOS DE LA CLASE
	@Override
	public float area() {
		return base * altura;
	}

	@Override
	public float perimetro() {
		return (base * 2) + (altura * 2);
	}

	@Override
	public void doble() {

		if (this.base * 2 <= 1000 && this.altura * 2 <= 1000) {
			this.altura = this.altura * 2;
			this.base = this.base * 2;
		}

	}

	@Override
	public void divide2() {

		if (this.base / 2 > 0 && this.altura / 2 > 0) {
			this.altura = this.altura / 2;
			this.base = this.base / 2;
		}

	}

	public void muestra() {

	}

}
