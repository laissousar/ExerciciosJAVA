/**Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
*tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
*bem como os nomes dessas pessoas caso houver.
*/
package alturas;

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
        
        System.out.println("Tamanho do vetor: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Pessoa[] vetor = new Pessoa[n];
        double soma = 0;
        int cont=0;
        
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Nome: ");
            String nome = sc.nextLine();
            System.out.printf("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            
            vetor[i] = new Pessoa(nome, idade, altura);
            soma += altura;
             if(idade < 16)
                cont ++;

        }
        double mediaAltura = soma/vetor.length;
        System.out.println("Media altura: "+mediaAltura);
        System.out.println("Menores de 16 anos: "+(cont*100)/n+ "%");
        
        for (Pessoa i : vetor){
            if(i.getIdade() < 16){
                System.out.printf(i.getNome()+ "\n");
        }
        
    }
    
}}
