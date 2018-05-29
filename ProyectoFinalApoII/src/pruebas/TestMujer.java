package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mundo.Mujer;

/**
 * Clase que representa las pruebas de la aplicación IcesiMatch
 */
class TestMujer {
	
	//RELACIONES//
		/**
		 * Relacion que representa la clase que se desea probar
		 */
	private Mujer laMujer;
	
	//ESCENARIO//
		/**
		 * Metodo que crea el escenario con el que se va a probar la clase
		 */
	public void escenario() {
		laMujer = new Mujer('A', 'B', 'C', 'D', 'A', 'A', 'C', 'C', 'D', 'A', "Luisa", "Luisa", Mujer.HETERO, "Medicina", 1.59, 20, 4);
	}
	
}
