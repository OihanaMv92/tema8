package es.Studium.GuardarCadena;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerCadena
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader("fich1.txt");
			BufferedReader br = new BufferedReader(fr);
			String cadena;
			while((cadena=br.readLine())!=null)
			{
				System.out.println(cadena);
			}
			br.close();
			fr.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
