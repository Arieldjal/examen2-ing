package ac.cr.ucr.examen2ing;

public class Ejercicio {
	private int id;
	private String nombre;
	
	public Ejercicio (int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public Ejercicio () {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
