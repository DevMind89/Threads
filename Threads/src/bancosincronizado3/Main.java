package bancosincronizado3;

public class Main
{
    public static void main(String[] args) 
    {   
        VerificarSaldo verificarSaldo = new VerificarSaldo();
        
    	Thread Mario = new Thread (verificarSaldo, "Mario");
    	Thread Alvaro = new Thread (verificarSaldo, "Alvaro");
    	Thread Paquito = new Thread (verificarSaldo, "Paquito");
	
    	Mario.start();
    	Alvaro.start();
    	Paquito.start();
    }
}