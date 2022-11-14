/**Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
*tela todos os números pares, e também a quantidade de números pares.
*/
package numerosPares;

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
        
        int[] pares = new int[n];
        
        for(int i = 0; i < pares.length; i++){
            System.out.printf("Digite um numero: ");
            int num = sc.nextInt();
            pares[i] = num;
        }
        int cont = 0;
        System.out.println("Numeros pares:");
        for(int i : pares){
            if(i % 2 == 0){
                System.out.println(i);
                cont++;
            }
        }
        System.out.println("Quantidade de pares: "+cont);
    }
    
}
