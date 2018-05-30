package interfaz;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import javax.swing.UIManager;

import mundo.IcesiMatch;
import mundo.Pregunta;
import mundo.Usuario;

/**
 * Esta clase es la clase principal del paquete interfaz. Es la que ejecutará la parte visible del programa y contendrá los métodos de una clase especifica y que vayan a ser necesitados por otras
 */
public class Principal extends JFrame{
	
	//RELACIONES//
	/**
	 * Relacion con la clase LegalWindow
	 */
	private LegalWindow lw;
	/**
	 * Relacion con la clase PanelPreguntas
	 */
	private PanelPreguntas pPreguntas;
	/**
	 * Relacion con la clase UsuarioWindow
	 */
	private UsuarioWindow uw;
	/**
	 * Relacion con la clase icesimatch
	 */
	private IcesiMatch im;
	
	public Principal() {
		setLayout(new BorderLayout());
		
		setSize(790,700);
		setTitle("Evaluador de compatibilidad");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pPreguntas=new PanelPreguntas(this);
		lw=new LegalWindow(this);
		uw=new UsuarioWindow(this);
		im=new IcesiMatch();
		
		lw.mostrarVentanaLegal();
		
		add(pPreguntas,BorderLayout.CENTER);;
	}



	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        	} catch (Exception ex) {
            		ex.printStackTrace();
        	}
		Principal p = new Principal();
	}
	
	public void cerrarVentanaLegal() {
		lw.cerrarVentanaLegal();
	}
	/**	
	 * Este método cierra la ventana principal y termina sus procesos.
	 * <b>post:</b> Se ha cerrado la ventana pricipal.<br>
	 */
	public void cerrarVentanaPrincipal() {
		System.exit(0);
	}
	/**
	 * Método perteneciente a la clase PanelUsuario (vease en dicha clase para su contrato). Se traslada a "Principal" con el fin de que la clase diferente que lo requiera. lo utilice facilmente
	 */
	public void setTextSexo(String d) {
		uw.pUsuario.setTextSexo(d);
	}
	
	public String  getTexto() {
		return uw.pUsuario.getText();
	}
	
	/**
	 * Método perteneciente a la clase PanelUsuario (vease en dicha clase para su contrato). Se traslada a "Principal" con el fin de que la clase diferente que lo requiera. lo utilice facilmente
	 */
	public java.awt.Image  getFondoUsuario() {
		return uw.pUsuario.getFondoUsuario();
	}
	/**
	 * Método perteneciente a la clase UsuarioWindow (vease en dicha clase para su contrato). Se traslada a "Principal" con el fin de que la clase diferente que lo requiera. lo utilice facilmente
	 */
	public void cerrarVentanaUsuario() {
		uw.cerrarVentanaUsuario();
	}
	/**
	 * Método perteneciente a la clase UsuarioWindow (vease en dicha clase para su contrato). Se traslada a "Principal" con el fin de que la clase diferente que lo requiera. lo utilice facilmente
	 */
	public void mostrarVentanaUsuario() {
		uw.mostrarVentanaUsuario();
	}
	
	public void insertarPregunta() {
		pPreguntas.insertarPregunta();
	}
	
	public void insertarRespuestas() {
		pPreguntas.insertarRespuestas();
	}
	
	//METODOS DEL MUNDO//
	
	public void agregarUsuario(Usuario actual) {
		im.getRaiz().agregarUsuario(actual);
	}
	
	public Pregunta darPreguntaActual() {
		return im.getInicio();
	}
	
	public void setPreguntaActual(Pregunta act) {
		im.setInicio(act);
	}
	
}
