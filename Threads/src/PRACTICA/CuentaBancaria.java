package PRACTICA;

public class CuentaBancaria 
{
	public int saldo;
	
	public CuentaBancaria() 
	{
		saldo = 50;
	}

	public int getSaldo() {
		return saldo;
	}

	public void retirarDinero(int dinero)
	{
		saldo = saldo - dinero;
	}
	
	public void ingresarDinero(int dinero)
	{
		saldo = saldo + dinero;
	}
}
