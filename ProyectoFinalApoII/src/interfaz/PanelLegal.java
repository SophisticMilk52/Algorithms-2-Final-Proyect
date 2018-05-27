package interfaz;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Esta clase pretende ofrecer el diseño de la ventana de los terminos del software (LegalWindow).
 */
public class PanelLegal extends JPanel implements ActionListener{
	
	/**
	 * Constantes
	 */
	public static final String DE_ACUERDO="yes";
	public static final String DESACUERDO="no";
	public static final String MASC="masculino";
	public static final String FEMEN="femenino";
	public static final String HEMA="hemafrodita";
	
	/**
	 * Variables privadas
	 */
	private JButton BTdeAcuerdo;//Variable de tipo JButton. Representa el botón con el que el usuario estará de acuerdo con los terminos del softwareen en caso de oprimirlo
	private JButton BTdesacuerdo;//Variable de tipo JButton. Representa el botón con el que el usuario estará desacuerdo con los terminos del softwareen en caso de oprimirlo
	private JTextPane JTcontrato;//Variable de tipo JTextPane. Representa el espacio donde estarán escritos los terminos del software
	private Image fondo;//Variable de tipo Image. Representa el fondo que tendrá el panel
	private JLabel JLlogo;//Variable de tipo JLabel. Representra el logo en el panel
	private JButton BTmasculino,BTfemenino,BThema;
	
	/**
	 * Relaciones entre clases
	 */
	private Principal p;//Relación con la clase Principal 
	public UsuarioWindow uw;//Relación con la clase UsuarioWindow
	
