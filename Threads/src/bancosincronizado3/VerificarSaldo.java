package bancosincronizado3;

import java.util.Random;

public class VerificarSaldo extends Thread
{	
	public  CuentaBancaria cuentaBancaria = new CuentaBancaria();
	
	public synchronized void RetirarSaldo(int cantidad) throws InterruptedException
  	{        
  		System.out.println("Saldo actual de la cuenta: "+cuentaBancaria.getCantidad()+"€.");
  		System.out.println("\n"+Thread.currentThread().getName()+" entra en hacer un retiro\n");
		
  		if(cuentaBancaria.getCantidad() >= cantidad)
  		{
            System.out.println(Thread.currentThread().getName()+" está realizando un retiro de: "+ cantidad+"€.");
            Thread.sleep(2000);
            cuentaBancaria.retirarSaldo(cantidad);

            System.out.println("Retiro realizado correctamente.");
            System.out.println("Los fondos son de: " + cuentaBancaria.getCantidad()+"€");
        }
  		else
  		{            
            System.out.println("No hay suficiente dinero en la cuenta para realizar el retiro Sr." + Thread.currentThread().getName());
            System.out.println("Su saldo actual es de "+cuentaBancaria.getCantidad()+"€");
            Thread.sleep(2000);
        }    
	  System.out.println("\n"+Thread.currentThread().getName()+" sale de hacer el retiro\n");
	}
	
	public synchronized void IngresarSaldo(int cantidad) throws InterruptedException
  	{        
  		System.out.println("Saldo actual de la cuenta: "+cuentaBancaria.getCantidad()+"€.");
  		System.out.println("\n"+Thread.currentThread().getName()+" entra en hacer un ingreso\n");  		
  		
        System.out.println(Thread.currentThread().getName()+" está realizando un ingreso de: "+ cantidad+"€.");
        Thread.sleep(2000);
        cuentaBancaria.ingresarSaldo(cantidad);

        System.out.println("Ingreso realizado correctamente.");
        System.out.println("Los fondos son de: " + cuentaBancaria.getCantidad()+"€");
        	
	  System.out.println("\n"+Thread.currentThread().getName()+" sale de hacer el ingreso\n");
	}
	public void run()
	{
	    Random random = new Random();
	    
		for (int i=1; i<=2; i++)
	    {
            if(Thread.currentThread().getName().equals("Paquito"))
            {
            	try {
					this.IngresarSaldo(random.nextInt(200+1));
				} catch (InterruptedException e) {e.printStackTrace();}
            }
            else
            {
            	try {
    				this.RetirarSaldo(random.nextInt(200+1));
    				if(cuentaBancaria.getCantidad() < 0)
    		                System.out.println("La cuenta está NEGATIVA.");
    			} catch (InterruptedException e) {e.printStackTrace();}
            }	    	
	    }
	}
}