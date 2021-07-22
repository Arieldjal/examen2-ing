package ac.cr.ucr.examen2ing;

public class FacadeEntrenamiento {
	public void verRutinaParteSuperiorCuerpo() {
		Entrenamiento entrenamiento = new ParteSuperiorCuerpo();
		entrenamiento.definirRutinaEntrenamiento();
		entrenamiento.verRutinaEntrenamiento();
	}
	
	public void verRutinaParteInferiorCuerpo() {
		Entrenamiento entrenamiento = new ParteInferiorCuerpo();
		entrenamiento.definirRutinaEntrenamiento();
		entrenamiento.verRutinaEntrenamiento();
	}
}
