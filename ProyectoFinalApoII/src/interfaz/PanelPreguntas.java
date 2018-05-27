package interfaz;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Graphics;
import java.awt.GridLayout;

public class PanelPreguntas extends JPanel implements ActionListener{
  
  public static final String SIG="siguiente";
	
	private JButton siguiente;
	private JLabel pregunta;
	private JComboBox<String> respuestas;
  
  private Principal p;
  
  public PanelPreguntas(Principal p){
    this.p=p;
    
   setLayout(new GridLayout(1,3));

	JPanel aux= new JPanel();
	aux.setLayout(new GridBagLayout());
		
		JLabel l1=new JLabel();
		JLabel l2=new JLabel();
		JLabel l3=new JLabel();
		JLabel l4=new JLabel();
		JLabel l5=new JLabel();

		siguiente=new JButton("Siguiente");
		siguiente.setPreferredSize(new Dimension(200,80));
		siguiente.setActionCommand(SIG);
		siguiente.addActionListener(this);

		pregunta=new JLabel("here will be the question.....");
		pregunta.setOpaque(true);
		pregunta.setBackground(Color.GRAY);
		pregunta.setPreferredSize(new Dimension(0,350));
		
		respuestas=new JComboBox<>();
		
		GridBagConstraints gbc=new GridBagConstraints();
		
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=5;
		gbc.gridheight=4;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		aux.add(pregunta,gbc);
		
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridwidth=1;
		gbc.gridheight=8;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		aux.add(l1,gbc);
		
		gbc.gridx=4;
		gbc.gridy=4;
		gbc.gridwidth=1;
		gbc.gridheight=8;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		aux.add(l2,gbc);
		
		gbc.gridx=1;
		gbc.gridy=4;
		gbc.gridwidth=4;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		aux.add(l3,gbc);
		
		gbc.gridx=1;
		gbc.gridy=6;
		gbc.gridwidth=3;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		aux.add(respuestas,gbc);
		
		gbc.gridx=0;
		gbc.gridy=8;
		gbc.gridwidth=4;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		aux.add(l4,gbc);
		
		gbc.gridx=2;
		gbc.gridy=10;
		gbc.gridwidth=2;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.NONE;
		gbc.anchor=GridBagConstraints.EAST;
		aux.add(siguiente,gbc);
		
		gbc.gridx=1;
		gbc.gridy=12;
		gbc.gridwidth=4;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		aux.add(l5,gbc);
	  
	  	JLabel lo= new JLabel();
		JLabel la= new JLabel();
		add(la);
		add(aux);
		add(lo);
  }
  
  @Override
  public void actionPerformed(ActionEvent a) {
	String comando=a.getActionCommand();
  }
  @Override
  public void paint(Graphics g) {
	g.drawImage(p.getFondoUsuario(),0,0,getWidth(),getHeight(),this);
	setOpaque(false);
	super.paint(g);
	if(p.getTexto().equals("masculino")) {
		ImageIcon Termometro = new ImageIcon("gif/termometro.png");
		ImageIcon	hombre1= new ImageIcon("gif/hombre gif1.gif");
		ImageIcon	hombre2= new ImageIcon("gif/hombre gif2.gif");
		g.drawImage(Termometro.getImage(), 215, 50, this);
		g.drawImage(hombre1.getImage(), 20, 0, this);
		g.drawImage(hombre2.getImage(),-80, 250, this);
	}else if(p.getTexto().equals("femenino")) {
		ImageIcon Termometro = new ImageIcon("gif/termometro.png");
		ImageIcon	mujer1= new ImageIcon("gif/mujer gif1.gif");
		
		g.drawImage(Termometro.getImage(), 215, 50, this);
		g.drawImage(mujer1.getImage(),-100, 20, this);
		System.out.println(p.getTexto());
	}else{
		ImageIcon Termometro = new ImageIcon("gif/termometro.png");
		System.out.println(p.getTexto());
		ImageIcon	herma1= new ImageIcon("gif/herma.gif");
		g.drawImage(herma1.getImage(), 0, 200, this);
		g.drawImage(Termometro.getImage(), 215, 50, this);
		System.out.println(p.getTexto());
	}
  }
}
