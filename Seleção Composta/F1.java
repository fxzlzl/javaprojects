package ListaF;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int	cod;
		
		System.out.println("Digite o codigo do seu departamento: 10, 12 ou 14");
		cod = leia.nextInt();
		
		if (cod == 10) {
			System.out.println("Seu departamento é contabilidade.");
			}
		if (cod ==12) {
				System.out.println("Seu departamento é almoxarifado.");
			}
		if (cod == 14) {
				System.out.println("seu departamento é a informatica");
			}else {
				System.out.println("código inválido");
			}
		
	}

}
