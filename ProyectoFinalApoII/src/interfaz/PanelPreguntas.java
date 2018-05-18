package interfaz;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Graphics;

public class PanelPreguntas extends JPanel implements ActionListener{
  
  public static final String SIG="siguiente";
	
	private JButton siguiente;
	private JLabel pregunta;
	private JComboBox<String> respuestas;
  
  private Principal p;
  
  public PanelPreguntas(Principal p){
    this.p=p;
    
    setLayout(new GridBagLayout());
		
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
		add(pregunta,gbc);
		
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridwidth=1;
		gbc.gridheight=8;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(l1,gbc);
		
		gbc.gridx=4;
		gbc.gridy=4;
		gbc.gridwidth=1;
		gbc.gridheight=8;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(l2,gbc);
		
		gbc.gridx=1;
		gbc.gridy=4;
		gbc.gridwidth=4;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(l3,gbc);
		
		gbc.gridx=1;
		gbc.gridy=6;
		gbc.gridwidth=3;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(respuestas,gbc);
		
		gbc.gridx=0;
		gbc.gridy=8;
		gbc.gridwidth=4;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(l4,gbc);
		
		gbc.gridx=2;
		gbc.gridy=10;
		gbc.gridwidth=2;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.NONE;
		gbc.anchor=GridBagConstraints.EAST;
		add(siguiente,gbc);
		
		gbc.gridx=1;
		gbc.gridy=12;
		gbc.gridwidth=4;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(l5,gbc);
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
  }
}
