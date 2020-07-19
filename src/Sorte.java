import java.util.Scanner;

public class Sorte {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int v3 = sc.nextInt();

		
		if(v1>v2&&v1>v3&&v3>v2)
			System.out.printf("%d%n %d%n %d%n",v2,v3,v1);
		
		else if(v1<v2&&v1<v3&&v3<v2)
			System.out.printf("%d%n %d%n %d%n",v1,v3,v2);
		
		else if(v3>v2&&v3>v1&&v1>v2)
			System.out.printf("%d%n %d%n %d%n",v2,v1,v3);
		
		else if(v3<v2&&v3<v1&&v1<v2)
			System.out.printf("%d%n %d%n %d%n",v3,v1,v2);
		
		else if(v2>v1&&v2<v3)
			System.out.printf("%d%n %d%n %d%n",v1,v2,v3);
		
		else if (v2>v3&&v1>v2)
			System.out.printf("%d%n %d%n %d%n",v3,v2,v1);
		
		System.out.println();
		
		System.out.printf("%d%n",v1);
		System.out.printf("%d%n",v2);
		System.out.printf("%d%n",v3);
		
		
		
		
		
		
		
	}
}