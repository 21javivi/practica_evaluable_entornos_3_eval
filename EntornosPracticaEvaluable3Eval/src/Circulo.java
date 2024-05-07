
public class Circulo implements Figura {
	// ATRIBUTOS
	String nombre;
	float radio;

	// CONSTRUCTORES
	public Circulo(String nombre, float radio) {
		if (radio <= 1000) {
			this.nombre = nombre;
			this.radio = radio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	// METODOS DE LA CLASE
	@Override
	public float area() {
		return   (float) (Math.PI * Math.pow(radio, 2));

	}

	@Override
	public float perimetro() {
		return   (float) (2 * Math.PI * radio);
	}

	@Override
	public void doble() {

		if (this.radio * 2 <= 1000) {
			this.radio = this.radio * 2;
		}

	}

	@Override
	public void divide2() {
		
		if (this.radio/2>0) {
			this.radio=this.radio/2;
		}

	}

	public void muestra() {
		System.out.println("Circulo [nombre=" + nombre + ", radio=" + radio + ", area()=" + area() + ", perimetro()="
				+ perimetro() + "]");
	}

}
