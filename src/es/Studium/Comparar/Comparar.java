package es.Studium.Comparar;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Comparar
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nombreFichero1, nombreFichero2;
		String cadena1, cadena2;
		System.out.println("Fichero 1:");
		nombreFichero1 = teclado.nextLine();
		System.out.println("Fichero 2:");
		nombreFichero2 = teclado.nextLine();
		teclado.close();
		try
		{
			FileReader fr1 = new FileReader(nombreFichero1);
			FileReader fr2 = new FileReader(nombreFichero2);
			BufferedReader br1 = new BufferedReader(fr1);
			BufferedReader br2 = new BufferedReader(fr2);
			Boolean iguales = true;
			while((iguales==true)&&((cadena1=br1.readLine())!=null)&&((cadena2=br2.readLine())!=null))
			{
				if(!cadena1.equals(cadena2))
				{
					iguales = false;
				}
			}
			if(iguales)
			{
				System.out.println("El contenido de los ficheros es el mismo");
			}
			else
			{
				System.out.println("El contenido de los ficheros NO es el mismo");
			}
			br2.close();
			br1.close();
			fr2.close();
			fr1.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Uno de los ficheros NO existe");
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}