package codechef;
import java.io.*;
class GFG{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String[] out=new String[t];
		int[] rain=new int[8];
		int a=0;
	wh:	while(t>0){t--;
			br.readLine();
			String[] s=br.readLine().split(" ");
			int[] arr=new int[s.length];
			for(int i=0;i<s.length;i++){
				arr[i]=Integer.parseInt(s[i]);
				
			}
			int len=s.length/2;
			int r=1;
			for(int i=0,j=s.length-1;i<=len;i++,j--){
			 if((arr[i]==arr[j])&&(arr[i]==r)&&arr[i]<8){
			 	continue;
			 	}
			 if((arr[i]==arr[j])&&(arr[i]==(r+1))&&arr[i]<8){
			 	r++;
			 	continue;
			 }
			 else out[a]="No";
			 a++;
			 continue wh;
			}
			out[a]="Yes";
			a++;
			
		}
		for(String i:out){
			System.out.println(i);
		}
	}
}  