import java.util.*;
public class Subtract{
	public void sub(){
		Scanner sc = new Scanner(System.in);
		Option op = new Option();
		System.out.print("Enter two numbers:");
		int firstNum= sc.nextInt();
		int secondNum=sc.nextInt();
		int result=firstNum - secondNum;
		System.out.println("The difference is :"+ result);
		op.chooseOption();
	}
}
