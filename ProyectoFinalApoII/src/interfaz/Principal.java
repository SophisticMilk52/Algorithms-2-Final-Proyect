package interfaz;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import javax.swing.UIManager;

/**
 * Esta clase es la clase principal del paquete interfaz. Es la que ejecutará la parte visible del programa y contendrá los métodos de una clase especifica y que vayan a ser necesitados por otras
 */
public class Principal extends JFrame{
	
	/**
	 * Relaciones entre clases
	 */
	private LegalWindow lw;//Relación con la clase LegalWindow
	private PanelPreguntas pPreguntas;//Relación con la clase PanelPreguntas
	
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
	
	public void cerrarLegalWindow() {
		lw.dispose();
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
		lw.pLegal.uw.pUsuario.setTextSexo(d);
	}
	/**
	 * Método perteneciente a la clase PanelUsuario (vease en dicha clase para su contrato). Se traslada a "Principal" con el fin de que la clase diferente que lo requiera. lo utilice facilmente
	 */
	public java.awt.Image  getFondoUsuario() {
		return lw.pLegal.uw.pUsuario.getFondoUsuario();
	}
	/**
	 * Método perteneciente a la clase PanelLegal (vease en dicha clase para su contrato). Se traslada a "Principal" con el fin de que la clase diferente que lo requiera. lo utilice facilmente
	 */
	public void cerrarVentanaUsuario() {
		lw.pLegal.cerrarVentanaUsuario();
	}
	
}
