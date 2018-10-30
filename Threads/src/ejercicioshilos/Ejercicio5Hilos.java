package ejercicioshilos;

import java.util.Calendar;

public class Ejercicio5Hilos extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			Calendar today = Calendar.getInstance();
			System.out.println("Nombre del hilo: "+Thread.currentThread().getName()+" Fecha de hoy: "+today.getTime());
			try {
				sleep(1000);
			} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	public static void main(String[] args)
	{
		Ejercicio5Hilos hilo1 = new Ejercicio5Hilos(); hilo1.setName("hilo1");
		Ejercicio5Hilos hilo2 = new Ejercicio5Hilos(); hilo2.setName("hilo2");
		Ejercicio5Hilos hilo3 = new Ejercicio5Hilos(); hilo3.setName("hilo3");
		Ejercicio5Hilos hilo4 = new Ejercicio5Hilos(); hilo4.setName("hilo4");
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
	}
}
