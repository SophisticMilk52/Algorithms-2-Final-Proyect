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
	 * Atributo que representa las respuestas de la pregunta
	 */
	private String[] respuestas;
	
	//CONSTRUCTOR//
	/**
	 * Constructor de la clae pregunta
	 * @param txtPregunta - el texto de la pregunta
	 * @param respuestas - las respuestas de la pregunta
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
	public Pregunta getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Pregunta siguiente) {
		this.siguiente = siguiente;
	}

	public String getTxtPregunta() {
		return txtPregunta;
	}

	public void setTxtPregunta(String txtPregunta) {
		this.txtPregunta = txtPregunta;
	}

	public String[] getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(String[] respuestas) {
		this.respuestas = respuestas;
	}
}
	
