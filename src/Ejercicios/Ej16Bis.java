package Ejercicios;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ej16Bis
{
	public static void main(String[] args)
	{
		final int TAM = 10;
		int tabla[] = new int[TAM];
		try
		{
			FileInputStream fos = new FileInputStream("tabla3.dat");
			BufferedInputStream bos = new BufferedInputStream(fos);
			ObjectInputStream entradaB = new ObjectInputStream(bos);
			tabla = (int[]) entradaB.readObject();
			for(int i = 0; i < TAM; i++)
			{
				System.out.println(tabla[i]);
			}
			System.out.println("Archivo leído correctamente");
			entradaB.close();
			bos.close();
			fos.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}

