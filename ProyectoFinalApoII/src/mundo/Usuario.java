package mundo;

import java.io.*;
import java.util.ArrayList;

public abstract class Usuario implements Comparable<Usuario>, Serializable, Icontable, IEmparejable{
	
	//RELACIONES//
	private Usuario derecho;
	private Usuario izquierdo;
	private Usuario pareja;
	
	//CONSTANTES//
	public static final char RESPONDE_A='A';
	public static final char RESPONDE_B='B';
	public static final char RESPONDE_C='C';
	public static final char RESPONDE_D='D';	
	public static final String HETERO="Hetero Sexual";
	public static final String HOMO="Homo Sexual";
	public static final String BI="Bisexual";
	
	//ATRIBUTOS//
	private int coincidencias;
	private int popularidad;
	private char priPregunta;
	private char segPregunta;
	private char terPregunta;
	private char cuarPregunta;
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
	private int semestre;
	
	//CONSTRUCTOR
	public Usuario(char priPregunta, char segPregunta, char terPregunta,
			char cuarPregunta, char quinPregunta, char sexPregunta, char sepPregunta,
			char octPregunta, char novPregunta, char decPregunta, String foto, 
			String nombre, String genero, String idSexual, String carrera, 
			double altura, int edad, int semestre) {
		this.coincidencias =0;
		this.popularidad = 0;
		this.priPregunta = priPregunta;
		this.segPregunta = segPregunta;
		this.terPregunta = terPregunta;
		this.cuarPregunta = cuarPregunta;
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
		this.semestre = semestre;
	}

	public Usuario getDerecho() {
		return derecho;
	}

	public void setDerecho(Usuario derecho) {
		this.derecho = derecho;
	}

	public Usuario getIzquierdo() {
		return izquierdo;
	}

	public void setIzquierdo(Usuario izquierdo) {
		this.izquierdo = izquierdo;
	}

	public int getPopularidad() {
		return popularidad;
	}

	public void setPopularidad(int popularidad) {
		this.popularidad = popularidad;
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

	public char getTerPregunta() {
		return terPregunta;
	}

	public void setTerPregunta(char terPregunta) {
		this.terPregunta = terPregunta;
	}

	public char getCuarPregunta() {
		return cuarPregunta;
	}

	public void setCuarPregunta(char cuarPregunta) {
		this.cuarPregunta = cuarPregunta;
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

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	@Override
	public int compareTo(Usuario user) {
		int cantidadDeAciertos = 0;
		if(priPregunta==user.getPriPregunta()) {
			cantidadDeAciertos++;
		}
		if(segPregunta==user.getSegPregunta()) {
			cantidadDeAciertos++;
		}
		if(terPregunta==user.getTerPregunta()) {
			cantidadDeAciertos++;
		}
		if(cuarPregunta==user.getCuarPregunta()) {
			cantidadDeAciertos++;
		}
		if(quinPregunta==user.getQuinPregunta()) {
			cantidadDeAciertos++;
		}
		if(sexPregunta==user.getSexPregunta()) {
			cantidadDeAciertos++;
		}
		if(sepPregunta==user.getPriPregunta()) {
			cantidadDeAciertos++;
		}
		if(octPregunta==user.getOctPregunta()) {
			cantidadDeAciertos++;
		}
		if(novPregunta==user.getNovPregunta()) {
			cantidadDeAciertos++;
		}
		if(decPregunta==user.getDecPregunta()) {
			cantidadDeAciertos++;
		}
		return cantidadDeAciertos;	
	}
	
	@Override
	public int contar() {
		int valor = 1;
		if(derecho!=null) {
			valor += derecho.contar();
		}
		if(izquierdo!=null) {
			valor += izquierdo.contar();
		}
		return valor;
	}
}
