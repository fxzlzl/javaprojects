package listaF;

import java.util.Scanner;

public class F8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int va, vb, vc, vt;
		
		System.out.println("coloque o primeiro valor.");
		va = sc.nextInt();
		System.out.println("coloque o segundo valor.");
		vb = sc.nextInt();
		System.out.println("coloque o terceiro valor.");
		vc = sc.nextInt();
		
		if(va > vb) {
			vt = va;
			
			System.out.println("o maior valor � o primeiro");
			
			
			
		}else if (vc > va) {
			System.out.println( "o maior valor � o segundo valor" );
			
		}else if (vb > vc) {
			System.out.println("o maior valor � o teceiro ");
		}else {
			System.out.println("valor inv�lido");
		}
	}

}
