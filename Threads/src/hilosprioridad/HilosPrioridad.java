package hilosprioridad;

public class HilosPrioridad extends Thread
{		
	public static void main(String[] args)
	{
		HilosPrioridad hilo1 = new HilosPrioridad(); hilo1.setName("Hilo 1");
		HilosPrioridad hilo2 = new HilosPrioridad(); hilo2.setName("Hilo 2");
		HilosPrioridad hilo3 = new HilosPrioridad(); hilo3.setName("Hilo 3");
		
		hilo1.setPriority(MAX_PRIORITY);
		hilo3.setPriority(MIN_PRIORITY);
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}	
	
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.print(Thread.currentThread().getName()+": ");
			System.out.println("tiene como prioridad: "+Thread.currentThread().getPriority()+"\n");
		}
	}
}
