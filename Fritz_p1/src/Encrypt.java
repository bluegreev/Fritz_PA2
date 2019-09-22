import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original;
		int[] digitArray;
		int i;
		int swap1_3;
		int swap2_4;
		int encrypt = 0;
		int number;
		
		digitArray = new int[4];
		Scanner scnr = new Scanner(System.in);
		
		number = 0;
		
		
		while(number != -1)
		{
			System.out.println("Would you like to encrypt a code, if so input 0, if not please input -1.");
			number = scnr.nextInt();
			if(number == -1)
			{
				break;
			}
			System.out.println("What four digit code would you like to encrypt?");
		
			original = scnr.nextInt();
			
			if((encrypt < 0) || (encrypt > 9999))
			{
				System.out.println("You have not entered a proper four digit code.");
				System.out.println("Please enter a proper four digit code.");
				original = scnr.nextInt();
			}
		
			digitArray[0] = (original / 1000);
			digitArray[1] = ((original / 100) % 10);
			digitArray[2] = ((original / 10) % 10);
			digitArray[3] = (original % 10);
			
			for(i = 0; i < 4; i++)
			{
				digitArray[i] = ((digitArray[i] + 7) % 10);
			}
		
			swap1_3 = digitArray[0];
			digitArray[0] = digitArray[2];
			digitArray[2] = swap1_3;
		
			swap2_4 = digitArray[1];
			digitArray[1] = digitArray[3];
			digitArray[3] = swap2_4;
		
			encrypt = ((digitArray[0] * 1000) + (digitArray[1] * 100) + (digitArray[2] * 10) + digitArray[3]);
			System.out.println("The new encrypted code is: " + encrypt + ".");
			
			System.out.println("Would you like to encrypt another code? If so please input the number 0, if not please input -1.");
			number = scnr.nextInt();
		}
	}

}
