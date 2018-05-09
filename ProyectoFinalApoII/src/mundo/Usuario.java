package mundo;

public abstract class Usuario implements Comparable<Usuario>{
	
	//CONSTANTES
	public static final char RESPONDE_A='A';
	public static final char RESPONDE_B='B';
	public static final char RESPONDE_C='C';
	public static final char RESPONDE_D='D';	
	public static final String HETERO="Hetero Sexual";
	public static final String HOMO="Homo Sexual";
	public static final String BI="Bisexual";
	
	//ATRIBUTOS
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
	
	//CONSTRUCTOR
	public Usuario(int aciertos, char priPregunta, char segPregunta, char triPregunta,
			char cuartPregunta, char quinPregunta, char sexPregunta, char sepPregunta,
			char octPregunta, char novPregunta, char decPregunta, String foto, 
			String nombre, String genero, String idSexual, String carrera, 
			double altura, int edad, int semeestre) {

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
	
	//GET Y SET
	public abstract int getAciertos();
	
	public abstract void setAciertos(int aciertos);

	public abstract char getPriPregunta();

	public abstract void setPriPregunta(char priPregunta);

	public abstract char getSegPregunta();

	public abstract void setSegPregunta(char segPregunta);

	public abstract char getTriPregunta();

	public abstract void setTriPregunta(char triPregunta);

	public abstract char getCuartPregunta();

	public abstract void setCuartPregunta(char cuartPregunta);

	public abstract char getQuinPregunta();

	public abstract void setQuinPregunta(char quinPregunta);

	public abstract char getSexPregunta();

	public abstract void setSexPregunta(char sexPregunta);

	public abstract char getSepPregunta();

	public abstract void setSepPregunta(char sepPregunta);

	public abstract char getOctPregunta();

	public abstract void setOctPregunta(char octPregunta);

	public abstract char getNovPregunta();

	public abstract void setNovPregunta(char novPregunta);

	public abstract char getDecPregunta();

	public abstract void setDecPregunta(char decPregunta);

	public abstract String getFoto();

	public abstract void setFoto(String foto);

	public abstract String getNombre();

	public abstract void setNombre(String nombre);

	public abstract String getGenero();

	public abstract void setGenero(String genero);

	public abstract String getIdSexual();

	public abstract void setIdSexual(String idSexual);

	public abstract String getCarrera();

	public abstract void setCarrera(String carrera);
	
	public abstract double getAltura();

	public abstract void setAltura(double altura);

	public abstract int getEdad();

	public abstract void setEdad(int edad);

	public abstract int getSemeestre();

	public abstract void setSemeestre(int semeestre);

	@Override
	public abstract int compareTo(Usuario u);



}
