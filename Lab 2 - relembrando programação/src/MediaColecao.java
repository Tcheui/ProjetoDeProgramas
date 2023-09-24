import java.util.Scanner;

public class MediaColecao {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int cont = -1, num = 0;
		double col = 0;
		do {
			cont++;
			col = col + num;
			num = scan.nextInt();
		}while(num != -1);
		
		double media = col/cont;
		System.out.printf("%.2f", media);
		
		scan.close();
	}
}
