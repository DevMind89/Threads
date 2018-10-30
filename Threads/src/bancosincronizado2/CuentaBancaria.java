package bancosincronizado2;

public class CuentaBancaria 
{
	public int cantidad;
    
    public CuentaBancaria(){   
    	cantidad = 500;
    }

    public int getCantidad(){
        return cantidad;
    }
    
    public void retirarSaldo(int retiro)
    {
        cantidad = cantidad - retiro;
    }
    public void ingresarSaldo(int ingreso)
    {
    	cantidad = cantidad + ingreso;
    }
}