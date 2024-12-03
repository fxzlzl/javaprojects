package Lista F;

import java.util.Scanner;

public class F9 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);{
            int num;
            System.out.println("Digite um número:");
            num = leia.nextInt();

            if ((num%4==0) && (num%5==0)){
                System.out.println("O seu número é divisivel por 4 e 5");
            }else {
                System.out.println("O seu número não e divisivel por 4 nem por 5");
            }
        }
    }
}
