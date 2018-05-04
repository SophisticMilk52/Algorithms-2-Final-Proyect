package mundo;

public class Transexual extends Usuario{

	public static final String TRANS="Transexual";

	public Transexual(String hETERO, String hOMO, String bI, int aciertos, char priPregunta, char segPregunta,
			char triPregunta, char cuartPregunta, char quinPregunta, char sexPregunta, char sepPregunta,
			char octPregunta, char novPregunta, char decPregunta, String foto, String nombre, String genero,
			String idSexual, String carrera, double altura, int edad, int semeestre) {
		super(hETERO, hOMO, bI, aciertos, priPregunta, segPregunta, triPregunta, cuartPregunta, quinPregunta, sexPregunta,
				sepPregunta, octPregunta, novPregunta, decPregunta, foto, nombre, genero, idSexual, carrera, altura, edad,
				semeestre);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compareTo(Usuario u) {
		return 0;
	}
	
}
