package interfaz;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

public class PanelUsuario extends JPanel implements ActionListener{

  //CONSTANTES//	
  /**
   * constante que representa la opcion de seleccionar
   */
  public static final String SELECC="seleccionar";
  /**
   * constante que representa la opcion de aceptar
   */
  public static final String ACEPTAR="aceptar";
  /**
   * constante que representa la ruta del la imagen del fondo para el sexo masculino
   */
  public static final String FONDO_MASCULINO="images/fondoMasculino.png";
  /**
   * constante que representa la ruta del la imagen del fondo para el sexo femenino
   */
  public static final String FONDO_FEMENINO="images/fondoFemenino.png";
  /**
   * constante que representa la ruta del la imagen del fondo para los hemafroditas
   */
  public static final String FONDO_HEMA="images/fondoLegal.png";

  //VARIABLES PRIVADAS//
  
/*
  private JLabel JLnombre;
 
  private JLabel JLidSexual;
 
  private JLabel JLcarrera;
  
  private JLabel JLaltura;
 
  private JLabel JLedad;
  
  private JLabel JLsemestre;
  
  private JLabel JLfoto;*/
  
  /**
   * Varible de tipo JLabel. Representa el sexo que ha elegido el usuario
   */
  private JLabel sexo;
  /**
   * Variable de tipo Jlabel. Representa el contendor de la imagen que el usuario elija como su avatar
   */
  private JLabel JLfotoMarco;
  /**
   * Variable de tipo JTextField. Representa el espacio donde el usuario podrá digitar su nombre
   */
  private JTextField JTnombre;
  /**
   * Variable de tipo JTextField. Representa el espacio donde el usuario podrá digitar su carrera
   */
  private JTextField JTcarrera;
  /**
   * Variable de tipo JTextField. Representa el espacio donde el usuario podrá digitar su altura
   */
  private JTextField JTaltura;
  /**
   * Variable de tipo JTextField. Representa el espacio donde el usuario podrá digitar su edad
   */
  private JTextField JTedad;
  /**
   * Variable de tipo JTextField. Representa el espacio donde el usuario podrá digitar su semestre
   */
  private JTextField JTsemestre;
  /**
   * Varible de tipo JButton. Representa el boton que le dara la opcion al usuario de escojer la imagen para su avatar
   */
  private JButton JBseleccionar;
  /**
   * Variable de tipo JButton. Representa el boton que le dara la opcion al usuario de registrar su informacion y continuar con la siguiente fase del programa (la encuesta)
   */
  private JButton  JBaceptar;
  /**
   * Variable de tipo Image. Representa la imagen de fondo que tendra la ventana
   */
  private Image fondoUsuario;
  /*
  private JPanel pAuxFoto;
 
  private JPanel  pDatos;*/
  
  /**
   * Variable de tipo JComboBox. Representa las opciones que tiene el usuario en cuanto a orientacion sexual
   */
  private JComboBox box;
  /**
   * 
   */
  private JFileChooser file;
  /**
   * Variable de tipo File. Representa el archivo (imagen) que el usuario seleccionó para su avatar
   */
  private File archivo;
  /**
   * Variable de tipo String. Representa el nombre del archivo (imagen) seleccionado por el usuario
   */
  private String nombrearchivo;
  /**
   * Variable de tipo String. Representa la ruta del archivo (imagen) seleccionado por el usuario
   */
  private String rutaimagen;
  /**
   * Variable de tipo ImageIcon. Representa el icono que representa al programa
   */
  private ImageIcon icono;
	
  //RELACIONES ENTRE CLASES//
  /**
   * Relación con la clase Principal
   */
  private Principal p;
  
