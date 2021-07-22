package ac.cr.ucr.examen2ing;

import java.util.ArrayList;
import java.util.List;


public class ParteSuperiorCuerpo implements Entrenamiento{
	private List<Ejercicio> ejercicios = new ArrayList<>();
	
	public ParteSuperiorCuerpo() {}

	@Override
	public void definirRutinaEntrenamiento() {
		ejercicios.add(new Ejercicio(1, "Superman"));
		ejercicios.add(new Ejercicio(2, "Flexiones"));
		ejercicios.add(new Ejercicio(3, "Remo inclinado con mancuernas"));
		ejercicios.add(new Ejercicio(4, "Tabla lateral apoyada en el codo"));
	}

	@Override
	public void verRutinaEntrenamiento() {
		System.out.println("Entrenamiento Parte Superior del Cuerpo");
		for(Ejercicio ejercicio : ejercicios) {
			System.out.println("Ejercicio: " + ejercicio.getNombre());
		}
	}
	
}
