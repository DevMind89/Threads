package ejercicio7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio7 extends Thread
{		
	public static void main(String[] args)
	{
		Thread hilo1 = new Ejercicio7(); hilo1.setName("hilo1");
		Thread hilo2 = new Ejercicio7(); hilo2.setName("hilo2");
	
		hilo1.start();
		try {hilo1.join();} catch (InterruptedException e) {e.printStackTrace();}
		hilo2.start();		
	}
	
	public void run()
	{
		if(Thread.currentThread().getName().equals("hilo1"))
		{
			grabarFicheroTexto();
		}
		else
		{			
			try 
			{
				leerFicheroTexto();
			} catch (IOException e) {e.printStackTrace();}			
		}
	}

	public static void grabarFicheroTexto()
	{
		char c;
		String contenido = "";
		try
		{
			System.out.println("Vas a escribir en un fichero de texto en Java\n");
			System.out.print("Escribe aqui: ");
			FileWriter fichero = new FileWriter("..\\Threads\\src\\ejercicio7\\Archivo.txt");
			StringBuffer str = new StringBuffer();
			while (true)
			{
                c=(char)System.in.read();
                
                if(c == '\n')
                {
                	 if(contenido.trim().equalsIgnoreCase("fin"))
                         break;
                     else contenido = "";
                }                   
                contenido = contenido + c;
                str.append(c);    
            }
            String cadena=new String(str); 
            cadena = cadena.replace("fin", "");
            fichero.write(cadena);					
											
			if(fichero != null)
    			fichero.close();
		}catch(IOException ex){System.out.println("Error al escribir en el fichero");}
		System.out.println("FICHERO ESCRITO CORRECTAMENTE\n");
	}
	
	public static void leerFicheroTexto()throws IOException
	{		
		System.out.println("Estas leyendo un fichero de texto en Java\n");
		FileReader fr = new FileReader("..\\Threads\\src\\ejercicio7\\Archivo.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		
		while((s = br.readLine()) != null) 
		{
		  System.out.println(s);
		}
		fr.close();
	}
}
