package hw;

public class Pascal
{
	public static void main(String[] args)
	{
		int no;
		for(int i=0;i<=3;i++)
		{
			no=1;
			for( int j=0;j<=i;j++)
			{
				System.out.print(no+" ");
				no=no*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
}
