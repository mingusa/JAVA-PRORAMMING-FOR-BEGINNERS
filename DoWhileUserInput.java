//Working with Do While and asking for UserInput
import java.util.Scanner;
public class DoWhileUserInput {
private static int value;

public static void main(String[]args) {
Scanner input=new Scanner(System.in);
int x=0;
do {
	System.out.print("Enter a value:");
	value=input.nextInt();
}while(value !=10);
}
}
