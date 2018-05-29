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

import java.util.*;

import excepciones.PopularException;
import excepciones.SexualidadException;
import excepciones.SolitarioException;

/**
 * Clase que representa a la aplicación IcesiMatch
 */
public class IcesiMatch implements Comparator<Usuario>{
	
	//RELACIONES//
	/**
	 * Relacion que representa el arbol de usuarios
	 */
	private Usuario raiz;
	
	/**
	 * Relacion que representa la lista de usuarios
	 */
	private Pregunta inicio;
	
	//CONSTANTES//
	/**
	 * Costante que representa la ruta del archivo donde se guardará y cargará
	 * los usuarios y su respectiva información
	 */
	private final static String DATA = "./Datos/usuarios.dat";
	
	/**
	 * Costante que representa la ruta del archivo donde se escribirá el historial
	 * de usuarios
	 */
	private final static String HISTORIAL = "./Datos/historial.txt";
	
	/**
	 * Costante que representa la ruta del archivo donde se tienen las preguntas
	 * con sus respectivas respuestas
	 */
	private final static String PREGUNTAS = "./Datos/preguntas.txt";

	//ATRIBUTOS//
	/**
	 * Atributo que representa la cantidad de usuarios registrados
	 */
	private int cantidad;
	
	/**
	 * Atributo que representa al usuario actual que esta buscando su match
	 */
	private Usuario actual;
	
	//CONSTRUCTOR//
	/**
	 * Constructor de la clase IcesiMatch
	 */
	public IcesiMatch() {
		cargar();
	}
	
	/**
	 * Dar de la raiz del arbol
	 * @return raiz /Usuario
	 */
	public Usuario getRaiz() {
		return raiz;
	}
/**
 * Modificar de la raiz del arbol
 * @param raiz/Usuario
 */
	public void setRaiz(Usuario raiz) {
		this.raiz = raiz;
	}
/**
 * Dar de la lista de preguntas
 * @return inicio/Pregunta
 */
	public Pregunta getInicio() {
		return inicio;
	}
/**
 *Modificar la pregunta inicial 
 * @param inicio/Pregunta
 */
	public void setInicio(Pregunta inicio) {
		this.inicio = inicio;
	}
/**
 *  Dar cantidad de usuario
 * @return cantidad/ int da la cantidad de usuarios en el arbol
 */
	public int getCantidad() {
		return cantidad;
	}
/**
 * Modifica la cantidad de usuarios del arbol
 * @param cantidad / int cantidad de usuarios del arbol
 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
/**
 *  Dar el usuario actual
 * @return actual/ Usuario actual
 */
	public Usuario getActual() {
		return actual;
	}
/**
 * Modificar de Usuario actual
 * @param actual /Usuario es el nuevo usuario
 */
	public void setActual(Usuario actual) {
		this.actual = actual;
	}

	/**
	 * Método que carga el estado de la clase con sus respectivos usuarios y preguntas
	 * de la aplicación
	 */
	public void cargar() {
		//Carga el arbol de usuarios//
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(DATA);
			ois = new ObjectInputStream(fis);
			raiz = (Usuario) ois.readObject();
		} catch (Exception e) {

		}finally {
			try {
				if(fis!=null) {
					fis.close();
				}
				if(ois!=null) {
					ois.close();
				}
			} catch (Exception e) {
			
			}
		}
		//Carga las preguntas desde el texto plano//
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(PREGUNTAS);
			br = new BufferedReader(fr);
			Pregunta aux = null;
			Pregunta cambio = null;
			String linea = br.readLine();
			int id = 1;
			while(linea!=null) {
				if(aux==null) {
					cambio = new Pregunta(linea.split("/"), id);
					inicio = cambio;
					aux = inicio;
				}else {
					cambio = new Pregunta(linea.split("/"), id);
					aux.setSiguiente(cambio);
					aux = aux.getSiguiente();
				}
				id++;
				linea = br.readLine();
			}
		} catch (Exception e) {
		
		}finally {
			try {
				if(fr!=null) {
					fr.close();
				}
				if(br!=null) {
					fr.close();
				}
			} catch (Exception e) {
				
			}
		}
		contar();
	}
	
	/**
	 * Este metodo guardar guardara todos los estados tanto en serializable como en texto plano
	 */
	public void guardar() {
		try {
			
		} catch (Exception e) {
			
		}	
	}
	/**
	 * Este metodo asigna las coincidencia a todos los usuarios registrados
	 */
	public void generarCoincidencias() {
		if(raiz!=null) {
			raiz.VerCoincidencias(actual);
		}
	}
