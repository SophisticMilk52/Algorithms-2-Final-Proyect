package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mundo.Hermafrodita;
import mundo.Hombre;
import mundo.Mujer;

class TestHermafrodita {

	//RELACIONES//
	private Hermafrodita persona;
	
	//ESCENARIO//
	public void escenario() {
		persona = new Hermafrodita('A', 'B', 'C', 'D', 'A', 'A', 'C', 'C', 'D', 'A', "Luis", "Luis", Hermafrodita.HOMO, "Medicina", 1.59, 20, 4);
	}
	
	//TEST//
	@Test
	public void testEmparejar1(){
		escenario();
		Hombre laPareja = new Hombre('A', 'B', 'A', 'A', 'A', 'A', 'C', 'C', 'D', 'A', "Cristiano", "Ronaldo", Hombre.HETERO, "Telemática", 1.8, 32, 6);
		persona.compareTo(laPareja);
		try {
			persona.emparejar(laPareja);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			assertNull(persona.getPareja());
		}
	}
	
	@Test
	public void testEmparejar2() {
		escenario();
		persona.setIdSexual(Hermafrodita.BI);
		Hombre laPareja = new Hombre('A', 'B', 'A', 'A', 'A', 'A', 'C', 'C', 'D', 'A', "Cristiano", "Ronaldo", Hombre.HETERO, "Telemática", 1.8, 32, 6);
		persona.compareTo(laPareja);
		try {
			persona.emparejar(laPareja);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			assertNull(persona.getPareja());
		}
	}
	
	@Test
	public void testEmparejar3() {
		escenario();
		Mujer laPareja = new Mujer('A', 'B', 'A', 'A', 'A', 'A', 'C', 'C', 'D', 'A', "Marta", "Ramirez", Mujer.HOMO, "Telemática", 1.7, 20, 6);
		persona.compareTo(laPareja);
		persona.setPopularidad(8);
		try {
			persona.emparejar(laPareja);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			assertNull(persona.getPareja());
		}
	}
	
	@Test
	public void testEmparejar4() {
		escenario();
		Hermafrodita laPareja = new Hermafrodita('A', 'C', 'A', 'A', 'C', 'A', 'C', 'C', 'C', 'C', "Alberto", "Ramirez", Mujer.HOMO, "Administración", 1.7, 20, 6);
		persona.compareTo(laPareja);
		try {
			persona.emparejar(laPareja);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			assertNull(persona.getPareja());
		}
	}
}
