import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float N1 = sc.nextFloat();
		float N2 = sc.nextFloat();
		float N3 = sc.nextFloat();
		float N4 = sc.nextFloat();
		
		
		float Media = (N1*2+N2*3+N3*4+N4*1)/(2+3+4+1);
		
		float notaDoExame = 0;
		float novaMedia = 0;
		
		if(Media>=7.0) {
			System.out.printf("Media : %.1f%n", Media);
			System.out.printf("Aluno aprovado.%n");
		}else if(Media<5.0) {
			System.out.printf("Media: %.1f%n", Media);
			System.out.printf("Aluno reprovado.%n");
		}else if(Media>=5.0&&Media<=6.9) {
			System.out.printf("Media: %.1f%n", Media);
			System.out.printf("Aluno em exame:%n");
			notaDoExame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", notaDoExame);
			novaMedia = (Media + notaDoExame)/2;
			if(novaMedia>4.9) {
				System.out.printf("Aluno aprovado.%n");
				System.out.printf("Media final: %.1f%n", novaMedia);
			}else if(novaMedia<=4.9) {
				System.out.printf("Aluno reprovado.%n");
				System.out.printf("Media final: %.1f%n", novaMedia);
			}
				
		}
		
		

	}

}


