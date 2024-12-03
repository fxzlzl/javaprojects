package Lista F;

import java.util.Scanner;

public class F6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double a, b, sa, la;
        System.out.println("Reajuste salarial:");
        System.out.println("Digite seu código:");
        a = leia.nextDouble();
        System.out.println("Digite seu salário:");
        b = leia.nextDouble();
        System.out.println("Seu salário antes do reajuste e de:" + b);
        sa = leia.nextDouble();

        if (sa + a==1) {
            sa = b*5/100;
            System.out.println("Você trabalha como operador");
            System.out.println("Você receberá um aumento de :"+sa);
            la = b+sa;
            System.out.println("Seu novo salário é de:R$"+la);
        }if (sa + a==2){
            sa = b*10/100;
            System.out.println("Você trabalha como programador");
            System.out.println("Você receberá um aumento de :"+sa);
            la = b+sa;
            System.out.println("Seu novo salário é de:R$"+la);
        }if (sa + a==3){
            sa = b*15/100;
            System.out.println("Você trabalha como analista");
            System.out.println("Você receberá um aumento de :"+sa);
            la = b+sa;
            System.out.println("Seu novo salário é de:R$"+la);
        }if (sa + a==4){
            sa = b*20/100;
            System.out.println("Você trabalha como gerente");
            System.out.println("Você receberá um aumento de :"+sa);
            la = b + sa;
            System.out.println("Seu novo salário é de:R$"+la);
        }
    }
}
