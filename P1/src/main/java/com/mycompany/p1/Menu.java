/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1;
import java.util.Scanner;
/**
 *
 * @author estudiante
 */
public class Menu {
    
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Biblioteca");
        System.out.println("1. Iniciar Sesión");
        System.out.println("2. Registro");
        int a = c.nextInt();
        if (a != 2)
            System.out.println("1. Pide Un Libro");
        else if (a == 1)
            System.out.println("Registrar Nuevo Usuario: ");
         System.out.println("2. Dona un Libro");
         int b = c.nextInt();
         if b == 1
    
