package ejercicio6;

public class Ingresar_Extraer extends Thread{

	int cantidad;
	CuentaBancaria objCuenta;
	
	public Ingresar_Extraer(int cantidad,CuentaBancaria objCuenta)
	{
		this.cantidad=cantidad;
		this.objCuenta=objCuenta;
	}
	
	public void run() 
	{
		if(Thread.currentThread().getName().equals("ingreso")) 
		{
			for(int i=0;i<10;i++) 
			{
				System.out.println("Ingresados "+cantidad+"€");
				objCuenta.setDinero(objCuenta.getDinero()+cantidad);
				System.out.println("Total de la cuenta: "+objCuenta.getDinero()+"€");
				System.out.println();
				try 
				{
					sleep(2000);
				} catch (InterruptedException e) {e.printStackTrace();}
			}
		}
		else
		{
			for(int i=0;i<5;i++) 
			{
				System.out.println("Extraidos "+cantidad+"€");
				objCuenta.setDinero(objCuenta.getDinero()-cantidad);
				System.out.println("Total de la cuenta: "+objCuenta.getDinero()+"€");
				System.out.println();
				try 
				{
					sleep(2000);
				} catch (InterruptedException e) {e.printStackTrace();}
			}
		}
	}
}
