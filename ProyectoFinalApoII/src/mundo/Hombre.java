package mundo;

import excepciones.PopularException;

import excepciones.SexualidadException;

import excepciones.SolitarioException;

public class Hombre extends Usuario{
	
	//CONSTANTE//
	/**
	 * Constante de la clase Hombre, String hombre
	 */
	public static final String HOMBRE="Hombre";
	
	/**
	 * Constructor de la clase Hombre
     * @param priPregunta /char respuesta de la pregunta 1
	 * @param segPregunta /char respuesta de la pregunta 2
	 * @param terPregunta /char respuesta de la pregunta 3
	 * @param cuarPregunta /char respuesta de la pregunta 4
	 * @param quinPregunta /char respuesta de la pregunta 5
	 * @param sexPregunta /char respuesta de la pregunta 6
	 * @param sepPregunta /char respuesta de la pregunta 7
	 * @param octPregunta /char respuesta de la pregunta 8
	 * @param novPregunta /char respuesta de la pregunta 9
	 * @param decPregunta /char respuesta de la pregunta 10
	 * @param foto /String ruta de la imagen
	 * @param nombre /String nombre del usuario
	 * @param genero /String genero del usuario
	 * @param idSexual/ String id del usuario
	 * @param carrera /String carrera del usuario
	 * @param altura /double altura dle usuario
	 * @param edad /int edad del usuario
	 * @param semestre /int semestre del usuario
	 */
	public Hombre(char priPregunta, char segPregunta, char triPregunta, char cuartPregunta,
			char quinPregunta, char sexPregunta, char sepPregunta, char octPregunta, 
			char novPregunta, char decPregunta, String foto, String nombre, 
			String idSexual, String carrera, double altura, int edad,
			int semestre) {
		super(priPregunta, segPregunta, triPregunta, cuartPregunta, quinPregunta, sexPregunta, sepPregunta,
				octPregunta, novPregunta, decPregunta, foto, nombre, HOMBRE, idSexual, carrera, altura, edad, semestre);
	}

	@Override
	/**
	 * El metodo emparejar de la clase Hombre, este metodo me 
	 * permite buscar la pareja de un hombre teniendo en cuenta las 
	 * orientaciones y puntuacion en las repuestas
	 * 
	 */
	public void emparejar(Usuario pareja) throws PopularException, SexualidadException, SolitarioException {
		if(getPopularidad()>7) {
			if(pareja.getCoincidencias()>6) {
				if(getIdSexual().equals(HETERO)) {
					if(pareja.getGenero().equals(Mujer.MUJER) && !pareja.getIdSexual().equals(HOMO)) {
						setPareja(pareja);
					}else {
						throw new SexualidadException(pareja.getNombre());
					}
				}else if(getIdSexual().equals(HOMO)) {
					if(pareja.getGenero().equals(HOMBRE) && !pareja.getIdSexual().equals(HETERO)) {
						setPareja(pareja);
					}else {
						throw new SexualidadException(pareja.getNombre());
					}
				}else {
					if(pareja.getGenero().equals(Mujer.MUJER) && !pareja.getIdSexual().equals(HOMO)) {
						setPareja(pareja);
					}else if(pareja.getGenero().equals(HOMBRE) && !pareja.getIdSexual().equals(HETERO)) {
						setPareja(pareja);
					}else if(pareja.getGenero().equals(Hermafrodita.HERMA) && !pareja.getIdSexual().equals(HOMO)) {
						setPareja(pareja);
					}else {
						throw new SexualidadException(pareja.getNombre());
					}
				}
			}else {
				throw new SolitarioException();
			}
		}else {
			throw new PopularException();
		}	
	}
}
