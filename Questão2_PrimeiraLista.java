
package aprenderjavaa;

import java.util.Scanner;

public class Questão2_PrimeiraLista {
    
    public static void main(String[] args) {
        
        float criterioA, criterioB;
        int livros;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite quantos livros você vai comprar:");
        livros = teclado.nextInt();
        
        criterioA = (float) ((livros * 0.25) + 7.50);
        criterioB = (float) ((livros * 0.50) + 2.50);
        
        if (criterioA == criterioB) {
            System.out.println("Qualquer opção o beneficiará.");
        }
        else {
            if (criterioA > criterioB) {
                System.out.println("A melhor opção para você é o critério A.");
            }
            else {
                System.out.println("A melhor opção para você é o critério B.");
            }
        }
    }
}
