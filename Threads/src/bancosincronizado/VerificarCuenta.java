package bancosincronizado;

public class VerificarCuenta extends Thread
{	
	public  CuentaBanco cb = new CuentaBanco();
	
	public synchronized void HacerRetiro(int cantidad) throws InterruptedException
  	{        
  		System.out.println("Saldo actual de la cuenta: "+cb.getCantidad()+"€.");
  		System.out.println("\n"+Thread.currentThread().getName()+" entra en hacer un retiro\n");
		
  		if(cb.getCantidad() >= cantidad)
  		{
            System.out.println(Thread.currentThread().getName()+" está realizando un retiro de: "+ cantidad+"€.");
            Thread.sleep(2000);
            cb.retiroBancario(cantidad);

            System.out.println("Retiro realizado correctamente.");
            System.out.println("Los fondos son de: " + cb.getCantidad()+"€");
        }
  		else
  		{            
            System.out.println("No hay suficiente dinero en la cuenta para realizar el retiro Sr." + Thread.currentThread().getName());
            System.out.println("Su saldo actual es de "+cb.getCantidad()+"€");
            Thread.sleep(2000);
        }    
	  System.out.println("\n"+Thread.currentThread().getName()+" sale de hacer el retiro\n");
	}
	
	public void run()
	{
	    for (int i=1; i<=3; i++)
	    {
            try {
				this.HacerRetiro(10);
				if(cb.getCantidad() < 0)
		                System.out.println("La cuenta está NEGATIVA.");
			} catch (InterruptedException e) {e.printStackTrace();}
	    }
	}
}