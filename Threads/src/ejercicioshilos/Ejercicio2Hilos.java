package ejercicioshilos;

public class Ejercicio2Hilos extends Thread
{	
	int numero;
	
	public Ejercicio2Hilos(int numero)
	{
		this.numero = numero;
	}
	public void run()
	{
		for(int i=1;i<=10;i++) {System.out.println(numero+" x "+i+" = "+numero*i );}
	}

	public static void main(String[] args) 
	{
		Ejercicio2Hilos hilo1 = new Ejercicio2Hilos(1);
		Ejercicio2Hilos hilo2 = new Ejercicio2Hilos(2);
		Ejercicio2Hilos hilo3 = new Ejercicio2Hilos(3);
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
}
