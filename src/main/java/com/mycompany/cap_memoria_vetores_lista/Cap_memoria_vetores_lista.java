/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cap_memoria_vetores_lista;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Cap_memoria_vetores_lista {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
  /*      double soma = 0;
   *     
   *     System.out.println("Digite o tamanho do vetor: ");
   *     int n = sc.nextInt();
   *     
   *     double[] vetor = new double[n];
   *     
   *    System.out.println("Digite as alturas: ");
   *     for(int i = 0; i < vetor.length; i++){
   *         vetor[i] = sc.nextDouble();
   *         soma += vetor[i];
   *     }

   *    double media = soma/n;
   *     System.out.printf("Média: %.2f",media);*/   
        System.out.print("Tamanho do vetor: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Produtos[] produto = new Produtos[n];
        
        for(int i = 0; i < produto.length;i++){
            String name = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            
            Produtos produtos = new Produtos(name, price);
            produto[i] = produtos;
        }
        double sum= 0;
        for(int i = 0; i < produto.length;i++){
            sum += produto[i].getPrice();
        }
        double avg = sum/produto.length;
        System.out.printf("Average price: %.2f", avg);
        
        sc.close();
        
    }
}
