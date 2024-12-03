package Lista F;

import java.util.Scanner;

public class F4 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
       double n1,n2,n3,n4,ex,calcule,md;
        System.out.println("Digite sua primeira nota:");
        n1 = leia.nextInt();
        System.out.println("Digite sua segunda nota:");
        n2 = leia.nextInt();
        System.out.println("Digite sua terceira nota:");
        n3 = leia.nextInt();
        System.out.println("Digite sua quarta nota:");
        n4 = leia.nextInt();

        md = n1+n2+n3+n4/4;
        if (md>=7){
            System.out.println("Aluno aprovado");
        } else if (md<7) {
            System.out.println("Média insuficiente para ser aprovado.");
        }
        System.out.println("Digite a sua nota do exame");
        ex = leia.nextInt();

        calcule = md+ex;

        if (calcule>=5){
            System.out.println("Aprovado pela média do exame.");
        } else if (calcule<5){
            System.out.println("Aluno reprovado,média insuficiente");
        }
    }

}
