package ac.cr.ucr.examen2ing;

import java.util.ArrayList;
import java.util.List;

public class ParteInferiorCuerpo implements Entrenamiento {
	private List<Ejercicio> ejercicios = new ArrayList<>();
	
	public ParteInferiorCuerpo() {}

	@Override
	public void definirRutinaEntrenamiento() {
		ejercicios.add(new Ejercicio(1, "Sentadillas"));
		ejercicios.add(new Ejercicio(2, "Zancadas"));
		ejercicios.add(new Ejercicio(3, "Elevación alterna de piernas"));
		ejercicios.add(new Ejercicio(4, "Puente"));
	}

	@Override
	public void verRutinaEntrenamiento() {
		System.out.println("Entrenamiento Parte Inferior del Cuerpo");
		for(Ejercicio ejercicio : ejercicios) {
			System.out.println("Ejercicio: " + ejercicio.getNombre());
		}
	}

}
