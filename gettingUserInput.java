import java.util.Scanner;
public class gettingUserInput {
public static void main(String[]args) {
	//creating scanner object
	Scanner input=new Scanner(System.in);
	
	//output
	System.out.print("Enter floating value please");
	double value=inputnextDouble();
	
	//Tell the user what as entered
	System.out.print("You've entered:"+value);
	 

}

private static double inputnextDouble() {
	// TODO Auto-generated method stub
	return 5.5;
}
}
