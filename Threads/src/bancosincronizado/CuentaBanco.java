package bancosincronizado;

public class CuentaBanco 
{
	public int cantidad;
    
    public CuentaBanco(){   
    	cantidad = 50;
    }

    public int getCantidad(){
        return cantidad;
    }
    
    public void retiroBancario(int retiro){
        cantidad = cantidad - retiro;
    }
}