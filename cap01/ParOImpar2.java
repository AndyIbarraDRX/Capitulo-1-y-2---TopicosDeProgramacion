/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01;
import java.util.Scanner;
public class ParOImpar2 
{
    public static void main(String[] args)   
    {      
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
            int v=scanner.nextInt();      
        int resto= v % 2;      
        String msg = (resto == 0 ) ? "es Par": "es Impar";
        System.out.println(v+" "+msg);   }
}
