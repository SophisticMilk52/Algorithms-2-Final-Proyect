package interfaz;

import javax.swing.JDialog;
import java.awt.BorderLayout;

public class UsuarioWindow extends JDialog{

	public PanelUsuario pUsuario;
	
	public UsuarioWindow(Principal p) {
		super(p);
		
		pUsuario=new PanelUsuario(p);
		setTitle("Ingrese");
		setSize(700,800);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		
		add(pUsuario,BorderLayout.CENTER);
	}
}
