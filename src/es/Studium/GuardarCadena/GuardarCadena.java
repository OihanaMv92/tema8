package es.Studium.GuardarCadena;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GuardarCadena
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String cadena;
		System.out.println("Indicar la cadena a guardar: ");
		cadena = teclado.nextLine();
		teclado.close();
		try {
		FileWriter fw = new FileWriter("fich1.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		PrintWriter salida = new PrintWriter(bw);
		salida.println(cadena);
		salida.close();
		bw.close();
		fw.close();
		System.out.println("Archivo creado correctamente");
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
