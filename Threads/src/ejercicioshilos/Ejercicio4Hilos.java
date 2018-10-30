package ejercicioshilos;

import java.util.Calendar;

public class Ejercicio4Hilos extends Thread
{	
	public void run()
	{
		Calendar today = Calendar.getInstance();
		System.out.println("Nombre del hilo: "+Thread.currentThread().getName()+" Fecha de hoy: "+today.getTime());
	}
	
	public static void main(String[] args)
	{
		Ejercicio4Hilos hilo1 = new Ejercicio4Hilos(); hilo1.setName("hilo1");
		hilo1.start();
	}
}
