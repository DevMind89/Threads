package ejercicio6;

public class Ejercicio6Hilos
{

	public static void main(String[] args) throws InterruptedException 
	{
		CuentaBancaria objCuenta = new CuentaBancaria(500);
		Ingresar_Extraer ingreso = new Ingresar_Extraer(40,objCuenta);ingreso.setName("ingreso");
		Ingresar_Extraer extraccion = new Ingresar_Extraer(10,objCuenta);extraccion.setName("extraccion");		
		System.out.println("Cantidad total de la cuenta: "+objCuenta.getDinero()+"\n");
		
		ingreso.start();
		ingreso.join();
		extraccion.start();
	}
}