  //CONSTRUCTOR//
  /**
   * constructor de la clase PanelUsuario
   * @param p objeto de tipo Principal que sirve como conexion a la clase Principal
   */
  public PanelUsuario(Principal p) {
		this.p=p;
		setLayout(new BorderLayout());
		JPanel pAuxFoto=new JPanel();
		pAuxFoto.setLayout(new GridLayout(1,2));
		pAuxFoto.setOpaque(false);
		pAuxFoto.setPreferredSize(new Dimension(200,300));
	
		JPanel pDatos=new JPanel();
		pDatos.setLayout(new GridLayout(7,2));
		pDatos.setOpaque(false);
		
		pAuxFoto=new JPanel();
		pAuxFoto.setLayout(new GridLayout(1,2));
		pAuxFoto.setOpaque(false);
		pAuxFoto.setPreferredSize(new Dimension(200,300));
		pDatos=new JPanel();
		pDatos.setLayout(new GridLayout(7,2));
		pDatos.setOpaque(false);
		pDatos.setSize(400,700);
		
		JLabel JLfoto=new JLabel("Foto: ");
		JLabel JLnombre=new JLabel("Nombre: ");
		JLabel JLidSexual=new JLabel("Orientacion sexual: ");
		JLabel JLcarrera=new JLabel("Carrera: ");
		JLabel JLaltura=new JLabel("Altura: ");
		JLabel JLedad=new JLabel("Edad: ");
		JLabel JLsemestre=new JLabel("Semestre");
		sexo=new JLabel();
		
		JTnombre=new JTextField();
		box=new JComboBox();
		box.addItem("Bisexual");
		box.addItem("Heterosexual");
		box.addItem("Homosexual");
		JTcarrera=new JTextField();
		JTaltura= new JTextField();
		JTedad= new JTextField();
		JTsemestre=new JTextField();
		
		JBseleccionar=new JButton("Seleccionar");
		JBseleccionar.setActionCommand(SELECC);
		JBseleccionar.addActionListener(this);
		JBaceptar=new JButton("Aceptar");
		JBaceptar.setActionCommand(ACEPTAR);
		JBaceptar.addActionListener(this);
		
		
		pDatos.add(JLfoto);
		pDatos.add(JBseleccionar);
		pDatos.add(JLnombre);
		pDatos.add(JTnombre);
		pDatos.add(JLidSexual);
		pDatos.add(box);
		pDatos.add(JLcarrera);
		pDatos.add(JTcarrera);
		pDatos.add(JLaltura);
		pDatos.add(JTaltura);
		pDatos.add(JLedad);
		pDatos.add(JTedad);
		pDatos.add(JLsemestre);
		pDatos.add(JTsemestre);
		JLfotoMarco=new JLabel();
		JLfotoMarco.setSize(220,250);
		
		Image imagen=new ImageIcon("images/foto.jpg").getImage();
		icono=new ImageIcon(imagen.getScaledInstance(JLfotoMarco.getWidth(),JLfotoMarco.getHeight(),Image.SCALE_DEFAULT));
		JLfotoMarco.setIcon(icono);
	  
		JLabel l1=new JLabel();
		
		pAuxFoto.add(l1);
		pAuxFoto.add(JLfotoMarco);
		
		add(pAuxFoto,BorderLayout.NORTH);
		add(pDatos,BorderLayout.CENTER);
		add(JBaceptar,BorderLayout.SOUTH);
	}
	/**
	 * Este método decide el fondo de la ventana del usuario (PanelUsuario) según el sexo que éste haya elegido en la ventana anterior (LegalWindow).
	 * 	<b>pre:</b> el atributo JLabel sexo, esta inicializado.<br>
	 *  <b>post:</b> Se ha decidido el fondo  y se ha puesto en la ventana.<br>
	 */
	public void decidirFondo() {
		if(sexo.getText().equals(PanelLegal.MASC))
			fondoUsuario=new ImageIcon(FONDO_MASCULINO).getImage();
		else if(sexo.getText().equals(PanelLegal.FEMEN))
			fondoUsuario=new ImageIcon(FONDO_FEMENINO).getImage();
		else
			fondoUsuario=new ImageIcon(FONDO_HEMA).getImage();
	}
	/**
	 * Este método obtendrá por parámetro el sexo seleccionado por el usuario en la "ventanaSexo" (vease el método mostrarVentanaSexo en la clase PanelLegal) y lo pondrá en la variable "sexo" con el fin ésta siva como
	 * identificador para decidir el fondo en el método "decidirFondo".
	 * @param sexoS Es el sexo seleccionado por el usuario. De tipo String. sexoS != " ".
	 * <b>pre:</b> el atributo JLabel sexo, esta inicializado.<br>
	 * <b>post:</b> Se ha cambiado el valor de la variable "sexo".<br>
	 */
	public void setTextSexo(String d) {
		sexo.removeAll();
		sexo.setText(d);
	}
	
