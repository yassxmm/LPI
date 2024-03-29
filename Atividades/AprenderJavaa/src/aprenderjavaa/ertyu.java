
package aprenderjavaa;

import java.util.Scanner;

public class ertyu {

    public static void main(String[] args) {
    
        float nota1, nota2, nota3, media, recpar, mfinal;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite suas três notas:");
        nota1 = teclado.nextFloat();
        nota2 = teclado.nextFloat();
        nota3 = teclado.nextFloat();
        
        media = (nota1 + nota2 + nota3)/3;
        
        if (media >= 7) {
            System.out.println("Você foi aprovado! Parabens!");
        } 
        else {
            System.out.println("Você foi reprovado, qual a nota da recuperação?");
            recpar = teclado.nextFloat();
            mfinal = (media + recpar)/2;
            if (mfinal >= 5) {
                System.out.println("Você foi aprovado! Parabens!");
            }
            else {
                System.out.println("Você foi reprovado definitivamente.");
            }
        }
    }
}


