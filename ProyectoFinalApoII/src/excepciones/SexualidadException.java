/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Icesi (Cali - Colombia)
 * Proyecto Final Algoritmos Y Progamación 2
 * @Autores: Cristian Gironza, Alejandro, Brayan
 * Todos los derechos reservados y para usos con fines educativos
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 **/

package excepciones;

/**
 * Clase que representa la excepción de un usuario con afinidad con uno de los usuarios,
 *	pero tienen distintas identificaciones sexuales
 */
public class SexualidadException extends Exception {
	
	//CONSTRUCTOR//
		/**
		 * Constructor de la excepción para una persona con problemas con si 
		 * identificación sexual
		 * @param persona - nombre de la persona con la cual tiene afinidad pero sus 
		 * identidades sexuales no les permiten hacer match
		 */
	public SexualidadException(String persona) {
		super(persona+" es la persona con la que tiene mayor afinidad, pero tiene un "
				+ "problema con la identificación sexual");
	}
}
