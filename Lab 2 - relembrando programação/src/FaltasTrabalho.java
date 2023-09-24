import java.util.Scanner;

public class FaltasTrabalho {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		double[] vec = new double[6];
		int i = 0, cont = 0;
		while(num != -1) {
			cont++;
			switch (num) {
			case 2:
				vec[0]++;
				break;
			case 3:
				vec[1]++;
				break;
			case 4:
				vec[2]++;
				break;
			case 5:
				vec[3]++;
				break;
			case 6:
				vec[4]++;
				break;
			case 7:
				vec[5]++;
				break;
			default:
				break;
			}
			num = scan.nextInt();
		}
		
		for(i = 0; i<6; i++) {
			System.out.printf("%.1f",(float) 100*(vec[i]/cont));
			System.out.print(" ");
		}
		
		scan.close();
	}
}
