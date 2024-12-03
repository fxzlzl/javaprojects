package Lista F;

import java.util.Scanner;

public class F5 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double a , b, sa ,la ;
        System.out.println("Reajuste salarial:");
        System.out.println("Digite seu código:");
        a = leia.nextDouble();
        System.out.println("Digite seu salário:");
        b= leia.nextDouble();
        System.out.println("Seu salário antes do reajuste e de:"+b);

        if (a==1){
            sa =b*5/100;
            System.out.println("Você recebera um aumento de "+sa);
            la =b+sa;
            System.out.println("seu novo salario e de:"+la);
        }if (a==2){
            sa =b*10/100;
            System.out.println("Você recebera um aumento de "+sa);
            la =b+sa;
            System.out.println("seu novo salario e de:"+la);
        }if (a==3) {
            sa = b * 15 / 100;
            System.out.println("Você recebera um aumento de " + sa);
            la = b + sa;
            System.out.println("seu novo salario e de:" + la);
        }if (a==4){
        sa =b*20/100;
        System.out.println("Você recebera um aumento de "+ sa);
        la =b+sa;
        System.out.println("seu novo salario e de:"+la);
       }if (a==5){
        sa =b*25/100;
        System.out.println("Você recebera um aumento de "+ sa);
        la =b+sa;
        System.out.println("seu novo salario e de:"+la);
    }if (a==6){
            sa =b*30/100;
            System.out.println("Você recebera um aumento de "+sa);
            la =b+sa;
            System.out.println("seu novo salario e de:"+la);
        }
}
}
