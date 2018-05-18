package interfaz;

import java.awt.BorderLayout;
import javax.swing.JDialog;

public class LegalWindow extends JDialog{
	
	public PanelLegal pLegal;

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
