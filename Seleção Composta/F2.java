package Lista F;

import java.util.Scanner;

public class F2 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int idade

        if (idade>=6) {
            if(idade<=8) {
                System.out.println("Dente de leite");
            }else if(idade<=11) {
                System.out.println("Pré Mirim");
            }else if(idade<=13) {
                System.out.println("Mirim");
            }else if(idade<=15) {
                System.out.println("Infantil");
            }else if(idade<=17) {
                System.out.println("Juvenil");
            }else if(idade<=20) {
                System.out.println("Juniores");
            }else {
                System.out.println("Acima da idade máxima");
            }
        } else {
            System.out.println("Abaixo da idade mínima");
        }
    }
}
