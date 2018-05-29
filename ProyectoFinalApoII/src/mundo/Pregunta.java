/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Icesi (Cali - Colombia)
 * Proyecto Final Algoritmos Y Progamación 2
 * Autores: Cristian Gironza, Alejandro, Brayan
 * Todos los derechos reservados y para usos con fines educativos
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 **/

package mundo;

/**
 * Clase que representa una pregunta de MatchIcesi
 */
public class Pregunta {
	//RELACIONES//
	/**
	 * Relacion que representa a la siguiente pregunta
	 */
	private Pregunta siguiente;

	//ATRIBUTOS
	/**
	 * Atributo que representa el texto de la pregunta
	 */
	private String txtPregunta;
	/**
	 * Atributo que representa la cantidad de preguntas
	 */
	private int identificador;


	/**
	 * Atributo que representa las respuestas de la pregunta
	 */
	private String[] respuestas;

	//CONSTRUCTOR//
	/**
	 * Constructor de la clase pregunta
	 * @param info - arreglo de tipo String que contiene la pregunta y sus respuestas
	 */
	public Pregunta(String[] info) {
		if(info !=null) {
			txtPregunta = info[0];
			respuestas = new String[4];
			for(int i=1; i<5;i++) {
				respuestas[i-1] = info[i];
			}
		}
	}

	//MÉTODOS//
	//SET Y GET
	/**
	 * Dar de Preguntas
	 * @return siguiente/ Pregunta la siguiente pregunta
	 */
	public Pregunta getSiguiente() {
		return siguiente;
	}
/**
 * Modificar de siguiente
 * @param siguiente/Pregunta es el modificar de la siguiente pregunta
 */
	public void setSiguiente(Pregunta siguiente) {
		this.siguiente = siguiente;
	}
/**
 * Dar de la pregunta
 * @return txtPregunta/ String dar de la pregunta
 */
	public String getTxtPregunta() {
		return txtPregunta;
	}
/**
 * Modificar la pregunta
 * @param txtPregunta /String de la pregunta anterior que va  a ser rmodificada
 */
	public void setTxtPregunta(String txtPregunta) {
		this.txtPregunta = txtPregunta;
	}
/**
 * Dar del arreglo de respuestas
 * @return respuestas / arreglo de String con las repuestas
 */
	public String[] getRespuestas() {
		return respuestas;
	}
/**
 * Modificar del arreglo de respuestas
 * @param respuestas/ STring[] modifica el arreglo de respuestas
 */
	public void setRespuestas(String[] respuestas) {
		this.respuestas = respuestas;
	}
/**
 * Dar la cantidad de respuestas
 * @return identificador/ int  cantidad de respuestas
 */ 
	public int getIdentificador() {
		return identificador;
	}
/**
 * Modificar de la cantidad de respuestas
 * @param identificador/ int modifica la cantidad de respuestas
 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
}

