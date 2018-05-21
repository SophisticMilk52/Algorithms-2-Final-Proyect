/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Icesi (Cali - Colombia)
 * Proyecto Final Algoritmos Y Progamación 2
 * Autores: Cristian Gironza, Alejandro, Brayan
 * Todos los derechos reservados y para usos con fines educativos
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 **/

package mundo;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Comparator;

/**
 * Clase que representa a la aplicacion IcesiMatch
 */
public class IcesiMatch implements Comparator<Usuario>{
	//RELACIONES//
	/**
	 * Relacion que representa el arbol de usuarios
	 */
	private Usuario raiz;
	
	/**
	 * Relacion que representa la lista de usuarios
	 */
	private Pregunta inicio;
	
	//CONSTANTES//
	/**
	 * Costante que representa la ruta del archivo donde se guardará y cargará
	 * los usuarios y su respectiva información
	 */
	private final static String DATA = "./Datos/usuarios.dat";
	
	/**
	 * Costante que representa la ruta del archivo donde se escribirá el historial
	 * de usuarios
	 */
	private final static String HISTORIAL = "./Datos/historial.txt";

	//ATRIBUTOS
	/**
	 * Atributo que representa la cantidad de usuarios registrados
	 */
	private int cantidad;
	
	/**
	 * Atributo que representa al usuario actual que esta buscando su match
	 */
	private Usuario actual;
	
	/**
	 * Constructor de la clase IcesiMatch
	 */
	public IcesiMatch() {
	
	}
	
	public void cargar() {
		try {
			FileInputStream fis = new FileInputStream(DATA);
			ObjectInputStream ois = new ObjectInputStream(fis);
			raiz = (Usuario) ois.readObject();
			fis.close();
			ois.close();
		} catch (Exception e) {

		}
	}
	
	public void guardar() {
		try {
			
		} catch (Exception e) {
			
		}	
	}

	@Override
	public int compare(Usuario u1, Usuario u2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
