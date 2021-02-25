/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.estaticas;

/**
 *
 * @author casa
 */
public class Número 
{
    private double valor;
    public Número(double v)
    {
        valor = v;
    }
    public String toString()
    {
        return Double.toString(valor);
    }

    public static double sumar(double a, double b)
    {
        return a + b;
    }
    public Número sumar(double a)
    {
        valor+=a;
        return this;
    }
}
