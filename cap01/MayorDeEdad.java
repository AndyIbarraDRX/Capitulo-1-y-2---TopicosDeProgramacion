/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01;
import java.util.Scanner;

/**
 *
 * @author casa
 */
public class MayorDeEdad 
{
    public static void main(String[] args)
    {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        byte edad = lector.nextByte();  
        if (edad >= 21) 
            System.out.println("Usted es mayor de edad.");
        else
            System.out.println("Usted es MENOR de edad.");
    }
}
