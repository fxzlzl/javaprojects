package Lista F;

import java.util.Scanner;

public class F7 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int a,b,c,bc,ac,ab;
        System.out.println("Digite um lado do triângulo");
        a = leia.nextInt();
        System.out.println("Digite um lado do triângulo");
        b = leia.nextInt();
        System.out.println("Digite um lado do triângulo");
        c = leia.nextInt();

        bc = (b+c);
        ac = (a+c);
        ab = (a+b);

        if ((a<bc) && (b<ac) && (c<ab)){
            System.out.println("os seus lados formam um triângulo.");
            if ((a==b) && (a ==c)){
                System.out.println("O seu triângulo é equilátero");
            } else if ((a!=b) && (b!=c) && (c!=a)) {
                System.out.println("O seu triângulo é escaleno");
            }else {
                System.out.println("O seu triângulo e isóceles");
            }else {
                System.out.println("os seus lados não formam um triângulo");
            }
        }
    }
}
