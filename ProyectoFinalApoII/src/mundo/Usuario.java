/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Icesi (Cali - Colombia)<br/>
 * Proyecto Final Algoritmos Y Progamación 2<br/>
 * @author Autores: Cristian Gironza, Alejandro Narvaez, Brayan <br/>
 * Todos los derechos reservados y para usos con fines educativos<br/>
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 **/
package mundo;

import java.io.*;
import java.util.Comparator;

/**
 * Clase abstracta que modela a un Usuario
 */
public abstract class Usuario implements Comparable<Usuario>, Comparator<Usuario>, Serializable, Icontable, IEmparejable, IReseteable{
	
	//RELACIONES//
	/**
	 * atributo del Usuario derecha
	 */
	private Usuario derecho;
	
	/**
	 * atributo del Usuario  izquierda
	 */
	private Usuario izquierdo;
	
	/**
	 * atributo de usuario llamado pareja
	 */
	private Usuario pareja;
	
	//CONSTANTES//
	/**
	 * constante respuesta A
	 */
	public static final char RESPONDE_A='A';
	
	/**
	 * constante respuesta B
	 */
	public static final char RESPONDE_B='B';
	
	/**
	 * constante respuesta C
	 */
	public static final char RESPONDE_C='C';
	
	/**
	 * constante respuesta D
	 */
	public static final char RESPONDE_D='D';
	
	/**
	 * constante HETERO
	 */
	public static final String HETERO="Hetero Sexual";
	
	/**
	 * constante HOMO
	 */
	public static final String HOMO="Homo Sexual";
	
	/**
	 * constante BI
	 */
	public static final String BI="Bisexual";
	
	//ATRIBUTOS//
	/**
	 * atributo que me permite ver las coincidencias
	 */
	private int coincidencias;
	
	/**
	 * atributo entero que me muestra el nivel de popularidad
	 */
	private int popularidad;
	
	/**
	 * atributo de la pregunta 1
	 */
	private char priPregunta;
	
	/**
	 * atributo de la pregunta 2
	 */
	private char segPregunta;
	
	/**
	 * atributo de la pregunta 3
	 */
	private char terPregunta;
	
	/**
	 * atributo de la pregunta 4
	 */
	private char cuarPregunta;
	
	/**
	 * atributo de la pregunta 5
	 */
	private char quinPregunta;
	
	/**
	 * atributo de la pregunta 6
	 */
	private char sexPregunta;
	
	/**
	 * atributo de la pregunta 7
	 */
	private char sepPregunta;
	
	/**
	 * atributo de la pregunta 8
	 */
	private char octPregunta;
	
	/**
	 * atributo de la pregunta 9
	 */
	private char novPregunta;
	
	/**
	 * atributo de la pregunta 10
	 */
	private char decPregunta;
	
	/**
	 * atributo de la imagen
	 */
	private String foto;
	
	/**
	 * atributo del nombre
	 */
	private String nombre;
	
	/**
	 * atributo String del genero
	 */	
	private String genero;
	
	/**
	 * atributo del ideSexual
	 */
	private String idSexual;
	
	/**
	 * atributo String de la carrera
	 */
	private String carrera;
	
	/**
	 * atributo double de la altura
	 */
	private double altura;
	
	/**
	 * atributo int de la edad
	 */
	private int edad;
	
	/**
	 * atributo int semestre
	 */
	private int semestre;
	
	//CONSTRUCTOR
	/**
	 * Constructor de la clase Usuario
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
	
	//SET Y GET//
	/**
	 * Dar de pareja
	 * @return pareja/Usuario que representa la pareja
	 */
	public Usuario getPareja() {
		return pareja;
	}
	
	/**
	 * modificar de la pareja
	 * @param pareja/cambia la pareja del usuario
	 */
	public void setPareja(Usuario pareja) {
		this.pareja = pareja;
	}
	
	/**
	 * Dar de coincidencias
	 * @return coincidencias/entero que representan las coincidencias
	 */
	public int getCoincidencias() {
		return coincidencias;
	}
	
	/**
	 * Modificar de coincidencias
	 * @param coincidencias
	 */
	public void setCoincidencias(int coincidencias) {
		this.coincidencias = coincidencias;
	}
	
	/**
	 * Dar de derecho
	 * @return derecho/Usuario que representa la rama derecha del arbol
	 */
	public Usuario getDerecho() {
		return derecho;
	}
	
