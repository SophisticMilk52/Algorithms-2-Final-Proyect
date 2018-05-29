package interfaz;

import javax.swing.JDialog;
import java.awt.BorderLayout;
/**
 * Esta clase pretende ofrecer la ventana visible que contendrá el diseño que ofrecerá el "PanelUsuario", donde el usuario tendrá que digitar la información que se le pida
 */
public class UsuarioWindow extends JDialog{
	
	//RELACIONES ENTRE CLASES
	/**
	 * relación con la clase PanelUsuario
	 */
	public PanelUsuario pUsuario;
	
	//CONSTRUCTOR//
	/**
	 * constructor de la clase UsuarioWindow
	 * @param p objeto de tipo Principal que sirve como conexion a la clase Principal
	 */
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
	 * Este método muestra la ventana en donde el usuario registrará sus datos (UsuarioWindow)
	 *  <b>post:</b> Se ha mostrado la ventana.<br>
	 */
	public void mostrarVentanaUsuario() {
		setVisible(true);
	}
	/**
	 * Este método cierra la ventana en donde el usuario registrará sus datos (UsuarioWindow)
	 *  <b>post:</b> Se ha cerrado la ventana.<br>
	 */
	public void cerrarVentanaUsuario() {
		dispose();
	}
	
	public void refrescar() {
		pUsuario.repaint();
		pUsuario.revalidate();
	}
}
