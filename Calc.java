import java.util.*;
public class Calc{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Add add = new Add();
		for(int i = 0; i<5; i++){
			System.out.println("\n");
		}

		System.out.println("Welcome to the Calculator app.");
		System.out.print("Enter 1 to add: ");
		int input = Integer.parseInt(sc.nextLine());
		if(input==1){
			add.adding();
		}
	}
}
