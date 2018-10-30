package carrerainterfaz;

import java.awt.Color;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interfaz 
{
	JFrame framePrincipal = null;
	JLabel imagenFriki1 = null;
	JLabel imagenFriki2 = null;
	JLabel imagenFriki3 = null;
	JLabel carretera = null;
	
	public Interfaz() 
	{		
		iniciar();
		framePrincipal.setVisible(true);
		Carrera();
	}
	
	public void iniciar()
	{
		framePrincipal = new JFrame("CARRERA");
		framePrincipal.setSize(1300,900);
		framePrincipal.setLayout(null);
		framePrincipal.getContentPane().setBackground(Color.white);
		framePrincipal.setLocationRelativeTo(null);
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		imagenFriki1 = new JLabel();
		imagenFriki1.setBounds(10,50,250,250);
		ImageIcon imgfriki1 = new ImageIcon(getClass().getResource("/GIFS/friki1.gif"));
		ImageIcon imgescalada = new ImageIcon(imgfriki1.getImage().getScaledInstance(imagenFriki1.getWidth(),
				imagenFriki1.getHeight(), Image.SCALE_DEFAULT));
		imagenFriki1.setIcon(imgescalada);		
		framePrincipal.add(imagenFriki1);
		
		imagenFriki2 = new JLabel();
		imagenFriki2.setBounds(10,320,250,250);
		ImageIcon imgfriki2 = new ImageIcon(getClass().getResource("/GIFS/friki2.gif"));
		ImageIcon imgescalada2 = new ImageIcon(imgfriki2.getImage().getScaledInstance(imagenFriki2.getWidth(),
				imagenFriki2.getHeight(), Image.SCALE_DEFAULT));
		imagenFriki2.setIcon(imgescalada2);		
		framePrincipal.add(imagenFriki2);
		
		imagenFriki3 = new JLabel();
		imagenFriki3.setBounds(10,590,250,250);
		ImageIcon imgfriki3 = new ImageIcon(getClass().getResource("/GIFS/friki3.gif"));
		ImageIcon imgescalada3 = new ImageIcon(imgfriki3.getImage().getScaledInstance(imagenFriki3.getWidth(),
				imagenFriki3.getHeight(), Image.SCALE_DEFAULT));
		imagenFriki3.setIcon(imgescalada3);		
		framePrincipal.add(imagenFriki3);
	}
	
	public void Carrera()
	{
		Random random = new Random();
	    Thread friki1 = new Carrera("FrikiBarba",imagenFriki1,50,random.nextInt(10)+1);
	    Thread friki2 = new Carrera("FrikiDescabezado",imagenFriki2,320,random.nextInt(10)+1);
	    Thread friki3 = new Carrera("FrikiHelado",imagenFriki3,590,random.nextInt(10)+1);
	    
		friki1.start();
		friki2.start();
		friki3.start();
	}
}
