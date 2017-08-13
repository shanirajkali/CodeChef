import java.util.Scanner;
class TheLeadGame{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int win=0,lead=0;
	
		for(int i=0;i<n;i++){
			int tp1=0;
			int tp2=0;
			tp1=sc.nextInt();
			tp2=sc.nextInt();
			int tlead;
			if(i==0){if(tp1>tp2){win=1;lead=tp1-tp2;}
			else if(tp1<tp2){win=2;lead=tp2-tp1;}
			
			}
			else if(i>1){
				if(tp1>tp2){tlead=tp1-tp2;if(tlead>lead){win=1;lead=tlead;}}
			else if(tp1<tp2){tlead=tp2-tp1;if(tlead>lead){win=2;lead=tlead;}}
			
		
			}
			
		}
		System.out.println(win+" "+lead);
	}
}