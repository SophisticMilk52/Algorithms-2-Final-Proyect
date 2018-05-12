package interfaz;

import javax.swing.JDialog;
import java.awt.BorderLayout;

public class LogInWindow extends JDialog{

	public PanelLogIn pLogIn;
	
	public LogInWindow(Principal p) {
		super(p);
		
		pLogIn=new PanelLogIn(p);
		setTitle("Registrese");
		setSize(750,450);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		
		add(pLogIn,BorderLayout.CENTER);
	}
}
