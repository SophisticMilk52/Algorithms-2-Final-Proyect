package interfaz;

import javax.swing.JDialog;
import java.awt.BorderLayout;
/**
 * Esta clase pretende ofrecer la ventana visible que contendrá el diseño que ofrecerá el "PanelUsuario", donde el usuario tendrá que digitar la información que se le pida
 */
public class UsuarioWindow extends JDialog{
	/**
	 * Relacion entre clases
	 */
	public PanelUsuario pUsuario;//relación con la clase PanelUsuario
	
	public UsuarioWindow(Principal p) {
		super(p);
		
		pUsuario=new PanelUsuario(p);
		setTitle("Ingrese");
		setSize(700,800);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		
		add(pUsuario,BorderLayout.CENTER);
	}
	/**
	 * Este método cierra la ventana de donde el usuario registrará sus datos (UsuarioWindow)
	 *  <b>post:</b> Se ha cerrado la ventana.<br>
	 */
	public void mostrarVentanaUsuario() {
		setVisible(true);
	}
	
	public void cerrarVentanaUsuario() {
		dispose();
	}
}
