package interfaz;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;

public class PanelLogIn extends JPanel implements ActionListener{
  
  public static final String INGRESAR="in";
	public static final String REGISTRARSE="up";
	
  private Principal p;
	private JTextField usuario;
	private JPasswordField contraseña;
	private JButton ingresar,registrarse;
	private JLabel logo,etiqueta;
	private Image fondo;
	private SignUpWindow sw;
	
  public PanelLogIn(Principal p) {
		this.p=p;
		
		sw=new SignUpWindow(p);
		
		setLayout(new GridBagLayout());
		
		fondo=new ImageIcon("images/fondoLegal.png").getImage();
		
		JLabel lat=new JLabel();
		JLabel lat2=new JLabel();
		JLabel lat3=new JLabel();
	
		logo=new JLabel();
		logo.setSize(170,170);
		ImageIcon imagen=new ImageIcon("images/logo.png");
		Icon logoImagen=new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(),logo.getHeight(),Image.SCALE_DEFAULT));
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(logoImagen);
		
		usuario=new JTextField("usuario");
		usuario.setPreferredSize(new Dimension(0,10));
		
		contraseña=new JPasswordField();
		contraseña.setPreferredSize(new Dimension(0,10));
		
		ingresar=new JButton("Ingresar");
		ingresar.setActionCommand(INGRESAR);
		ingresar.addActionListener(this);
		
		etiqueta=new JLabel("no tienes una cuenta?");
		etiqueta.setHorizontalAlignment(SwingConstants.RIGHT);
		
		registrarse=new JButton("Registrarse");
		registrarse.setActionCommand(REGISTRARSE);
		registrarse.addActionListener(this);
		
		GridBagConstraints gbc=new GridBagConstraints();
		
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.gridwidth=5;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(logo,gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=9;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(lat,gbc);
		
		gbc.gridx=7;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=9;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(lat2,gbc);
		
		gbc.gridx=1;
		gbc.gridy=3;
		gbc.gridwidth=5;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(usuario,gbc);
		
		gbc.gridx=1;
		gbc.gridy=5;
		gbc.gridwidth=5;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(contraseña,gbc);
		
		gbc.gridx=1;
		gbc.gridy=6;
		gbc.gridwidth=5;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(ingresar,gbc);
		
		gbc.gridx=1;
		gbc.gridy=7;
		gbc.gridwidth=5;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(lat3,gbc);
		
		gbc.gridx=1;
		gbc.gridy=8;
		gbc.gridwidth=3;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(etiqueta,gbc);
		
		gbc.gridx=4;
		gbc.gridy=8;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(registrarse,gbc);
		
		gbc.gridx=4;
		gbc.gridy=8;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(registrarse,gbc);
	}
  
  @Override
	public void actionPerformed(ActionEvent a) {
		String comando=a.getActionCommand();
		if(comando.equals(INGRESAR)) {
			p.setVisible(true);
			p.cerraLogInWindow();
			p.mostrarPanelMenu();
		}
		else if(comando.equals(REGISTRARSE)) {
			sw.setVisible(true);
			p.cerraLogInWindow();
		}
	}
  
  @Override
	public void paint(Graphics g) {
		g.drawImage(fondo,0,0,getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	
	public void cerrarSignUpWindow() {
		sw.dispose();
	}
  
}
