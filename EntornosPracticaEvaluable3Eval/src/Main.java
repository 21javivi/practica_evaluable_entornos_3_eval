import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Figura> misFiguras = new ArrayList<>();

	public static void main(String[] args) {
		// String fileName = "Figuras.csv";
		String fileName = "C:\\Users\\javie\\Documents\\GitHub\\practica_evaluable_entornos_3_eval\\Figuras.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			line = br.readLine(); // primera línea cabecera
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length > 0) {
					crearFigura(parts);
				}
			}
		} catch (IOException e) {
			System.err.println("Error al leer el archivo: " + e.getMessage());
		}
		mostrar();
	}

	public static void crearFigura(String[] parts) {
		String figura = parts[0];
		switch (figura) {
		case "Circulo":
			float radio = Float.parseFloat(parts[1]);
			misFiguras.add(new Circulo(figura, radio));
			break;
		case "Cuadrado":
			float lado = Float.parseFloat(parts[1]);
			misFiguras.add(new Cuadrado(figura, lado));
			break;
		case "Rectangulo":
			float base = Float.parseFloat(parts[1]);
			float altura = Float.parseFloat(parts[2]);
			misFiguras.add(new Rectangulo(figura, base, altura));
			break;
		default:
			System.out.println("No se crea objeto");
		}
	}

	public static void mostrar() {
		for (Figura figura : misFiguras) {
			if (figura instanceof Circulo) {
				Circulo circulo = (Circulo) figura;
				System.out.println("Circulo: " + circulo.getNombre() + " area: " + (int) circulo.area() + " perimetro: "
						+ (int) circulo.perimetro());
			} else if (figura instanceof Cuadrado) {
				Cuadrado cuadrado = (Cuadrado) figura;
				System.out.println("Cuadrado: " + cuadrado.getNombre() + " area: " + (int) cuadrado.area()
						+ " perimetro: " + (int) cuadrado.perimetro());
			} else if (figura instanceof Rectangulo) {
				Rectangulo rectangulo = (Rectangulo) figura;
				System.out.println("Rectángulo: " + rectangulo.getNombre() + " area: " + (int) rectangulo.area()
						+ " perimetro: " + (int) rectangulo.perimetro());
			}
		}
	}

	public static void actualizarNombre(String nuevoNombre) {
		for (Figura figura : misFiguras) {
			if (figura instanceof Circulo) {
				Circulo circulo = (Circulo) figura;
				circulo.setNombre(nuevoNombre);
			} else if (figura instanceof Cuadrado) {
				Cuadrado cuadrado = (Cuadrado) figura;
				cuadrado.setNombre(nuevoNombre);
			} else if (figura instanceof Rectangulo) {
				Rectangulo rectangulo = (Rectangulo) figura;
				rectangulo.setNombre(nuevoNombre);
			}
		}
	}

	public static void mostrarMenu() {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("\nMenú:");
			System.out.println("1. Calcular área");
			System.out.println("2. Calcular perímetro");
			System.out.println("3. Duplicar tamaño");
			System.out.println("4. Dividir tamaño entre dos");
			System.out.println("5. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				calcularArea();
				break;
			case 2:
				calcularPerimetro();
				break;
			case 3:
				duplicarTamano();
				break;
			case 4:
				dividirTamano();
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 5);
	}

	// Métodos para las opciones del menú
	public static void calcularArea() {
		for (Figura figura : misFiguras) {
			System.out.println("Nombre: " + figura.getNombre() + ", Área: " + figura.area());
		}
	}

	public static void calcularPerimetro() {
		for (Figura figura : misFiguras) {
			System.out.println("Nombre: " + figura.getNombre() + ", Perímetro: " + figura.perimetro());
		}
	}

	public static void duplicarTamano() {
		for (Figura figura : misFiguras) {
			figura.doble();
		}
		System.out.println("Tamaños duplicados correctamente.");
	}

	public static void dividirTamano() {
		for (Figura figura : misFiguras) {
			figura.divide2();
		}
		System.out.println("Tamaños divididos correctamente.");
	}
}