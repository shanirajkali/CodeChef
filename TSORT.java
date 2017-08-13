import java.util.Scanner;
class TSORT{
	public static void main(String args[])
	{
		Scanner sn=new Scanner(System.in);
		int len=sn.nextInt();
		int[] list=new int[len];
		if(len>1000000){

			System.exit(0);
		}
		for(int i=0;i<len;i++){
			list[i]=sn.nextInt();
			if(list[i]<0||list[i]>1000000){

			System.exit(0);
		}
		}
		System.out.println();
		int i=0;
		for(i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++)
			if(list[i]>list[j]){
				int temp=list[i];
				list[i]=list[j];
				list[j]=temp;
			}
			System.out.println(list[i]);
		}
		System.out.println(list[i]);
	}
}