/**
 * Este metodo cuenta la cantidades de usuarios que hay	
 */
	public void contar() {
		int cantidad = 0;
		if(raiz!=null) {
			cantidad = raiz.contar();
		}
		this.cantidad = cantidad;
	}
	/**
	 * Este metodo le encuentra la pareja al usuario actual
	 * @throws NullPointerException
	 * @throws PopularException
	 * @throws SexualidadException
	 * @throws SolitarioException
	 */
	public void hacerMatch() throws NullPointerException, PopularException, SexualidadException, SolitarioException {
		Usuario pareja = null;
		if(raiz!=null) {
			pareja = raiz;
			pareja = raiz.HacerMatch(pareja);
		}
		actual.emparejar(pareja);
	}
	/**
	 * Este metodo permite inicializar el estado del usuario actual
     * @param foto /String ruta de la imagen
	 * @param nombre /String nombre del usuario
	 * @param genero /String genero del usuario
	 * @param idSexual/ String id del usuario
	 * @param carrera /String carrera del usuario
	 * @param altura /double altura dle usuario
	 * @param edad /int edad del usuario
	 * @param semestre /int semestre del usuario
	 */
	public void registrarUsuario(String foto, String nombre, String genero, String idSexual, String carrera, double altura, int edad, int semestre){
		if(genero.equals(Mujer.MUJER)) {
			actual = new Mujer(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', foto, nombre, idSexual, carrera, altura, edad, semestre);
		}else if(genero.equals(Hombre.HOMBRE)) {
			actual = new Hombre(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', foto, nombre, idSexual, carrera, altura, edad, semestre);
		}else {
			actual = new Hermafrodita(' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', foto, nombre, idSexual, carrera, altura, edad, semestre);
		}
	}
	/**
	 * Este metodo me permite cambiar el estado de la pregunta que se esta respondiendo
	 * @param cual /int numero de la pregunta
	 * @param responde/ char respuesta de  la pregunta
	 */
	public void responder(int cual, char responde) {
		if(cual==1) {
			actual.setPriPregunta(responde);
		}
		if(cual==2) {
			actual.setSegPregunta(responde);		
		}
		if(cual==3) {
			actual.setTerPregunta(responde);
		}
		if(cual==4) {
			actual.setCuarPregunta(responde);
		}
		if(cual==5) {
			actual.setQuinPregunta(responde);
		}
		if(cual==6) {
			actual.setSexPregunta(responde);
		}
		if(cual==7) {
			actual.setSepPregunta(responde);
		}
		if(cual==8) {
			actual.setOctPregunta(responde);
		}
		if(cual==9) {
			actual.setNovPregunta(responde);
		}
		if(cual==10) {
			actual.setDecPregunta(responde);
			
		}
	}
	
	//------------------//
	public void AgregarActual() {
		if(raiz!=null) {
			raiz.agregarUsuario(Usuario actual);
		}else {
			raiz = actual;
		}
	}
	
	//------------------//
	public void resetear() {
		if(raiz!=null) {
			raiz.reseteador(){
				
			}
		}
	}
	@Override
	/**
	 * Metodod compare de la interfaz comparator
	 */
	public int compare(Usuario u1, Usuario u2) {
		return u1.getCoincidencias()-u2.getCoincidencias();
	}

}
