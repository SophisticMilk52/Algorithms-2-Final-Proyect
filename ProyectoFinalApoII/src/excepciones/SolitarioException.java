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
 * Clase que representa la excepci�n de un usuario con poca afinidad con todas las personas registradas
 */
public class SolitarioException extends Exception{
	
	//CONSTRUCTOR//
		/**
		 * Constructor de la excepci�n para una persona solitaria
		 */
	public SolitarioException() {
		super("Usted no tiene match con ninguna persona de nuestra base de datos");
	}
}
