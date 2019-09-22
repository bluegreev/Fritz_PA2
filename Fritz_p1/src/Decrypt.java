import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		
		int[] digitArray;
		int i;
		int swap1_3;
		int swap2_4;
		int decrypt;
		int number;
		
		digitArray = new int[4];
		Scanner scnr = new Scanner(System.in);
		
		number = 0;
		
		
		while(number != -1)
		{
			System.out.println("Would you like to decrypt a code, if so input 0, if not please input -1.");
			number = scnr.nextInt();
			if(number == -1)
			{
				break;
			}
			System.out.println("What four digit code would you like to decrypt?");
		
			decrypt = scnr.nextInt();
			
			if((decrypt < 0) || (decrypt > 9999))
			{
				System.out.println("You have not entered a four digit code.");
				System.out.println("Please enter a proper four digit code.");
				decrypt = scnr.nextInt();
			}
		
			digitArray[0] = (decrypt / 1000);
			digitArray[1] = ((decrypt / 100) % 10);
			digitArray[2] = ((decrypt / 10) % 10);
			digitArray[3] = (decrypt % 10);
		
			swap1_3 = digitArray[0];
			digitArray[0] = digitArray[2];
			digitArray[2] = swap1_3;
		
			swap2_4 = digitArray[1];
			digitArray[1] = digitArray[3];
			digitArray[3] = swap2_4;
		
			for(i = 0; i < 4; i++)
			{
				digitArray[i] = ((digitArray[i] + 13) % 10);
			}
		
			decrypt = ((digitArray[0] * 1000) + (digitArray[1] * 100) + (digitArray[2] * 10) + digitArray[3]);
			System.out.println("The new decrypted code is: " + decrypt + ".");
			
			System.out.println("Would you like to decrypt another code? If so please input the number 0, if not please input -1.");
			number = scnr.nextInt();
		}
	}

}
