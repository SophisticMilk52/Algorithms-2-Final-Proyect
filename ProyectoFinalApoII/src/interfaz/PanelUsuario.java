package interfaz;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

/**
 *Esta clase pretende ofrecer el diseño de la ventana donde el usuario tendrá que digitar la información que se le pida 
 */
public class PanelUsuario extends JPanel implements ActionListener{
  
 /**
	 * Constantes
	 */
  public static final String SELECC="seleccionar";
  public static final String ACEPTAR="aceptar";
  public static final String FONDO_MASCULINO="images/fondoMasculino.png";
  public static final String FONDO_FEMENINO="images/fondoFemenino.png";
  public static final String FONDO_HEMA="images/fondoLegal.png";

/**
 * Variables privadas
*/
  private JLabel JLnombre,JLidSexual,JLcarrera,JLaltura,JLedad,JLsemestre,JLfoto,sexo,JLfotoMarco;
  private JTextField JTnombre,JTidSexual,JTcarrera,JTaltura,JTedad,JTsemestre;
  private JButton JBseleccionar,JBaceptar;
  private Image fondoUsuario;
  private JPanel pAuxFoto,pDatos;
/**
 * Relaciones entre clases
*/
  private Principal p;//Relación con la clase Principal
	
  public PanelUsuario(Principal p) {
		this.p=p;

		setLayout(new BorderLayout());
	
		pAuxFoto=new JPanel();
		pAuxFoto.setLayout(new GridLayout(1,2));
		pAuxFoto.setOpaque(false);
		pAuxFoto.setPreferredSize(new Dimension(200,300));
		pDatos=new JPanel();
		pDatos.setLayout(new GridLayout(7,2));
		pDatos.setOpaque(false);
		//pDatos.setSize(400,700);
		
		pAuxFoto=new JPanel();
		pAuxFoto.setLayout(new GridLayout(1,2));
		pAuxFoto.setOpaque(false);
		pAuxFoto.setPreferredSize(new Dimension(200,300));
		pDatos=new JPanel();
		pDatos.setLayout(new GridLayout(7,2));
		pDatos.setOpaque(false);
		pDatos.setSize(400,700);
		
		JLfoto=new JLabel("Foto: ");
		JLnombre=new JLabel("Nombre: ");
		JLidSexual=new JLabel("Orientacion sexual: ");
		JLcarrera=new JLabel("Carrera: ");
		JLaltura=new JLabel("Altura: ");
		JLedad=new JLabel("Edad: ");
		JLsemestre=new JLabel("Semestre");
		sexo=new JLabel();
		
		JTnombre=new JTextField();
		JTidSexual=new JTextField();
		JTcarrera=new JTextField();
		JTaltura= new JTextField();
		JTedad= new JTextField();
		JTsemestre=new JTextField();
		
		JBseleccionar=new JButton("Seleccionar...");
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
		pDatos.add(JTidSexual);
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
		Icon foto=new ImageIcon(imagen.getScaledInstance(JLfotoMarco.getWidth(),JLfotoMarco.getHeight(),Image.SCALE_DEFAULT));
		JLfotoMarco.setIcon(foto);
	  
		JLabel l1=new JLabel();
		
		pAuxFoto.add(l1);
		pAuxFoto.add(JLfotoMarco);
		
		add(pAuxFoto,BorderLayout.NORTH);
		add(pDatos,BorderLayout.CENTER);
		add(JBaceptar,BorderLayout.SOUTH);
	}
	/**
	 * Este método decide el fondo de la ventana del usuario (PanelUsuario) según el sexo que éste haya elegido en la ventana anterior (LegalWindow).
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
	 * <b>post:</b> Se ha cambiado el valor de la variable "sexo".<br>
	 */
	public void setTextSexo(String d) {
		sexo.removeAll();
		sexo.setText(d);
	}
	/**
	 * Este método retornará un objeto de tipo Image, el cual representa el estado de la variable fondoUsuario, que decide el fondo que tendrá el panel.
	 * <b>post:</b> Se ha retornado el objeto de tipo Image.<br>
	 * @return se retorna un objeto de tipo Image que representa el fondo que tendrá el panel.
	 */
	public Image getFondoUsuario() {
		return fondoUsuario;
	}
  
  @Override
	public void actionPerformed(ActionEvent a) {
		String comando=a.getActionCommand();
		if(comando.equals((ACEPTAR))) {
			p.setVisible(true);
			p.cerrarVentanaUsuario();
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
