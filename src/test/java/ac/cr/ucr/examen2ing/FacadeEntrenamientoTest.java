package ac.cr.ucr.examen2ing;

import org.junit.jupiter.api.Test;

class FacadeEntrenamientoTest {

	@Test
	public void main() {
		FacadeEntrenamiento facadeEntrenamiento = new FacadeEntrenamiento();

        facadeEntrenamiento.verRutinaParteSuperiorCuerpo();
        System.out.println();
        facadeEntrenamiento.verRutinaParteInferiorCuerpo();
	}

}
