
package ejercicioshilos;

public class Ejercicio1Hilos extends Thread
{	
	public void run() 
	{
		for(int i = 1; i <= 10; i++)
			System.out.println(Thread.currentThread().getName()+": "+i);
	}

	public static void main(String[] args)
	{
		Ejercicio1Hilos hilo1 = new Ejercicio1Hilos(); hilo1.setName("Hilo1");
		Ejercicio1Hilos hilo2 = new Ejercicio1Hilos(); hilo2.setName("Hilo2");
		hilo1.start();		
		hilo2.start();
	}
}
