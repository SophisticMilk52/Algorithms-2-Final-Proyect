/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Icesi (Cali - Colombia)
 * Proyecto Final Algoritmos Y Progamación 2
 * Autores: Cristian Gironza, Alejandro, Brayan
 * Todos los derechos reservados y para usos con fines educativos
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 **/

package excepciones;

/**
 * Clase que representa la excepción de un usuario con una tasa de popularidad muy alta
 */
public class PopularException extends Exception {
	
	//CONSTRUCTOR//
	/**
	 * Constructor de la excepción para una persona popular
	 */
	public PopularException() {
		super("Usted es una persona muy popular, salga y conquiste el mundo");
	}
}
