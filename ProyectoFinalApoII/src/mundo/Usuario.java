package mundo;

public class Usuario implements Comparable<Usuario>{
	
	public static final char RESPONDE_A='A';
	public static final char RESPONDE_B='B';
	public static final char RESPONDE_C='C';
	public static final char RESPONDE_D='D';	
	public static final String HETERO="Hetero Sexual";
	public static final String HOMO="Homo Sexual";
	public static final String BI="Bisexual";

	private int aciertos;
	private char priPregunta;
	private char segPregunta;
	private char triPregunta;
	private char cuartPregunta;
	private char quinPregunta;
	private char sexPregunta;
	private char sepPregunta;
	private char octPregunta;
	private char novPregunta;
	private char decPregunta;
	private String foto;
	private String nombre;
	private String genero;
	private String idSexual;
	private String carrera;
	private double altura;
	private int edad;
	private int semeestre;
	
	public Usuario(String hETERO, String hOMO, String bI, int aciertos, char priPregunta, char segPregunta,
			char triPregunta, char cuartPregunta, char quinPregunta, char sexPregunta, char sepPregunta,
			char octPregunta, char novPregunta, char decPregunta, String foto, String nombre, String genero,
			String idSexual, String carrera, double altura, int edad, int semeestre) {

		this.aciertos = aciertos;
		this.priPregunta = priPregunta;
		this.segPregunta = segPregunta;
		this.triPregunta = triPregunta;
		this.cuartPregunta = cuartPregunta;
		this.quinPregunta = quinPregunta;
		this.sexPregunta = sexPregunta;
		this.sepPregunta = sepPregunta;
		this.octPregunta = octPregunta;
		this.novPregunta = novPregunta;
		this.decPregunta = decPregunta;
		this.foto = foto;
		this.nombre = nombre;
		this.genero = genero;
		this.idSexual = idSexual;
		this.carrera = carrera;
		this.altura = altura;
		this.edad = edad;
		this.semeestre = semeestre;
	}
	
	
	public int getAciertos() {
		return aciertos;
	}

	public void setAciertos(int aciertos) {
		this.aciertos = aciertos;
	}

	public char getPriPregunta() {
		return priPregunta;
	}

	public void setPriPregunta(char priPregunta) {
		this.priPregunta = priPregunta;
	}

	public char getSegPregunta() {
		return segPregunta;
	}

	public void setSegPregunta(char segPregunta) {
		this.segPregunta = segPregunta;
	}

	public char getCuartPregunta() {
		return cuartPregunta;
	}

	public void setCuartPregunta(char cuartPregunta) {
		this.cuartPregunta = cuartPregunta;
	}

	public char getQuinPregunta() {
		return quinPregunta;
	}

	public void setQuinPregunta(char quinPregunta) {
		this.quinPregunta = quinPregunta;
	}

	public char getSexPregunta() {
		return sexPregunta;
	}

	public void setSexPregunta(char sexPregunta) {
		this.sexPregunta = sexPregunta;
	}

	public char getSepPregunta() {
		return sepPregunta;
	}

	public void setSepPregunta(char sepPregunta) {
		this.sepPregunta = sepPregunta;
	}

	public char getOctPregunta() {
		return octPregunta;
	}

	public void setOctPregunta(char octPregunta) {
		this.octPregunta = octPregunta;
	}

	public char getNovPregunta() {
		return novPregunta;
	}

	public void setNovPregunta(char novPregunta) {
		this.novPregunta = novPregunta;
	}

	public char getDecPregunta() {
		return decPregunta;
	}

	public void setDecPregunta(char decPregunta) {
		this.decPregunta = decPregunta;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdSexual() {
		return idSexual;
	}

	public void setIdSexual(String idSexual) {
		this.idSexual = idSexual;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSemeestre() {
		return semeestre;
	}

	public void setSemeestre(int semeestre) {
		this.semeestre = semeestre;
	}


	@Override
	public int compareTo(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}



}
