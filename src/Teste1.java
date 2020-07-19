import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		float valor = 0;

		if (codigo == 1)
			valor = 4;
		else if (codigo == 2)
			valor = (float) 4.5;
		else if (codigo == 3)
			valor = 5;
		else if (codigo == 4)
			valor = 2;
		else if (codigo == 5)
			valor = (float) 1.5;
		else
			valor = 0;

		System.out.printf("Total: R$ %.2f%n", valor * quantidade);

	}
}
