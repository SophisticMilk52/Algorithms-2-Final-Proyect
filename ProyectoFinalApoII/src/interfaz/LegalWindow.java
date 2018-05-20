package interfaz;

import java.awt.BorderLayout;
import javax.swing.JDialog;

/**
 * Esta clase pretende ofrecer la ventana visible que contendrá el diseño que ofrecerá el "PanelLegal", donde el usuario podrá visualizar y aceptar, o no, los terminos del software 
 */
public class LegalWindow extends JDialog{
	
	/**
	 * Relaciones entre clases
	 */
	public PanelLegal pLegal;//Relación con la clase PanelLegal

	public LegalWindow(Principal p) {
		super(p);
		
		pLegal=new PanelLegal(p);
		setTitle("Match Icesi");
		setSize(750,700);
		setVisible(true);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		add(pLegal,BorderLayout.CENTER);
	}

}
