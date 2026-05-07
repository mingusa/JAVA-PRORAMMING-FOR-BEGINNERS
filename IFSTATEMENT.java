/*WORKING WITH IF STATEMENT
 */
public class IFSTATEMENT {
	public static void main(String[]args) {
		int testscore=78; /*passmark*/
		char grade;
		if(testscore>=90) {
			grade='A';
		}else if(testscore>=80){ /*creates another condition*/
			grade='B';
		}else if(testscore>=70) {
			grade='C';
		}else {          /*closes the condition*/
			grade='F';
		}System.out.print("\n"+"Grade:"+grade);
	}

}
