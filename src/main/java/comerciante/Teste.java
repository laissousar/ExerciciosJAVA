/**Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto,
mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de
venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias
proporcionaram:
 lucro < 10%
 10% ≤ lucro ≤ 20%
 lucro > 20%
Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como
o lucro total.*/

package comerciante;

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
        
        int abaixo10 = 0, entre10e20 = 0, acima20 = 0;
        double totalCompra = 0, totalVendas = 0, lucroTotal =0,lucroProd = 0;
      
        
        System.out.printf("Quantidade de produtos para cadastrar: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Produto[] vetor = new Produto[n];
        
        for(int i = 0; i<vetor.length;i++){
            System.out.println("Produto "+ (i+1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preco de compra: ");
            double precoCompra = sc.nextDouble();
            System.out.print("Preco de venda: ");
            double precoVenda = sc.nextDouble();
            sc.nextLine();
            
            vetor[i] = new Produto(nome, precoVenda, precoCompra);
        }
        for (Produto vetor1 : vetor) {
            lucroProd = (vetor1.getPrecoVenda() - vetor1.getPrecoCompra()) / vetor1.getPrecoCompra() * 100;
            if(lucroProd < 10)
                abaixo10++;
            else if(lucroProd <20)
                entre10e20++;
            else{
                acima20++;
            }
        }
        for(int i = 0; i<vetor.length;i++){
            totalCompra += vetor[i].getPrecoCompra();
            totalVendas += vetor[i].getPrecoVenda();
        }
        lucroTotal = totalVendas - totalCompra;
        System.out.println("\nRELATORIO:");
	System.out.printf("Lucro abaixo de 10%%: %d\n", abaixo10);
	System.out.printf("Lucro entre 10%% e 20%%: %d\n", entre10e20);
	System.out.printf("Lucro acima de 20%%: %d\n", acima20);
	System.out.printf("Valor total de compra: %.2f\n", totalCompra);
	System.out.printf("Valor total de venda: %.2f\n", totalVendas);
	System.out.printf("Lucro total: %.2f\n", lucroTotal);

    }
    
}
