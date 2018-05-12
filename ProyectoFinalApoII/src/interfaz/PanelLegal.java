package interfaz;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PanelLegal extends JPanel{
	
	public static final String DE_ACUERDO="yes";
	public static final String DESACUERDO="no";
	
	private JButton deAcuerdo;
	private JButton desacuerdo;
	private JTextPane contrato;
	private Principal p;
	private Image fondo;
	private LogInWindow lw;
	
	public PanelLegal(Principal p) {
		this.p=p;
		
		setLayout(null);
		
		lw=new LogInWindow(mw);
		
		fondo=new ImageIcon("images/fondoLegal.png").getImage();
		
		Icon icono=new ImageIcon("images/iconAgree.png");
		deAcuerdo=new JButton();
		deAcuerdo.setBounds(600,720, 120,100);
		deAcuerdo.setIcon(icono);
		deAcuerdo.setActionCommand(DE_ACUERDO);
		deAcuerdo.addActionListener(this);
		
		icono=new ImageIcon("images/iconDisagree.png");
		desacuerdo=new JButton();
		desacuerdo.setBounds(300,720, 120, 100);
		desacuerdo.setIcon(icono);
		desacuerdo.setActionCommand(DESACUERDO);
		desacuerdo.addActionListener(this);
		
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
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(fondo,0,0,getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	
	@Override
	public void actionPerformed(ActionEvent a) {
		String comando=a.getActionCommand();
		if(comando.equals(DE_ACUERDO)) {
			mw.setVisible(false);
			mostrarLogInWindow();		
		}
	}
	
	public void cerrarLogInWindow() {
		lw.dispose();
	}
	
	public void mostrarLogInWindow() {
		lw.setVisible(true);
	}
	
	public void cerrarSignUp() {
		lw.pLogIn.cerrarSignUpWindow();
	}

}
