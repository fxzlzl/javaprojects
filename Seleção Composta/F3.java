package Lista F;

import java.util.Scanner;

public class F3 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int n1,n2,n3,n4,md;
        System.out.println("Digite sua primeira nota:");
        n1 = leia.nextInt();
        System.out.println("Digite sua segunda nota:");
        n2 = leia.nextInt();
        System.out.println("Digite sua terceira nota:");
        n3 = leia.nextInt();
        System.out.println("Digite sua quarta nota:");
        n4 = leia.nextInt();


        md = n1+n2+n3+n4/4;

        if (md>=5){
            System.out.println("Você foi aprovado.");
        } else if (md<=4) {
            System.out.println("você foi reprovado");
        }
    }
}
