/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01;
import java.util.Scanner;

public class HolaMundoNombre_Edad_Altura 
{
   public static void main(String[] args)
   {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Ingrese Nombre: ");
           String nom = scanner.next();
           System.out.print("Ingrese Edad: ");
           int edad = scanner.nextInt();
           System.out.print("Ingrese Altura: ");
           double altura = scanner.nextDouble();
           System.out.println("Nombre: "+nom + "\n" + "Edad: "+edad + "\n" +"Altura: "+altura);
   }
}
