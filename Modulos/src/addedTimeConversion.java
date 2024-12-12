import java.util.Scanner;
public class addedTimeConversion
	{
		static int[][] time = new int [2][3];
	static	int finalHour=0;
	static	int finalMinute=0;
	static	int finalSecond=0;
	static int[] addedTime = new int [3];
				static	Scanner userStringInput = new Scanner(System.in);
				static	Scanner userIntInput = new Scanner(System.in);

					public static void main(String[] args)
						{
							
							
							System.out.println("How many hours are in the first video?");
							int hour1 = userIntInput.nextInt();
							System.out.println("How many minutes are in the first video?");
							int minute1 = userIntInput.nextInt();
							System.out.println("How many seconds are in the first video?");
							int second1 = userIntInput.nextInt();
							System.out.println("How many hours are in the second video?");
							int hour2 = userIntInput.nextInt();
							System.out.println("How many minutes are in the second video?");
							int minute2 = userIntInput.nextInt();
							System.out.println("How many seconds are in the second video?");
							int second2 = userIntInput.nextInt();
							
							time[0][0] = hour1;
							time[0][1] = minute1;
							time[0][2] = second1;
							time[1][0] = hour2;
							time[1][1] = minute2;
							time[1][2] = second2;
							
							addedTime[0]=finalHour;
							addedTime[1]=finalMinute;
							addedTime[2]=finalSecond;
							
							for (int colmn=2; colmn >= 0; colmn-- )
								{
									 
					
									for (int row=1; row >=0; row--)
										{
												addedTime[colmn]= time[row][colmn]+addedTime[colmn];
										}
								}
							
							
							System.out.println(+hour1+":"+minute1+":"+second1+" plus "+hour2+":"+minute2+":"+second2+"is");
				}
					
						
							
						
					
			
	
	
	}//****
