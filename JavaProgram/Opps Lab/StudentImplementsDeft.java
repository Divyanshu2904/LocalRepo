//Create a interface deft having 3 indivisual data physics,chemistry,math.

import java.util.Scanner;

public class StudentImplementsDeft {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Physics, Chemistry, Biology, Mathematics, Computer; 
	    float total, Percentage;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Five Subjects Marks : ");
		Physics = sc.nextInt();	
		Chemistry = sc.nextInt();	
		Biology = sc.nextInt();	
		Mathematics = sc.nextInt();	
		Computer = sc.nextInt();	
		
		total = Physics + Chemistry + Biology + Mathematics + Computer;
	    Percentage = (total / 500) * 100;
	 
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Marks Percentage =  " + Percentage);
		
		if(Percentage >= 90)
	    {
			System.out.println("\n Grade A");
		}
		else if(Percentage >= 80)
	    {
			System.out.println("\n Grade B");
		}
		else if(Percentage >= 70)
	    {
			System.out.println("\n Grade C");
		}
		else if(Percentage >= 60)
	    {
			System.out.println("\n Grade D");
		}
		else if(Percentage >= 40)
	    {
			System.out.println("\n Grade E");
		}
		else 
	    {
			System.out.println("\n Grade F");
		} 
	}
}
