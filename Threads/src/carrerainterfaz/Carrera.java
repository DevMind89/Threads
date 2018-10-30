package carrerainterfaz;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Carrera extends Thread
{
	String nombre;
	JLabel etiqueta;
	int posicionY;
	int velocidad;
	
	public Carrera(String nombre,JLabel etiqueta, int posicionY, int velocidad) 
	{
		this.nombre = nombre;
		this.etiqueta = etiqueta;
		this.posicionY = posicionY;
		this.velocidad = velocidad;
	}
	
	public void run()
	{
		for(int i=1;i<=1200;i++)
		{
			etiqueta.setLocation(i,posicionY);				
			try {
				Thread.sleep(100/velocidad);
			} catch (InterruptedException e) {e.printStackTrace();}
		}
		JOptionPane.showMessageDialog(null,"¡"+nombre+" terminó!");
	}
}
