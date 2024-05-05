package timeComplexityByJava;

public class CalculatingTheTime 
{
	public static void main(String[] args)
	{
		double now = System.currentTimeMillis();
		CalculatingTheTime t1 = new CalculatingTheTime();
		System.out.println("The Sum of (n = 99999) natural numbers"
		                                                   +t1.findSum(99999));
		System.out.println("Time taken--->"+(System.currentTimeMillis()-now)+
				                                                  "in msecond");
	}
//	public int findSum(int n)
//	{
//		return n*(n+1)/2;
//	}
	public int findSum(int n)
	{
		int i,sum=0;
		for(i=1;i<=n;i++)
		{
			sum=sum+i;	
		}
		return sum;
	}
	
}