	/**
	 * Modificar de derecho
	 * @param derecho/ cambia el usuario de la derecha
	 */
	public void setDerecho(Usuario derecho) {
		this.derecho = derecho;
	}
	
	/**
	 * Dar de Izquierdo
	 * @return izquierdo/ Usuario de la rama izquierda
	 */
	public Usuario getIzquierdo() {
		return izquierdo;
	}
	
	/**
	 * Modiciar de Izauierdo
	 * @param izquierdo /Modificar del usuario izquierdo
	 */
	public void setIzquierdo(Usuario izquierdo) {
		this.izquierdo = izquierdo;
	}
	
	/**
	 * Dar de popularidad
	 * @return popularidad/ int nivel de popularidad
	 */
	public int getPopularidad() {
		return popularidad;
	}
	
	/**
	 * Modificar de popularidad
	 * @param popularidad/ modificar de popularidad
	 */
	public void setPopularidad(int popularidad) {
		this.popularidad = popularidad;
	}
	
	/**
	 * Dar de pripregunta
	 * @return priPregunta/char dar de la respuesta de la pregunta 1
	 */
	public char getPriPregunta() {
		return priPregunta;
	}
	
	/**
	 * Modificar de pripregunta
	 * @param priPregunta/ Modifica la pripregunta
	 */
	public void setPriPregunta(char priPregunta) {
		this.priPregunta = priPregunta;
	}
	
	/**
	 * Dar de segPregunta
	 * @return segPregunta/char dar de la respuesta de la pregunta 2
	 */
	public char getSegPregunta() {
		return segPregunta;
	}
	
	/**
	 * Modificar de segPregunta
	 * @param segPregunta/ Modifica la segPregunta
	 */
	public void setSegPregunta(char segPregunta) {
		this.segPregunta = segPregunta;
	}
	
	/**
	 * Dar de terPregunta
	 * @return terPregunta/char dar de la respuesta de la pregunta 3
	 */
	public char getTerPregunta() {
		return terPregunta;
	}
	
	/**
	 * Modificar de terPregunta
	 * @param terPregunta/ Modifica la terPregunta
	 */
	public void setTerPregunta(char terPregunta) {
		this.terPregunta = terPregunta;
	}
	
	/**
	 * Dar de cuarPregunta
	 * @return cuarPregunta/char dar de la respuesta de la pregunta 4
	 */
	public char getCuarPregunta() {
		return cuarPregunta;
	}
	
	/**
	 * Modificar de cuarPregunta
	 * @param cuarPregunta/ Modifica la cuarPregunta
	 */
	public void setCuarPregunta(char cuarPregunta) {
		this.cuarPregunta = cuarPregunta;
	}
	
	/**
	 * Dar de quinPregunta
	 * @return quinPregunta/char dar de la respuesta de la pregunta 5
	 */
	public char getQuinPregunta() {
		return quinPregunta;
	}
	
	/**
	 * Modificar de quinPregunta
	 * @param quinPregunta/ Modifica la quinPregunta
	 */
	public void setQuinPregunta(char quinPregunta) {
		this.quinPregunta = quinPregunta;
	}
	
	/**
	 * Dar de sexPregunta
	 * @return sexPregunta/char dar de la respuesta de la pregunta 6
	 */
	public char getSexPregunta() {
		return sexPregunta;
	}
	
	/**
	 * Modificar de sexPregunta
	 * @param sexPregunta/ Modifica la sexPregunta
	 */
	public void setSexPregunta(char sexPregunta) {
		this.sexPregunta = sexPregunta;
	}
	
	/**
	 * Dar de sepPregunta
	 * @return sepPregunta/char dar de la respuesta de la pregunta 7
	 */
	public char getSepPregunta() {
		return sepPregunta;
	}
	
	/**
	 * Modificar de sepPregunta
	 * @param sepPregunta/ Modifica la sepPregunta
	 */
	public void setSepPregunta(char sepPregunta) {
		this.sepPregunta = sepPregunta;
	}
	
	/**
	 * Dar de octPregunta
	 * @return octPregunta/char dar de la respuesta de la pregunta 8
	 */
	public char getOctPregunta() {
		return octPregunta;
	}
	
	/**
	 * Modificar de octPregunta
	 * @param octPregunta/ Modifica la octPregunta
	 */
	public void setOctPregunta(char octPregunta) {
		this.octPregunta = octPregunta;
	}
	
