/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Icesi (Cali - Colombia)
 * Proyecto Final Algoritmos Y Progamación 2
 * Autores: Cristian Gironza, Alejandro, Brayan
 * Todos los derechos reservados y para usos con fines educativos
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 **/

package mundo;

import java.io.*;

import java.util.*;

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
	
	public Usuario getRaiz() {
		return raiz;
	}

	public void setRaiz(Usuario raiz) {
		this.raiz = raiz;
	}

	public Pregunta getInicio() {
		return inicio;
	}

	public void setInicio(Pregunta inicio) {
		this.inicio = inicio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Usuario getActual() {
		return actual;
	}

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
			while(linea!=null) {
				if(aux==null) {
					cambio = new Pregunta(linea.split("/"));
					inicio = cambio;
					aux = inicio;
				}else {
					cambio = new Pregunta(linea.split("/"));
					aux.setSiguiente(cambio);
					aux = aux.getSiguiente();
				}
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
	
	
	public void guardar() {
		try {
			
		} catch (Exception e) {
			
		}	
	}
	
	public void contar() {
		int cantidad = 0;
		if(raiz!=null) {
			cantidad = raiz.contar();
		}
		this.cantidad = cantidad;
	}

	@Override
	public int compare(Usuario u1, Usuario u2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
