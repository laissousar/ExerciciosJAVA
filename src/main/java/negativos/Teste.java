package negativos;


import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
*e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
* negativos;*
* /

/**
 *
 * @author frank
 */
public class Teste {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int[] vect = new int[10];
        
        System.out.print("Tamanho de vetor: ");
        int tam = sc.nextInt();
        
        for(int i = 0; i < tam;i++){
            vect[i] = sc.nextInt();
        }
        System.out.println("Negativos: ");
        for(int i = 0; i < tam;i++){
            if(vect[i]<0){
                System.out.println(vect[i]);
            }
        }
        
        
    }
    
}
