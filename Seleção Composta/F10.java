package Lista F;

import java.util.Scanner;

public class F10 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double n1,n2,n3,n4,n5,menor,maior;
        System.out.println("Digite um número:");
        n1 = leia.nextDouble();
        System.out.println("Digite um número:");
        n2 = leia.nextDouble();
        System.out.println("Digite um número:");
        n3 = leia.nextDouble();
        System.out.println("Digite um número:");
        n4 = leia.nextDouble();
        System.out.println("Digite um número:");
        n5 = leia.nextDouble();

        if ((n1>n2) && (n1>n3) && (n1>n5)){
            maior = (n1);
            System.out.println("maior:" + maior + ".");
        } else if ((n1<n2) && (n1<n3) && (n1<n4) && (n1<n5)){
            menor = (n1);
            System.out.println("menor:"+ menor +"." );
        }if ((n2>n1) && (n2>n3) && (n2>n4) && (n1>n5)){
            maior = (n2);
            System.out.println("maior:" + maior + ".");
        } else if ((n2<n1) && (n2<n3) && (n2<n4) && (n2<n5)) {
            menor = (n2);
            System.out.println("menor:" + menor + ".");
        }if ((n3>n1) && (n3>n2) && (n3>n4) && (n3>n5)){
            maior = (n3);
            System.out.println("maior:" + maior + ".");
        } else if ((n4<n1) && (n4<n2) && (n4<n3) && (n4<n5)) {
            menor = (n4);
            System.out.println("menor:" + menor + ".");
        }if ((n5>n1) && (n5>n2) && (n5>n3) && (n5>n4)){
            maior = (n5);
            System.out.println("maior:" + maior + ".");
        } else if ((n5<n1) && (n5<n2) && (n5<n3) && (n5<n4)) {
            menor = (n5);
            System.out.println("menor:" + menor + ".");
        }
    }
}
