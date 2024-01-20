import java.util.Scanner;
public class addarray1{
	public static void main(String[] arg){
		Scanner s=new Scanner(System.in);
		int [] d=new int [5];
		for (int i=0; i<d.length; i++){
			System.out.println("Enter "+ (i+1));
			d[i]=s.nextInt();
		}
		int max=d[0];
		for(int i=1; i<d.length; i++){
			if (max<d[i])
			max=d[i];
		}
		System.out.println("maximum number:" + max);
	}
}
			