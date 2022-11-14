/**Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
*- Imprimir todos os elementos do vetor
*- Mostrar na tela a soma e a média dos elementos do vetor
*/
package soma_vetor;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Teste {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.printf("Tamanho do vetor: ");
        int n = sc.nextInt();
        double soma = 0;
        double media;
        
        double[] vetor =new double[n];
        
        for(int i = 0; i < vetor.length;i++){
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
            
        }
        media = soma/n;
        for(double i : vetor){
            System.out.println(i);

        }
        System.out.println("soma: "+soma+" " +"media: "+ media);
    }
    
}
