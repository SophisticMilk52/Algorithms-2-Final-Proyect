package interfaz;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PanelLegal extends JPanel{
	
	private JButton deAcuerdo;
	private JButton desacuerdo;
	private JTextPane contrato;
	private Principal p;
	
	public PanelLegal(Principal p) {
		this.p=p;
		
		setLayout(null);
		
		Icon icono=new ImageIcon("images/iconAgree.png");
		deAcuerdo=new JButton();
		deAcuerdo.setBounds(600,720, 120,100);
		deAcuerdo.setIcon(icono);
		
		icono=new ImageIcon("images/iconDisagree.png");
		desacuerdo=new JButton();
		desacuerdo.setBounds(300,720, 120, 100);
		desacuerdo.setIcon(icono);
		
		contrato=new JTextPane();
		contrato.setBounds(210, 150, 600, 400);
		contrato.setEditable(false);
		contrato.setText("EL SIGUIENTE PROGRAMA LE DARA LA OPCION DE AGREGAR SU INFORMACION, Y SE RECOLECTARA EN NUESTRA BASE DE DATOS. ESTO PARA UN MEJOR Y MAS DETALLADO RESULTADO EN CUANTO AL FILTRO"
				+ " SU INFORMACION PERSONAL NO SERA COMPARTIDA NI NEGOCIADA A TERCEROS, SOLO SERA UTILIZADA PARA EL FIN DE MEJORAR LA CALIDAD DE LOS RESULTADOS QUE LE DARA EL PROGRAMA"
				+ " Y BLA BLA ... CONTINUARA");
		
		add(desacuerdo);
		add(deAcuerdo);	
		add(contrato);
	}

}
