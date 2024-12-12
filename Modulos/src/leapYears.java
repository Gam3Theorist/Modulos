import java.util.Scanner;
public class leapYears

	{
	static	Scanner userStringInput = new Scanner(System.in);
	static	Scanner userIntInput = new Scanner(System.in);

		public static void main(String[] args)
			{
			System.out.println("I will tell you leap years! Which year do you want?");
			int year = userIntInput.nextInt();
if (year %4 ==0 && (year%100 != 0  || year%400==0))
	{
		System.out.println(+year+" is a leap year!");
	}
else
	{
		System.out.println("Sorry, not a leap year!");
	}
	
	
			}

	}
