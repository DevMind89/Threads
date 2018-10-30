package ejercicioshilos;

public class Ejercicio3Hilos extends Thread
{
	int numero;
	
	public Ejercicio3Hilos(int numero) 
	{
		this.numero = numero;
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(numero + " x "+i+" = "+numero*i);
			try
			{
				sleep(3000);
			}catch(InterruptedException e) {e.printStackTrace();}
		}
	}

	public static void main(String[] args) 
	{
		Ejercicio3Hilos hilo1 = new Ejercicio3Hilos(1);
		Ejercicio3Hilos hilo2 = new Ejercicio3Hilos(2);
		Ejercicio3Hilos hilo3 = new Ejercicio3Hilos(3);
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
}
