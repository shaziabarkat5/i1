import java.util.*;
public class intervalamstrong 
{
	public static void main(String[] args) {
     
		int a1=0,a2=0;
		Scanner a = new Scanner(System.in);
		System.out.println("enter a limit1 :");
		a1 = a.nextInt();
		System.out.println("enter the limit2 :");
		a2 = a.nextInt();
		a.close();
		for(int i=a1+1;i<a2;i++)
		{
			int a3 = i,rem=0,s=0;
			while(a3!=0)
			{
				rem = a3%10;
				s= s+ rem * rem * rem;
				a3= a3/10;
				
			}
			if(i==s)
			{
				System.out.println(i);
			}
		}

	}

}
