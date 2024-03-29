package aprenderjavaa;

import java.util.Scanner;

public class Questão3_PrimeiraLista {

    public static void main(String[] args) {

        int x, s1, s2, m1, m2, h1, h2, sr, hr, mr;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro horário:\nh:");
        h1 = sc.nextInt();
        System.out.println("m:");
        m1 = sc.nextInt();
        System.out.println("s:");
        s1 = sc.nextInt();
        System.out.println("Digite o segundo horário:\nh:");
        h2 = sc.nextInt();
        System.out.println("m:");
        m2 = sc.nextInt();
        System.out.println("s:");
        s2 = sc.nextInt();
        System.out.println("Escolha a operação:\n1: soma\n0: diferença");
        x = sc.nextInt();

        if (x == 1) {
            hr = h1 + h2;
            mr = m1 + m2;
            sr = s1 + s2;
            if (sr > 60) {
                sr -= 60;
                mr++;
            }
            if (mr > 60) {
                mr -= 60;
                hr++;
            }
            System.out.println("A soma dos dois horários é:\n" + hr + ":" + mr + ":" + sr);
        } else {
            if (x == 0) {
                hr = h1 - h2;
                mr = m1 - m2;
                sr = s1 - s2;
                if (sr < 0) {
                    sr += 60;
                    mr--;
                }
                if (mr < 0) {
                    mr += 60;
                    hr--;
                }
                if (hr < 0) {
                    System.out.println("A diferença é negativa\n" + hr + ":" + mr + ":" + sr);
                } else {
                    System.out.println("A diferença dos dois horários é:\n" + hr + ":" + mr + ":" + sr);
                }
            } else {
                System.out.println("ERRO");
            }
        }
    }
}
