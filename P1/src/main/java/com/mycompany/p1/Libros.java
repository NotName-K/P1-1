/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p1;

/**
 *
 * @author estudiante
 */
public class Libros {
     String Nombre;
     String Genero;
     String Autor;
     
     public Libros(String Nombre, String Genero, String Autor) {
           this.Nombre = Nombre;
           this.Genero = Genero;
           this.Autor = Autor;
      }

      public static void main(String[] args) {
           Libros c = new Libros("A", "B", "C");
           System.out.println(c.Nombre);
}
}
             
 

