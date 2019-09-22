import java.util.Scanner;

public class Fritz_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int measure;
		double BMI = 0;
		double pounds;
		double inches;
		double kilograms;
		double meters;
		double feet;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What is your preference toward system of measurement.");
		System.out.println("For SI or metric system(meters) input 1, to use Customary(Inches,lbs) please input 0.");
		
		measure = scnr.nextInt();
		
		if(measure < 0 || measure > 1)
		{
			System.out.print("That is not one of the options, please input either 1, for SI unit(meters),");
			System.out.println(" or 0 for Customary units(lbs, inches)");
			measure = scnr.nextInt();
		}
		
		if(measure == 1)
		{
			System.out.println("How tall are you in meters?");
			meters = scnr.nextDouble();
			System.out.println("How much do you weigh in kilograms?");
			kilograms = scnr.nextDouble();
			
			BMI = (kilograms / (meters * meters));
		}
		
		if(measure == 0)
		{
			System.out.println("How tall are you in inches? If you do not know your height in inches please enter 0.");
			inches = scnr.nextDouble();
			
			if(inches < 0 || inches > 120)
			{
				System.out.println("This is not a proper height in inches please enter your height in inches,"
						+ " if you don't know your height in inches enter 0.");
			}
			if(inches == 0)
			{
				System.out.println("How many feet tall are you?");
				feet = scnr.nextDouble();
				System.out.format("You are %.0f feet and how many inches tall?\n",feet);
				inches = scnr.nextDouble();
				
				inches = (feet * 12) + inches;
			}
			System.out.println("How much do you weigh in pounds?");
			pounds = scnr.nextDouble();
			
			BMI = ((703 * pounds) / (inches * inches));
			
		}
		
		System.out.format("Your BMI is: %.2f\n",BMI);
		System.out.format("\nBMI Categories:\n");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25 – 29.9");
		System.out.println("Obesity = BMI of 30 or greater");
	}

}
