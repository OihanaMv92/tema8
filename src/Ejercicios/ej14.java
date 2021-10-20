package Ejercicios;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class ej14
{
public static void main(String[] args)
{
final int TAM = 10;
Scanner teclado = new Scanner(System.in);
int tabla[] = new int[TAM];
for(int i = 0; i < TAM; i++)
{
System.out.println("Dame el valor de la posición " + i);
tabla[i] = teclado.nextInt();
}
try
{
FileOutputStream fos = new FileOutputStream("tabla3.dat");
BufferedOutputStream bos = new BufferedOutputStream(fos);
ObjectOutputStream salidaB = new ObjectOutputStream(bos);
salidaB.writeObject(tabla);
System.out.println("Archivo creado correctamente");
salidaB.close();
bos.close();
fos.close();
teclado.close();
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

