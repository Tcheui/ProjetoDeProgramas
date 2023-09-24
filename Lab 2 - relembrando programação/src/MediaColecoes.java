import java.util.Scanner;

public class MediaColecoes {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num = 0, cont = 0;
		while (num != -1) {
			cont = -1;
			if(num != 0) {
				cont++;
			}
			double col = 0;
			while(num != -1) {
				if(num != -1) {
					col = col + num;
					cont++;
				}
				num = scan.nextInt();
			}
			
			double media = col/cont;
			System.out.printf("%.2f \n", media);
			num = scan.nextInt();
		}
		
		scan.close();
	}
}
