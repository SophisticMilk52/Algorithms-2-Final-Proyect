package interfaz;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import java.awt.CardLayout;

import javax.swing.JFrame;

import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Principal extends JFrame{

	public static final String STARTPANEL="panel_start_window";
	public static final String LEGALPANEL="panel_legal";																																
	public static final String LOGINPANEL="panel_login";
	public static final String MENUPANEL="panel_menu";
	
	private JPanel panelGlobal;
	private PanelStartWindow pStartWindow;
	private PanelLegal pLegal;
	private PanelMenu pMenu;
	
	public Principal() {
		setLayout(new BorderLayout());
		
		setSize(990,990);
		setTitle("Evaluador de compatibilidad");
		setResizable(false);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pStartWindow=new PanelStartWindow(this);
		pLegal=new PanelLegal(this);
		
		panelGlobal=new JPanel(new CardLayout());
		panelGlobal.add(pStartWindow,STARTPANEL);
		panelGlobal.add(pLegal,LEGALPANEL);
		panelGlobal.add(pMenu,MENUPANEL);
		
		add(panelGlobal,BorderLayout.CENTER);;
	}



	public static void main(String[] args) {
//hola
	//si van a trabajar en una classe escriban en esta parte: ej, estoy trabajando en la clase Principal
	// esto sinifica que nadie puede trabajar sobre esa clase, saludos cuidense y me avisan si no saben o entienden el diagrama 
		
		/*No estaba seguro si escribir sobre esta clase, pues no sabía si alguien estaba trabajando en ella. Ṕero
		como no se editaba hace tiempo, decidí hacerlo.*/
		
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        	} catch (Exception ex) {
            		ex.printStackTrace();
        	}
		Principal p = new Principal();
		P.setVisible(true);
	}
	
	public void mostrarPanelLegal() {
		CardLayout cl=(CardLayout)panelGlobal.getLayout();
		cl.show(panelGlobal,LEGALPANEL);
	}
	
	public void mostrarPanelLogin() {
		CardLayout cl=(CardLayout)panelGlobal.getLayout();
		cl.show(panelGlobal,LOGINPANEL);
	}
	
	public void mostrarPanelMenu() {
		CardLayout cl=(CardLayout)panelGlobal.getLayout();
		cl.show(panelGlobal,MENUPANEL);
	}
	
	public void cerraLogInWindow() {
		pLegal.cerrarLogInWindow();
	}	
	
	public void cerrarSignUpWindow() {
		pLegal. cerrarSignUp();
	}
	
	public void mostrarLogInWindow() {
		pLegal.mostrarLogInWindow();
	}
}
