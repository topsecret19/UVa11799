import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		int n,runners,speed;
		int fastest=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
			for(int i=1; i<=n; i++) {
				runners = sc.nextInt();
				for(int j=0; j<runners; j++) {
					speed=sc.nextInt();
					if(speed>fastest) {
						fastest=speed;
					}
				}
				System.out.println("Case "+i+": "+fastest);
				fastest=0;
			}
			
	}

}
