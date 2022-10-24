
package com.mycompany.promedioalumnos;
import java.util.Scanner;

public class PromedioAlumnos {

    public static void Inicializar(double Calificaciones[], String Materias[], Scanner Teclado){
        for (int i = 0; i < Calificaciones.length; i++){
            System.out.print("ingrese el nombre de la Materia ");
            Materias[i] = Teclado.next();
            System.out.print("ingrese la calificacion ");
            Calificaciones[i] = Teclado.nextDouble();
        }
    }
    
    public static double Promedio(double Calificaciones[])
    {
        double prom, suma = 0;
        for (int i = 0; i < Calificaciones.length; i++)
            suma += Calificaciones[i];
        prom = suma / Calificaciones.length;
        return prom;
    }
    
    public static void Imprimir(double Calificaciones[], String Materias[], double Promedio){
        System.out.printf("%-15s %-15s%n%n", "Materias", "Calificacion");
        for (int i = 0; i < Calificaciones.length; i++)
        {
            
            System.out.printf("%-15s %15f%n", Materias[i], Calificaciones[i]);
            
        }
        System.out.println("\nEl promedio es"+Promedio);
    }
    
    public static void Mayor (double[] Calificaciones, String[] Materias){
        double Mayor = 0;
        for (int i = 0; i < Calificaciones.length; i++)
        {
            if (Calificaciones[i]> Mayor)
                Mayor = Calificaciones[i];
            System.out.println("\nLa Calificacion mas Alta fue: "+Mayor);
        }
    }
    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        double Calificaciones[];
        String Materias[];
        int n;
        double Promedio;
        
        System.out.print("ingrese la cantidad de Materias ");
        n = Teclado.nextInt();
        
        Calificaciones = new double[n];
        Materias = new String[n];
        
        Inicializar(Calificaciones, Materias, Teclado);
        Promedio = Promedio(Calificaciones);
        Imprimir(Calificaciones, Materias, Promedio);
        Mayor(Calificaciones, Materias);
        
    }
}
