package PRACTICA;

public class Main
{
	public static void main(String[] args)
	{
		VerificarCuenta vc = new VerificarCuenta();
		
		Thread Mario = new Thread(vc,"Mario"); 
		Thread Alvaro = new Thread(vc,"Alvaro");
		
		Mario.start();
		Alvaro.start();
	}
}
