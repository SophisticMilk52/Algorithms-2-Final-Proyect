package pruebas;



import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

import mundo.Hermafrodita;

import mundo.Hombre;

import mundo.Mujer;

class TestHombre extends TestCase {
	
	//RELACIONES//
	private Hombre elHombre;
	
	//ESCENARIO//
	public void escenario() {
		elHombre = new Hombre('A', 'B', 'C', 'D', 'A', 'A', 'C', 'C', 'D', 'A', "Luis", "Luis", Hombre.HETERO, "Medicina", 1.59, 20, 4);
	}
	
	//TEST//
	@Test
	public void testEmparejar1(){
		escenario();
		Hombre laPareja = new Hombre('A', 'B', 'A', 'A', 'A', 'A', 'C', 'C', 'D', 'A', "Cristiano", "Ronaldo", Hombre.HETERO, "Telemática", 1.8, 32, 6);
		elHombre.compareTo(laPareja);
		try {
			elHombre.emparejar(laPareja);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			assertNull(elHombre.getPareja());
		}
	}
	
	@Test
	public void testEmparejar2() {
		escenario();
		elHombre.setIdSexual(Hombre.HOMO);
		Hombre laPareja = new Hombre('A', 'B', 'A', 'A', 'A', 'A', 'C', 'C', 'D', 'A', "Cristiano", "Ronaldo", Hombre.HETERO, "Telemática", 1.8, 32, 6);
		elHombre.compareTo(laPareja);
		try {
			elHombre.emparejar(laPareja);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			assertNull(elHombre.getPareja());
		}
	}
	
	@Test
	public void testEmparejar3() {
		escenario();
		Mujer laPareja = new Mujer('A', 'B', 'A', 'A', 'A', 'A', 'C', 'C', 'D', 'A', "Marta", "Ramirez", Mujer.HOMO, "Telemática", 1.7, 20, 6);
		elHombre.compareTo(laPareja);
		elHombre.setPopularidad(8);
		try {
			elHombre.emparejar(laPareja);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			assertNull(elHombre.getPareja());
		}
	}
	
	@Test
	public void testEmparejar4() {
		escenario();
		Hermafrodita laPareja = new Hermafrodita('A', 'C', 'A', 'A', 'C', 'A', 'C', 'C', 'C', 'C', "Alberto", "Ramirez", Mujer.HOMO, "Administración", 1.7, 20, 6);
		elHombre.compareTo(laPareja);
		try {
			elHombre.emparejar(laPareja);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			assertNull(elHombre.getPareja());
		}
	}
}
