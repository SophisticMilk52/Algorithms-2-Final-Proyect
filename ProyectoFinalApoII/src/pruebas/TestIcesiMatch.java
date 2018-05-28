/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Icesi (Cali - Colombia)
 * Proyecto Final Algoritmos Y Progamación 2
 * Autores: Cristian Gironza, Alejandro, Brayan
 * Todos los derechos reservados y para usos con fines educativos
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 **/

package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import mundo.Hombre;
import mundo.IcesiMatch;
import mundo.Mujer;
import mundo.Usuario;

/**
 * Clase que representa las pruebas de la aplicación IcesiMatch
 */
class TestIcesiMatch extends TestCase {
	
	//RELACIONES//
	/**
	 * Relacion que representa la clase que se desea probar
	 */
	private IcesiMatch prueba;
	
	//ESCENARIO//
	/**
	 * Metodo que crea el escenario con el que se va a probar la clase
	 */
	public void escenario() {
		prueba = new IcesiMatch();
		prueba.setActual(new Hombre('A', 'B', 'A', 'C', 'D', 'A', 'A', 'A','D', 'D', "James", "James", Usuario.HETERO, "Ingeniería Telemática", 1.85, 22, 6));
		prueba.setRaiz(new Hombre('A', 'B', 'A', 'C', 'D', 'A', 'A', 'A','D', 'D', "Falcao", "Falcao", Usuario.HOMO, "Medicina", 2, 19, 4));
		prueba.getRaiz().setDerecho(new Mujer('D', 'C', 'A', 'A', 'C', 'A', 'C', 'A','C', 'D', "Daniela", "Daniela", Usuario.HETERO, "Quimica", 1.57, 20, 2));
	}
	
	//TEST//
	/**
	 * Test del método cargar 
	 */
	@Test
	public void testCargar() {
		escenario();
		prueba.setActual(null);
		prueba.setCantidad(0);
		prueba.setInicio(null);
		prueba.setRaiz(null);
		prueba.cargar();
		assert(prueba.getInicio());
	}
	
}
