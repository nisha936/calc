import java.util.*;
public class Add{
	public void adding(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers to be added: ");
		int firstNum = Integer.parseInt(sc.nextLine());
		int secondNum = Integer.parseInt(sc.nextLine());
		int result = firstNum + secondNum;
		System.out.println("The sum is:"+result);
	}

}
