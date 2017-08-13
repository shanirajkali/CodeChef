import java.util.Scanner;
class ATM
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int wid=sc.nextInt();
		float bal=sc.nextFloat();
		if(bal>2000||bal<0||wid>2000||wid<1){System.exit(0);}
		
		if(wid%5!=0){System.out.println(bal);System.exit(0);}
		float f=bal-wid;
		if(f<0.5f){System.out.println(bal);System.exit(0);}
		bal=bal-wid-0.5f;
		
		System.out.println(bal);
	}

}