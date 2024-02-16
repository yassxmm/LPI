
package aprenderjavaa;

import java.util.Scanner;

public class Questão4_PrimeiraLista {
    
    public static int contador (int numeros) {
        if (numeros == 0) {
            return 1;
        }
        int cont = 0;
        while (numeros>0) {
            numeros = numeros/10;
            cont ++;
        }
        return cont;
    }
    
    
    public static void main(String[] args) {
        
        int nume, quantidade;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite um número:");
        nume = teclado.nextInt();
        
        if (nume<0) {
            System.out.println("Número negativo, tente novamente");
        }
        else { 
        quantidade = contador (nume);
        System.out.println("O número de digitos que você digitou é:" + quantidade);
        }
    }
}
