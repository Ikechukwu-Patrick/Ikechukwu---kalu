import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[]args) {

	Scanner scanner = new Scanner(System.in);  


	int outCome = 0;

	System.out.print("Enter number range from 1 to 12: ");
	int userInput = scanner.nextInt();

	if(userInput < 1 || userInput > 12 ){
	System.out.print("Chibuzor suppose collect your laptop for 2 weeks  ");
	
	}
else{
    	 int kanta = 1; 
	while(kanta <= 12) {
		outCome = userInput * kanta;
		System.out.println(userInput + "  *  " + kanta + "  =  " + outCome );




                kanta = kanta + 1;
        }

}
   


}	
}			
	















