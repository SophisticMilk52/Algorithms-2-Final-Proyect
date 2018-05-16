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

public class PanelUsuario extends JPanel implements ActionListener{
  
  public static final String SELECC="seleccionar";
  public static final String ACEPTAR="aceptar";
  public static final String FONDO_MASCULINO="images/fondoMasculino.png";
  public static final String FONDO_FEMENINO="images/fondoFemenino.png";
  public static final String FONDO_HEMA="images/fondoLegal.png";
	
  private JLabel JLnombre,JLidSexual,JLcarrera,JLaltura,JLedad,JLsemestre,JLfoto,sexo,JLfotoMarco;
  private JTextField JTnombre,JTidSexual,JTcarrera,JTaltura,JTedad,JTsemestre;
  private JButton JBseleccionar,JBaceptar;
  private Image fondo;
  private JPanel pAuxFoto,pDatos;
	
  private Principal p;
	
  public PanelLogIn(Principal p) {
		this.p=p;

		setLayout(new BorderLayout());
		
		JLabel l1=new JLabel();
	
		pAuxFoto=new JPanel();
		pAuxFoto.setLayout(new GridLayout(1,2));
		pAuxFoto.setOpaque(false);
		pAuxFoto.setPreferredSize(new Dimension(200,300));
		pDatos=new JPanel();
		pDatos.setLayout(new GridLayout(7,2));
		pDatos.setOpaque(false);
		pDatos.setSize(400,700);
		
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
	
	public void decidirFondo() {
		if(sexo.getText().equals(PanelLegal.MASC))
			fondo=new ImageIcon(FONDO_MASCULINO).getImage();
		else if(sexo.getText().equals(PanelLegal.FEMEN))
			fondo=new ImageIcon(FONDO_FEMENINO).getImage();
		else
			fondo=new ImageIcon(FONDO_HEMA).getImage();
	}
	
	public void setTextSexo(String d) {
		sexo.removeAll();
		sexo.setText(d);
	}
  
  @Override
	public void actionPerformed(ActionEvent a) {
		String comando=a.getActionCommand();
	}
  
  @Override
	public void paint(Graphics g) {
		decidirFondo();
		g.drawImage(fondo,0,0,getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
}