	public PanelLegal(Principal p) {
		this.p=p;
		
		setLayout(new GridBagLayout());
		
		uw=new UsuarioWindow(p);
		
		fondo=new ImageIcon("images/fondoLegal.png").getImage();
		
		//los siguientes labels tienen la utilidad de brindar los espacios laterales de la ventana y entre los objetos
		//En realidad no son necesarios con el layout que se utiliza, pero me es más facil diseñar la ventana de esta forma, pues estamos hablando 
		//de un layout un tanto complejo de aprender a plenitud, y pues como saben, estamos cortos de tiempo.
		
		JLabel l1=new JLabel();
		JLabel l2=new JLabel();
		JLabel l3=new JLabel();
		JLabel l4=new JLabel();
		JLabel l5=new JLabel();
		
		JLlogo=new JLabel();
		JLlogo.setSize(250,250);
		ImageIcon imagen=new ImageIcon("images/logo.png");
		Icon logoImagen=new ImageIcon(imagen.getImage().getScaledInstance(JLlogo.getWidth(),JLlogo.getHeight(),Image.SCALE_DEFAULT));
		JLlogo.setHorizontalAlignment(SwingConstants.CENTER);
		JLlogo.setIcon(logoImagen);
		
		Icon icono=new ImageIcon("images/iconAgree.png");//creación de icono, objeto de tipo Icon
		BTdeAcuerdo=new JButton();
		BTdeAcuerdo.setIcon(icono);
		BTdeAcuerdo.setActionCommand(DE_ACUERDO);
		BTdeAcuerdo.addActionListener(this);
		
		icono=new ImageIcon("images/iconDisagree.png");//reutilización de icono
		BTdesacuerdo=new JButton();
		BTdesacuerdo.setIcon(icono);
		BTdesacuerdo.setActionCommand(DESACUERDO);
		BTdesacuerdo.addActionListener(this);
		
		Image iconosSexo=new ImageIcon("images/hombre.png").getImage();//creación de iconosSexo, objeto de tipo Icon
		BTmasculino=new JButton();
		BTmasculino.setSize(80,80);
		icono=new ImageIcon(iconosSexo.getScaledInstance(BTmasculino.getWidth(),BTmasculino.getHeight(),Image.SCALE_DEFAULT));//reutilización de icono
		BTmasculino.setActionCommand(MASC);
		BTmasculino.addActionListener(this);
		BTmasculino.setIcon(icono);
		
		iconosSexo=new ImageIcon("images/mujer.png").getImage();//reutilización de iconosSexo
		BTfemenino=new JButton();
		BTfemenino.setSize(80,80);
		icono=new ImageIcon(iconosSexo.getScaledInstance(BTfemenino.getWidth(),BTfemenino.getHeight(),Image.SCALE_DEFAULT));//reutilización de icono
		BTfemenino.setActionCommand(FEMEN);
		BTfemenino.addActionListener(this);
		BTfemenino.setIcon(icono);
		
		iconosSexo=new ImageIcon("images/hema.png").getImage();//reutilización de iconosSexo
		BThema=new JButton();
		BThema.setSize(80,80);
		icono=new ImageIcon(iconosSexo.getScaledInstance(BThema.getWidth(),BThema.getHeight(),Image.SCALE_DEFAULT));//reutilización de icono
		BThema.setActionCommand(HEMA);
		BThema.addActionListener(this);
		BThema.setIcon(icono);
		
		JTcontrato=new JTextPane();
		JTcontrato.setEditable(false);
		JTcontrato.setText("EL SIGUIENTE PROGRAMA LE DARA LA OPCION DE AGREGAR SU INFORMACION, Y SE RECOLECTARA EN NUESTRA BASE DE DATOS. ESTO PARA UN MEJOR Y MAS DETALLADO RESULTADO EN CUANTO AL FILTRO"
				+ " SU INFORMACION PERSONAL NO SERA COMPARTIDA NI NEGOCIADA A TERCEROS, SOLO SERA UTILIZADA PARA EL FIN DE MEJORAR LA CALIDAD DE LOS RESULTADOS QUE LE DARA EL PROGRAMA"
				+ " Y BLA BLA ... CONTINUARA");
		
		GridBagConstraints gbc=new GridBagConstraints();//este objeto nos permitirá editar los parámetros de su clase de manera directa (sin necesidad de recurrir a metodos set) 
														//para que con éstos, ajustemos dónde y qué tamaño tendrá el objeto que le agreguemos 
		
		gbc.gridx=0;//posición x en la malla
		gbc.gridy=0;//posición y en la malla
		gbc.gridwidth=1;//número de columnas que ocupará el objeto
		gbc.gridheight=13;//número de filas que ocupará el objeto
		gbc.weightx=1.0;//con esto la parte horizontal donde está contenido el objeto crecerá o disminuirá con relación al crecimiento o decremento de la ventana
		gbc.weighty=1.0;//con esto la parte vertical donde está contenido el objeto crecerá o disminuirá con relación al crecimiento o decremento de la ventana
		gbc.fill=GridBagConstraints.BOTH;
		add(l1,gbc);//se agrega el objeto al layout
		
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.gridwidth=8;
		gbc.gridheight=3;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(JLlogo,gbc);

		gbc.gridx=10;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=13;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(l2,gbc);
		
		gbc.gridx=1;
		gbc.gridy=3;
		gbc.gridwidth=8;
		gbc.gridheight=5;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(JTcontrato,gbc);
		
		gbc.gridx=1;
		gbc.gridy=11;
		gbc.gridwidth=8;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(l3,gbc);
		
		gbc.gridx=1;
		gbc.gridy=12;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.NONE;
		gbc.anchor=GridBagConstraints.CENTER;
		add(BTdesacuerdo,gbc);
		
		gbc.gridx=2;
		gbc.gridy=12;
		gbc.gridwidth=6;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(l4,gbc);
		
		gbc.gridx=8;
		gbc.gridy=12;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.NONE;
		gbc.anchor=GridBagConstraints.CENTER;
		add(BTdeAcuerdo,gbc);
		
		gbc.gridx=1;
		gbc.gridy=13;
		gbc.gridwidth=8;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(l5,gbc);
	}
	/**
	 * Este método muestra una ventana (JOptionPane) la cual tiene las opciones del sexo que el suario puede elegir
	 * <b>post:</b> Se muestra en pantalla la ventana (JOptioPane).<br>
	 */
	public void mostrarVentanaSexo() {		
		JButton[] opciones = {BThema,BTmasculino,BTfemenino};
        	JOptionPane.showOptionDialog(null, "Seleccione: ", "Sexo", 0, 0,new ImageIcon("images/logoMini.png"), opciones,null);
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
			p.cerrarVentanaLegal();
			mostrarVentanaSexo();
		}
		else if(comando.equals(DESACUERDO)) {
			p.cerrarVentanaLegal();
			p.cerrarVentanaPrincipal();
		}
		else if(comando.equals(MASC)) {
			p.setTextSexo(MASC);
			p.mostrarVentanaUsuario();
			//JOptionPane.getRootFrame().dispose();   
		}
		else if(comando.equals(FEMEN)) {
			p.setTextSexo(FEMEN);
			p.mostrarVentanaUsuario();
			//JOptionPane.getRootFrame().dispose();   
		}
		else if(comando.equals(HEMA)) {
			p.mostrarVentanaUsuario();
			 
		}
		JOptionPane.getRootFrame().dispose();  
	}
}
