import java.util.Scanner;

public class Prime {
	private void prino() {
		Scanner s= new Scanner(System.in);
		System.out.println(" enter the number");
	int a = s.nextInt();
	if (a%2==0) {
		System.out.println("not a prime");
	}else {
		System.out.println("prime");
	}
		
	}
	public static void main(String[] args) {
		Prime e= new Prime();
		e.prino();
	}
}
	



