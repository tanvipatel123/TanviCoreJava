package hw;

public class RightOddEven 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			{
			for(int k=i;k<=5;k++)
			{
				System.out.print(" ");
			}
			}
			for(int j=1;j<=i;j++)
			{
				if((j+i)%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
	}
}

