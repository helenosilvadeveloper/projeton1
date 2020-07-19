import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();

		float perimetro;
		float area;
			
			if(A+B>C||B+C>A||A+C>B) {
				perimetro = A+B+C;
				System.out.printf("Perimetro = %.1f%n", perimetro);
			}else {
				area = ((A + B) * C)/2;
				System.out.printf("Area = %.1f%n", area);
			}
	}

}








