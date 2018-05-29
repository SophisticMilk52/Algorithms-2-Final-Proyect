/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Icesi (Cali - Colombia)
 * Proyecto Final Algoritmos Y Progamaci�n 2
 * Autores: Cristian Gironza, Alejandro, Brayan
 * Todos los derechos reservados y para usos con fines educativos
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 **/

package excepciones;

/**
 * Clase que representa la excepci�n de un usuario con una tasa de popularidad muy alta
 */
public class PopularException extends Exception {
	
	//CONSTRUCTOR//
	/**
	 * Constructor de la excepci�n para una persona popular
	 */
	public PopularException() {
		super("Usted es una persona muy popular, salga y conquiste el mundo");
	}
}
