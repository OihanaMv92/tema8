package es.Studium.asterisco;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Asterisco
{


	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		char caracter;
		try
		{
			FileWriter fw = new FileWriter("fich2.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			do
			{
				System.out.println("Indicar un caracter a guardar (* FIN):");
				caracter = teclado.nextLine().charAt(0);
				if(caracter!='*')
				{
					salida.println(caracter);
				}
			}while(caracter!='*');
			teclado.close();
			salida.close();
			bw.close();
			fw.close();
			System.out.println("Archivo creado correctamente!");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}