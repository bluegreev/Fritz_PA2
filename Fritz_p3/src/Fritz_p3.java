import java.util.Scanner;

public class Fritz_p3 {

	public static void main(String[] args) {
	
		String[] topics;
		int[][] responses;
		int i;
		int j;
		int rating;
		int flag = 1;
		int max_rating;
		int lowest_rating;
		
		responses = new int[5][10];
		topics = new String[5];
		
		Scanner scnr = new Scanner(System.in);
		
		topics[0] = "Videogames";
		topics[1] = "Movies";
		topics[2] = "Memes";
		topics[3] = "Comics";
		topics[4] = "Sports";
		
		
		while(flag == 1)
		{
			System.out.println("Please enter a rating for each of "
					+ " the following 5 topics.");
			System.out.println("Please rate them on a scale from 1 (least important) to 10 (most important)");
			for(i = 0; i < 5; i ++)
			{
				System.out.format("Please enter your rating for %s.\n",topics[i]);
				rating = scnr.nextInt();
				if(rating < 1 || rating > 10)
				{
					System.out.println("That was not a proper rating. Please input a value between 1 and 10.");
					rating = scnr.nextInt();
				}
				responses[i][rating - 1] ++;
			}
			System.out.println("Would another person like to take our poll? If yes input 1, if not input 0.");
			flag = scnr.nextInt();
		}
		System.out.print("          ");
		for(i = 0; i < 10; i ++)
		{
			System.out.format("%6d",i + 1);
		}
		for(i = 0; i < 5; i++)
		{
			System.out.printf("\n%10s",topics[i]);
			for(j = 0; j < 10; j++)
			{
				System.out.printf("%6d",responses[i][j]);
			}
		}
	}
	
	for(i = 0; i < 5)

}
