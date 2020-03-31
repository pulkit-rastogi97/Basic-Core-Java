import java.util.Scanner;


public class QuesThree {

	public static int[] findPrime(int start, int end)
	{
		int flag;
		int k =0;
		int[] arr = new int[end-start];
		if(start<2)
			start=2;
		for(int i = start; i<=end; i++)
		{
			flag=0;
			for(int j = 2; j<i; j++)
			{
				if(i%j==0)
				{
					flag++;
				}
			}
			if(flag==0)
			{
				arr[k]=i;
				k++;
			}
		}		
		return arr;
	}
	public static void main(String[] args) {
		System.out.println("Enter the starting point : ");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		System.out.println("Enter the ending point : ");
		int end = sc.nextInt();
		
		int[] result=findPrime(start,end);
		System.out.println("The Prime no. in the given range is as follows : ");
		for(int x : result)
		{
			if(x!=0)
				System.out.print(x+" ");
		}
			
		
		sc.close();
	}
}
