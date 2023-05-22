import java.util.*;

class Fibonnaci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the limit: ");
		int num = sc.nextInt();

		int f = 0;
		int l = 1;
		if(num == 1) System.out.println("Series = "+f);
		else if(num == 2) System.out.println("Series = "+f+", "+l);
		else{
			System.out.print("Series = "+f+", "+l);
			for(int i = 2;i < num;i++){
				int n = f + l;
				System.out.print(", "+n);
				f = l;
				l = n;
			}
		}
		sc.close();
	}
}