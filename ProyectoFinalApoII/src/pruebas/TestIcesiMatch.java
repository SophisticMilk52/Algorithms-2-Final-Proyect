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

import excepciones.PopularException;
import excepciones.SexualidadException;
import excepciones.SolitarioException;
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
	private IcesiMatch prueba;
	
	//ESCENARIO//
	public void escenario() {
		prueba = new IcesiMatch();
		prueba.setActual(new Hombre('A', 'B', 'A', 'C', 'D', 'A', 'A', 'A','D', 'D', "James", "James", Usuario.HETERO, "Ingeniería Telemática", 1.85, 22, 6));
		prueba.setRaiz(new Hombre('A', 'B', 'A', 'C', 'D', 'A', 'A', 'A','D', 'D', "Falcao", "Falcao", Usuario.HOMO, "Medicina", 2, 19, 4));
		prueba.getRaiz().setDerecho(new Mujer('D', 'C', 'A', 'A', 'C', 'A', 'C', 'A','C', 'D', "Daniela", "Daniela", Usuario.HETERO, "Quimica", 1.57, 20, 2));
	}
	
	//TEST//
	@Test
	public void TestCoincidencias() {
		this.escenario();
		prueba.generarCoincidencias();
		assertEquals(10, prueba.getRaiz().getCoincidencias());
	}
	@Test
	public void TestContar() {
		this.escenario();
		prueba.contar();
		assertEquals(2, prueba.getRaiz().contar());
	}
	@Test
	public void TesthacerMatch() {
		this.escenario();
		try {
			prueba.hacerMatch();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PopularException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SexualidadException e) {
			// TODO Auto-generated catch block

		} catch (SolitarioException e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		}
		assertNull( prueba.getActual().getPareja());
	}
	@Test
	public void TestregistrarUsuario() {
		this.escenario();
		prueba.registrarUsuario("hola","hola", "hola", "Homo Sexual", "hola", 0, 0,0);
		assertEquals("hola", prueba.getActual().getNombre());
	}
	@Test
	public void TestAgregarActual() {
		this.escenario();
		prueba.AgregarActual();
		prueba.contar();
		assertEquals(3, prueba.getCantidad());
	}
	@Test
	public void TestResetear() {
		this.escenario();
		prueba.resetear();;
		assertEquals(0, prueba.getActual().getCoincidencias());
	}
}
