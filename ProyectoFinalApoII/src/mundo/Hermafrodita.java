package mundo;

import java.util.ArrayList;

public class Hermafrodita extends Usuario{

	public static final String HERMA="Hermafrodita";
	
	private Hermafrodita siguiente;
	
	private ArrayList<Usuario> posibles;

	public Hermafrodita(char priPregunta, char segPregunta, char triPregunta, char cuartPregunta,
			char quinPregunta, char sexPregunta, char sepPregunta, char octPregunta, 
			char novPregunta, char decPregunta, String foto, String nombre, 
			String idSexual, String carrera, double altura, int edad,
			int semestre) {
		super(priPregunta, segPregunta, triPregunta, cuartPregunta, quinPregunta, sexPregunta, sepPregunta,
				octPregunta, novPregunta, decPregunta, foto, nombre, HERMA, idSexual, carrera, altura, edad, semestre);
	}
	
	public Hermafrodita getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Hermafrodita siguiente) {
		this.siguiente = siguiente;
	}

	public ArrayList<Usuario> getPosibles() {
		return posibles;
	}

	public void setPosibles(ArrayList<Usuario> posibles) {
		this.posibles = posibles;
	}

	@Override
	public int getAciertos() {
		return super.getAciertos();
	}

	@Override
	public void setAciertos(int aciertos) {
		super.setAciertos(aciertos);
	}

	@Override
	public int getPopularidad() {
		return super.getPopularidad();
	}

	@Override
	public void setPopularidad(int popularidad) {
		super.setPopularidad(popularidad);;
	}
	
	@Override
	public char getPriPregunta() {
		return super.getPriPregunta();
	}

	@Override
	public void setPriPregunta(char priPregunta) {
		super.setPriPregunta(priPregunta);
	}

	@Override
	public char getSegPregunta() {
		return super.getSegPregunta();
	}

	@Override
	public void setSegPregunta(char segPregunta) {
		super.setSegPregunta(segPregunta);
	}

	@Override
	public char getTerPregunta() {
		return super.getTerPregunta();
	}

	@Override
	public void setTerPregunta(char terPregunta) {
		super.setTerPregunta(terPregunta);
	}

	@Override
	public char getCuarPregunta() {
		return super.getCuarPregunta();
	}

	@Override
	public void setCuarPregunta(char cuarPregunta) {
		super.setCuarPregunta(cuarPregunta);;
	}

	@Override
	public char getQuinPregunta() {
		return super.getQuinPregunta();
	}

	@Override
	public void setQuinPregunta(char quinPregunta) {
		super.setQuinPregunta(quinPregunta);;
	}

	@Override
	public char getSexPregunta() {
		return super.getSexPregunta();
	}

	@Override
	public void setSexPregunta(char sexPregunta) {
		super.setSexPregunta(sexPregunta);;
	}

	@Override
	public char getSepPregunta() {
		return super.getSepPregunta();
	}

	@Override
	public void setSepPregunta(char sepPregunta) {
		super.setSepPregunta(sepPregunta);
	}

	@Override
	public char getOctPregunta() {
		return super.getOctPregunta();
	}

	@Override
	public void setOctPregunta(char octPregunta) {
		super.setOctPregunta(octPregunta);
	}

	@Override
	public char getNovPregunta() {
		return super.getNovPregunta();
	}

	@Override
	public void setNovPregunta(char novPregunta) {
		super.setNovPregunta(novPregunta);
	}

	@Override
	public char getDecPregunta() {
		return super.getDecPregunta();
	}

	@Override
	public void setDecPregunta(char decPregunta) {
		super.setDecPregunta(decPregunta);
	}

	@Override
	public String getFoto() {
		return super.getFoto();
	}

	@Override
	public void setFoto(String foto) {
		super.setFoto(foto);
	}

	@Override
	public String getNombre() {
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}

	@Override
	public String getGenero() {
		return super.getGenero();
	}

	@Override
	public void setGenero(String genero) {
		super.setGenero(genero);
	}

	@Override
	public String getIdSexual() {
		return super.getIdSexual();
	}
	
	@Override
	public void setIdSexual(String idSexual) {
		super.setIdSexual(idSexual);
	}

	@Override
	public String getCarrera() {
		return super.getCarrera();
	}

	@Override
	public void setCarrera(String carrera) {
		super.setCarrera(carrera);
	}

	@Override
	public double getAltura() {
		return super.getAltura();
	}

	@Override
	public void setAltura(double altura) {
		super.setAltura(altura);
	}

	@Override
	public int getEdad() {
		return super.getEdad();
	}

	@Override
	public void setEdad(int edad) {
		super.setEdad(edad);
	}

	@Override
	public int getSemestre() {
		return super.getSemestre();
	}

	@Override
	public void setSemestre(int semestre) {
		super.setSemestre(semestre);
	}
	
}
