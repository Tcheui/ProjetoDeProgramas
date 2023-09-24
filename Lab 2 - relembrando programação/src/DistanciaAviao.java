import java.util.Scanner;

public class DistanciaAviao {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[][] matriz = {
	            { 0, 2, 11, 6, 15, 11, 1 },
	            { 2, 0, 7, 12, 4, 2, 15 },
	            { 11, 7, 0, 11, 8, 3, 13 },
	            { 6, 12, 11, 0, 10, 2, 1 },
	            { 15, 4, 8, 10, 0, 5, 13 },
	            { 11, 2, 3, 2, 5, 0, 14 },
	            { 1, 15, 13, 1, 13, 14, 0 }
	        };
		int comandos[] = new int[100];
		
		int i = 0;
		while(true) {
			int a = scan.nextInt();
			if(a == -1) {break;}
			a = (int) a/100;
			comandos[i] = a - 1;
			i++;
		}
		int soma = 0;
		for(int j = 0; j < i - 1;j++) {
			soma+=matriz[comandos[j]][comandos[j+1]];
		}
		System.out.println(soma);
		scan.close();
	}
}
