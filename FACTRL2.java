import java.math.BigInteger;
import java.util.Scanner;  

class FactorialOfBigInteger{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		if(t<1||t>100)
		{System.exit(0);}
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			if(n<1||n>100){System.exit(0);}
			
			BigInteger fact=new BigInteger("1");
			for(int j=1;j<=n;j++)
			{
			String fac=Integer.toString(j);
			BigInteger b2=new BigInteger(fac);
				fact=fact.multiply(b2);
			}
			System.out.println(fact);
		}
	}
}