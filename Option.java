import java.util.*;
public class Option{
	public void chooseOption(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your choice: ");
		int input = Integer.parseInt(sc.nextLine());
		if(input==1) {
			System.out.println("Your choice is 1");
		} else if(input==2){
			System.out.println("Your choice is 2");
		} else{
			System.out.println("Invalid choice.");
		}
	}
}

