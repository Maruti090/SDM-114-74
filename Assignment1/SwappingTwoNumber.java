
import java.util.Scanner;
public class SwappingTwoNumber{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter two Numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("a = " +a +", b = " + b);
			int temp;
			temp = a;
			a = b;
			b = temp;
			System.out.println("a = " +a +", b = " + b);
		 
		}

	}
}
