package codechef;
import java.util.Scanner;
class NITIKA{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();
		while(t>0){t--;
		
			String[] s=in.nextLine().split("\\s");
			int i=s.length;
			while(i>0){i--;
				if(i+1==s.length)
				s[i]=s[i].substring(0,1).toUpperCase()+s[i].substring(1);
				else{s[i]=s[i].substring(0,1).toUpperCase()+".";}
			}
			i=0;
			while(i<s.length){
				System.out.print(s[i]+" ");i++;
				}
			
		}
	}
} 