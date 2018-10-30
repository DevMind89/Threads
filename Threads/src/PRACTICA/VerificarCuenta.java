package PRACTICA;

public class VerificarCuenta extends Thread
{
	CuentaBancaria CC = new CuentaBancaria();
	
	public synchronized void retirarDinero(int dinero) throws InterruptedException
	{
		System.out.println("Saldo de la cuenta es: "+CC.getSaldo()+"€\n");
		System.out.println(Thread.currentThread().getName()+" entra hacer un retiro");
		
		if(CC.getSaldo()>=dinero)
		{
			System.out.println(Thread.currentThread().getName()+" va a retirar "+dinero+"€");
			Thread.sleep(2000);
			CC.retirarDinero(dinero);
			
			System.out.println("Retiro de dinero realizado correctamente");
		}
		else
		{
			System.out.println("No hay saldo suficiente para hacer el retiro");
			System.out.println("Su saldo actual es: "+CC.getSaldo()+"€");
			Thread.sleep(2000);
		}
		
		System.out.println(Thread.currentThread().getName()+" sale de hacer el retiro");
		System.out.println("Saldo actual: "+CC.getSaldo()+"€\n");
	}
	
	public synchronized void ingresarDinero(int dinero) throws InterruptedException
	{
		System.out.println("Saldo de la cuenta es: "+CC.getSaldo()+"€\n");
		System.out.println(Thread.currentThread().getName()+" entra hacer un ingreso");
		
		System.out.println(Thread.currentThread().getName()+" va a ingresar "+dinero+"€");
		Thread.sleep(2000);
		CC.ingresarDinero(dinero);
		
		System.out.println("Ingreso realizado correctamente");		
		
		System.out.println(Thread.currentThread().getName()+" sale de hacer el ingreso");
		System.out.println("Saldo actual: "+CC.getSaldo()+"€\n");
	}
	
	public void run() 
	{
		for(int i=1;i<=2;i++)
		{
			try {
				if(Thread.currentThread().getName().equals("Mario"))				
					this.ingresarDinero(50);				
				else
				{
					this.retirarDinero(50);
					if(CC.getSaldo()<0)					
						System.out.println("La cuenta esta en NEGATIVA");					
				}				
			} catch (InterruptedException e) {e.printStackTrace();}
		}
	}

}
