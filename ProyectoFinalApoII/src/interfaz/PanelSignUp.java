package interfaz;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PanelSignUp extends JPanel implements ActionListener{
 
  private Principal p;
	private JTextField nombre, nickName;
	private JPasswordField contraseña,mismaContraseña;
	private JButton registrar, ingresar;
	private Image fondo;
	private JLabel logo,etiqueta;
  
  public PanelSignUp(Principal p) {
		this.p=p;

		setLayout(new GridBagLayout());
		
		JLabel lat=new JLabel();
		JLabel lat2=new JLabel();
		JLabel lat3=new JLabel();
		
		fondo=new ImageIcon("images/fondoLegal.png").getImage();
		
		logo=new JLabel();
		logo.setSize(190,190);
		ImageIcon imagen=new ImageIcon("images/logo.png");
		Icon logoImagen=new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(),logo.getHeight(),Image.SCALE_DEFAULT));
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(logoImagen);
	
		etiqueta=new JLabel("ya tienes tu cuenta?");
		etiqueta.setHorizontalAlignment(SwingConstants.RIGHT);
			
		nombre=new JTextField();
		nombre.setPreferredSize(new Dimension(0,10));
		nickName=new JTextField();
		nickName.setPreferredSize(new Dimension(0,10));
		
		contraseña=new JPasswordField();
		contraseña.setPreferredSize(new Dimension(0,10));
		
		mismaContraseña=new JPasswordField();
		mismaContraseña.setPreferredSize(new Dimension(0,10));
		
		ingresar=new JButton("ingresar");
		ingresar.setActionCommand(PanelLogIn.INGRESAR);
		ingresar.addActionListener(this);
		
		registrar=new JButton("Registrarse");
		registrar.setActionCommand(PanelLogIn.REGISTRARSE);
		registrar.addActionListener(this);
		
		GridBagConstraints gbc=new GridBagConstraints();
		
		gbc.gridx=1;
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
		add(nombre,gbc);
		
		gbc.gridx=1;
		gbc.gridy=5;
		gbc.gridwidth=5;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(nickName,gbc);
		
		gbc.gridx=1;
		gbc.gridy=6;
		gbc.gridwidth=5;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(contraseña,gbc);
		
		gbc.gridx=1;
		gbc.gridy=7;
		gbc.gridwidth=5;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(mismaContraseña,gbc);
		
		gbc.gridx=1;
		gbc.gridy=8;
		gbc.gridwidth=5;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(registrar,gbc);
		
		gbc.gridx=1;
		gbc.gridy=9;
		gbc.gridwidth=5;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(lat3,gbc);
		
		gbc.gridx=1;
		gbc.gridy=10;
		gbc.gridwidth=3;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(etiqueta,gbc);
		
		gbc.gridx=4;
		gbc.gridy=10;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(ingresar,gbc);
	}
  
  @Override
	public void actionPerformed(ActionEvent a) {
		String comando=a.getActionCommand();
		if(comando.equals(PanelLogIn.REGISTRARSE)) {
			JOptionPane.showMessageDialog(null,"registro con exito");
		}
		else if(comando.equals(PanelLogIn.INGRESAR)){
			p.cerrarSignUpWindow();
			p.mostrarLogInWindow();	
		}
	}
  
  @Override
	public void paint(Graphics g) {
		g.drawImage(fondo, 0, 0, getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
}
