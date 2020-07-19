import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de linhas da matriz :");
		int linhas = sc.nextInt();
		System.out.println("digite o número de colunas da matriz :");
		int colunas = sc.nextInt();

		System.out.println();

		int[][] matriz = new int[linhas][colunas];

		for(int i = 0 ; i< matriz.length;i++) {
			for(int j = 0; j<matriz[i].length;j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int num = sc.nextInt();
		

		for (int u = 0; u < matriz.length; u++) {
			for (int t = 0; t < matriz[u].length; t++) {
				if (matriz[u][t] == num) {
					System.out.println("Position " + u + "," + t + ":");
					if (t > 0)
						System.out.println("Left : " + matriz[u][t - 1]);
					if (u > 0)
						System.out.println("Up : " + matriz[u - 1][t]);
					if (t < matriz[u].length - 1)
						System.out.println("Right : " + matriz[u][t + 1]);
					if (u < matriz.length - 1)
						System.out.println("Down : " + matriz[u + 1][t]);
				}

			}
		}
	}
}
