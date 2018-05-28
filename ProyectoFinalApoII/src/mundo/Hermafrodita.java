package mundo;

import java.util.ArrayList;

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
	public void emparejar(Usuario pareja) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
