/**Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.*/

package somaVetores;

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
        
        System.out.printf("Tamanho dos vetores: ");
        int n = sc.nextInt();
        
        double[] vetor = new double[n];
        double[] vetor1 = new double[n];
        double[] soma = new double[n];
        
        System.out.printf("Digite o vetor A: ");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }
        System.out.printf("Digite o vetor B: ");
        for(int i = 0; i < vetor1.length; i++){
            vetor1[i] = sc.nextInt();
        } 
        for(int i = 0; i < soma.length;i++){
            soma[i] = vetor[i]+vetor1[i];
        }
        System.out.println("VETOR RESULTANTE");
        for(double i : soma){
            System.out.println(i);
        }
        
    }
    
}
