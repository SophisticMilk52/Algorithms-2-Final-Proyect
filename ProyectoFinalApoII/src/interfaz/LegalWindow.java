package interfaz;

import java.awt.BorderLayout;
import javax.swing.JDialog;

/**
 * Esta clase pretende ofrecer la ventana visible que contendrá el diseño que ofrecerá el "PanelLegal", donde el usuario podrá visualizar y aceptar, o no, los terminos del software 
 */
public class LegalWindow extends JDialog{
	
	//RELACIONES ENTRE CLASES//
	/**
	 * Relacion con la clase PanelLegal
	 */
	public PanelLegal pLegal;
	
	//CONSTRUCTOR
	/**
	 * constructor de la clase LegalWindow
	 * @param p objeto de tipo Principal que sirve como conexion a la clase Principal
	 */
	public LegalWindow(Principal p) {
		super(p);
		
		pLegal=new PanelLegal(p);
		setTitle("Match Icesi");
		setSize(750,700);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		add(pLegal,BorderLayout.CENTER);
	}
	/**	
	 * Este método cierra la ventana (JDialog) en donde se encontrará el contrato para el usuario.
	 * <b>post:</b> Se ha cerrado la ventana de contrato (JDialog).<br>
	 */
	public void cerrarVentanaLegal() {
		dispose();
	}
	/**	
	 * Este método muestra la ventana (JDialog) en donde se encontrará el contrato para el usuario.
	 * <b>post:</b> Se ha cerrado la ventana de contrato (JDialog).<br>
	 */
	public void mostrarVentanaLegal() {
		setVisible(true);
	}

}
