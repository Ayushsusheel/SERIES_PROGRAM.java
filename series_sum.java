import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER UPTO WHAT SERIES U WANT");
		int number=sc.nextInt();
		float result=0;
		
		for(float i=1;i<=number;i++)
		{
		    result+=1/i;
		}
	System.out.println("THE RESULT IS :" + result);
	    
	}
}











