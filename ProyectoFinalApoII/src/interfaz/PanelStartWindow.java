package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class PanelStartWindow extends JPanel implements ActionListener{
	
	public static final String INICIAR="inicio";

	private Principal p;
	private JButton inicio;
	private JScrollPane jspane;
	private JTextArea areaTexto;
	private JLabel marcoIcono;
	private Image fondo;
	
	public PanelStartWindow(Principal p){
		this.p=p;
		
		setLayout(null);
		
		marcoIcono=new JLabel();
		marcoIcono.setSize(400,400);

		ImageIcon image=new ImageIcon("images/logo.png");
		Icon icono=new ImageIcon(image.getImage().getScaledInstance(marcoIcono.getWidth(),marcoIcono.getHeight(),Image.SCALE_DEFAULT));
		marcoIcono.setIcon(icono);
		marcoIcono.setLocation(295, 325);
		
		fondo=new ImageIcon("images/fondo2.png").getImage();
		
		icono=new ImageIcon("images/iconStart.png");
	
	
		inicio=new JButton();
		inicio.setBounds(360,790, 240, 120);
		//inicio.setForeground(Color.BLACK);
		inicio.setBackground(new Color(179,224,153));
		inicio.setFont(new Font("Action Man Extended", Font.BOLD,30));
		inicio.setText("Inicio");
		inicio.setIcon(icono);
		inicio.setActionCommand(INICIAR);
		inicio.addActionListener(this);
		
		//add(text);
		add(marcoIcono);
		add(inicio);

		
		
		/*
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=5;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		
		//this.repaint();
		add(inicio,gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(d,gbc);
		
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=2;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(b,gbc);
		
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=4;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(c,gbc);
		
		gbc.gridx=2;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(e,gbc);
		
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(f,gbc);
		
		gbc.gridx=0;
		gbc.gridy=5;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(marcoIcono,gbc);
		
		gbc.gridx=1;
		gbc.gridy=5;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		add(f,gbc);*/
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(fondo, 0, 0, getWidth(), getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	
	 @Override
	 public void actionPerformed(ActionEvent a) {
		 String comando=a.getActionCommand();
		 if(comando.equals(INICIAR))
			 p.mostrarPanelLegal();
	 }
}
