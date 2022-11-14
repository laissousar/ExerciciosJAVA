/**Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).*/
package maiorPosicao;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Teste {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Tamanho do vetor: ");
        int n = sc.nextInt();
        
        double[] vetor = new double[n];
        
        double maior = 0;
        int posicao=0;
        
        for(int i = 0; i < vetor.length;i++){
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            
            if(i == 0){
                maior = vetor[i];
                posicao = i;
        }
                
            if(vetor[i] > maior){
                maior = vetor[i];
                posicao = i;
            } 
        }
        System.out.println("MAIOR VALOR = "+ maior);
        System.out.println("POSICAO MAIOR VALOR = "+ posicao);
        
    }
    
}