	/**
	 * Este metodo devuelve el contenido (texto) que tiene la variable sexo
	 * <b>pre:</b> el atributo JLabel sexo esta inicializado.<br>
	 * <b>post:</b> se ha obtenido el contenido de la variable sexo.<br>
	 * @return devuelve un String (texto) que representa el contenido de la variable sexo
	 */
	public String getText() {
		return sexo.getText();
	}
	
	/**
	 * Este método retornará un objeto de tipo Image, el cual representa el estado de la variable fondoUsuario, que decide el fondo que tendrá el panel.
	 * <b>post:</b> Se ha retornado el objeto de tipo Image.<br>
	 * @return se retorna un objeto de tipo Image que representa el fondo que tendrá el panel.
	 */
	public Image getFondoUsuario() {
		return fondoUsuario;
	}
	
	/**
	 * 
	 */
	public void choser() {
		FileNameExtensionFilter filter = new FileNameExtensionFilter(	
				"JPG & GIF Images", "jpg", "gif","png","jpeg");
		file=new JFileChooser("avatar");
		file.setFileFilter(filter);
		int returnVal = file.showOpenDialog(this);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			 archivo=file.getSelectedFile();
			modificarNombreArchivo(archivo.getName());
			System.out.println(archivo.getName());
			String ruta= archivo.getParent();
			rutaimagen=ruta+"/"+this.getNombrearchivo();
			System.out.println(rutaimagen);
			ImageIcon img= new ImageIcon(rutaimagen);
			int w= img.getIconWidth();
			int h=img.getIconHeight();
			icono = new ImageIcon(rutaimagen);
			this.JLfotoMarco.setIcon(icono);
			this.JLfotoMarco.setSize(w, h);
		}
	}
	
	/**
	 * Este metodo devuelve el valor (texto) de la variable rutaImagen
	 * <b>pre:</b> el atributo rutaImagen esta inicializado.<br>
	 * <b>post:</b> se ha obtenido el contenido de la variable rutaImagen.<br>
	 * @return devuelve un String (texto) que representa el contenido de la variable rutaImagen
	 */
	public String darRutaImagen() {
		return rutaimagen;
	}
	
	/**
	 * 
	 * @param nombrearchivo
	 */
	public void setNombrearchivo(String nombrearchivo) {
		this.nombrearchivo = nombrearchivo;
	}
	
	/**
	 * Este metodo devuelve el valor (texto) de la variable nombreArchivo
	 * <b>pre:</b> el atributo nombreArchivo esta inicializado.<br>
	 * <b>post:</b> se ha obtenido el contenido de la variable nombreArchivo.<br>
	 * @return devuelve un String (texto) que representa el contenido de la variable nombreArchivo
	 */
	public String getNombrearchivo() {
		return nombrearchivo;
	}
	
	/**
	 * Este metodo modifica el nombre del archivo 
	 * @param nom
	 */
	public void modificarNombreArchivo(String nom) {
		this.nombrearchivo=nom;
	}

  @Override
	public void actionPerformed(ActionEvent a) {
		String comando=a.getActionCommand();
		if(comando.equals((ACEPTAR))) {
			p.setVisible(true);
			p.cerrarVentanaUsuario();
		}else if( a.getActionCommand().equals(SELECC)) {
			this.choser();
	
		}
	}
  
  @Override
	public void paint(Graphics g) {
		decidirFondo();
		g.drawImage(fondoUsuario,0,0,getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
}

