package mundo;

import excepciones.PopularException;

import excepciones.SexualidadException;

import excepciones.SolitarioException;

public class Hermafrodita extends Usuario{

	//CONSTANTE//
	public static final String HERMA="Hermafrodita";

	public Hermafrodita(char priPregunta, char segPregunta, char triPregunta, char cuartPregunta,
			char quinPregunta, char sexPregunta, char sepPregunta, char octPregunta, 
			char novPregunta, char decPregunta, String foto, String nombre, 
			String idSexual, String carrera, double altura, int edad,
			int semestre) {
		super(priPregunta, segPregunta, triPregunta, cuartPregunta, quinPregunta, sexPregunta, sepPregunta,
				octPregunta, novPregunta, decPregunta, foto, nombre, HERMA, idSexual, carrera, altura, edad, semestre);
	}

	@Override
	public void emparejar(Usuario pareja) throws PopularException, SexualidadException, SolitarioException {
		if(getPopularidad()>7) {
			if(pareja.getCoincidencias()>6) {
				if(getIdSexual().equals(HETERO)) {
					if(!pareja.getGenero().equals(HERMA) && pareja.getIdSexual().equals(BI)) {
						setPareja(pareja);
					}else {
						throw new SexualidadException(pareja.getNombre());
					}
				}else if(getIdSexual().equals(HOMO)) {
					if(pareja.getGenero().equals(HERMA) && !pareja.getIdSexual().equals(HETERO)) {
						setPareja(pareja);
					}else {
						throw new SexualidadException(pareja.getNombre());
					}
				}else {
					if(!pareja.getGenero().equals(HERMA) && pareja.getIdSexual().equals(BI)) {
						setPareja(pareja);
					}else if(pareja.getGenero().equals(HERMA) && !pareja.getIdSexual().equals(HETERO)) {
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