	/**
	 * Dar de novPregunta
	 * @return novPregunta/char dar de la respuesta de la pregunta 9
	 */
	public char getNovPregunta() {
		return novPregunta;
	}
	
	/**
	 * Modificar de novPregunta
	 * @param novPregunta/ Modifica la novPregunta
	 */
	public void setNovPregunta(char novPregunta) {
		this.novPregunta = novPregunta;
	}
	/**
	 * Dar de decPregunta
	 * @return decPregunta/char dar de la respuesta de la pregunta 10
	 */
	public char getDecPregunta() {
		return decPregunta;
	}
	
	/**
	 * Modificar de decPregunta
	 * @param decPregunta/ Modifica la decPregunta
	 */
	public void setDecPregunta(char decPregunta) {
		this.decPregunta = decPregunta;
	}
	
	/**
	 * Dar de foto
	 * @return foto/String ruta de la imagen
	 */
	public String getFoto() {
		return foto;
	}
	
	/**
	 * Modificar de foto
	 * @param foto/ Modifica le ruta de la imagen
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	/**
	 * Da el nombre
	 * @return nombre/ String da el nombre de usuario
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Modificar de nombre
	 * @param nombre/ modifica el nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Dar de genero
	 * @return genero/ String da el genero
	 */
	public String getGenero() {
		return genero;
	}
	
	/**
	 * Modifica el genero
	 * @param genero/ Modifica el genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	/**
	 * Dar el idsexual
	 * @return idSexual/ STring da el idSexual del usuario
	 */
	public String getIdSexual() {
		return idSexual;
	}
	
	/**
	 * Modificar el idSexual
	 * @param idSexual/ modifica el id
	 */
	public void setIdSexual(String idSexual) {
		this.idSexual = idSexual;
	}
	
	/**
	 * Dar carrera usuario
	 * @return carrera/ String de la carrera
	 */
	public String getCarrera() {
		return carrera;
	}
	
	/**
	 * Modificar de la carrera
	 * @param carrera/ String de la carrera
	 */
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	/**
	 * Dar altura
	 * @return altura/Double da la altura del usuario
	 */
	public double getAltura() {
		return altura;
	}
	
	/**
	 * Modifica la altura dle ususario
	 * @param altura/ double altura
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	/**
	 * dar edad usuario
	 * @return edad/int da la edad usuario
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Modifica la edad del ususario
	 * @param edad/int edad del usuario
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * dar semestre
	 * @return semestre /int da el semestre
	 */
	public int getSemestre() {
		return semestre;
	}
	
	/**
	 * Modificar semestre
	 * @param semestre/ int modifica el semestre del usuario
	 */
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	/**
	 * Permite ver las coincencias que tiene el usuario con los demas usuarios
	 * @param actual/ USUARIO actual del arbol
	 * 
	 */
	public void VerCoincidencias(Usuario actual) {
		actual.compareTo(this);
		if(derecho!=null) {
			derecho.VerCoincidencias(actual);
		}
		if(izquierdo!=null) {
			izquierdo.VerCoincidencias(actual);
		}
	}
	
	public Usuario HacerMatch(Usuario pareja) {
		Usuario parejaD = null;
		Usuario parejaI = null;
		if(derecho!=null) {
			parejaD = derecho;
			parejaD = derecho.HacerMatch(parejaD);
		}
		if(izquierdo!=null) {
			parejaI = izquierdo;
			parejaI = izquierdo.HacerMatch(parejaI);
		}
		if(derecho!=null && izquierdo!=null) {
			if(compare(izquierdo, derecho)>0) {
				if(compare(izquierdo,this)>0) {
					return izquierdo;
				}else {
					return this;
				}
			}else {
				if(compare(derecho, this)>0) {
					return derecho;
				}else {
					return this;
				}
			}
		}else if(derecho==null && izquierdo!=null) {
			if(compare(izquierdo,this)>0) {
				return izquierdo;
			}else {
				return this;
			}
		}else if(derecho!=null && izquierdo==null) {
			if(compare(derecho, this)>0) {
				return derecho;
			}else {
				return this;
			}
		}else {
			return this;
		}
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
		user.setCoincidencias(cantidadDeAciertos);
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
	
	@Override
	public void resetear() {
		coincidencias = 0;
	}
	
	@Override
	public int compare(Usuario u1, Usuario u2) {
		return u1.getCoincidencias()-u2.getCoincidencias();
	}
}
