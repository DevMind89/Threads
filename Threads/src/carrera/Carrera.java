package carrera;

import java.util.Random;

public class Carrera extends Thread
{
	String nombre;
	int velocidad;
	
	public Carrera(String nombre,int velocidad) 
	{
		this.nombre = nombre;
		this.velocidad = velocidad;
	}
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print(nombre+" ");
			try {
				sleep(1000/velocidad);
			} catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println("Terminó: "+nombre);
	}
	
	public static void main(String[] args)
	{
		Random random = new Random();
		Carrera conejo = new Carrera("co", random.nextInt(10)+1);
		Carrera leon = new Carrera("le", random.nextInt(10)+1);
		Carrera caracol = new Carrera("ca", random.nextInt(10)+1);
		
		conejo.start();
		leon.start();
		caracol.start();
	}
}
