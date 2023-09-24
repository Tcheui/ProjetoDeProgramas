import java.util.Scanner;

public class SomaColecoes {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int valor = 0, col;
	
		do {
			col = 0;
			
			while(valor != -1) {
				col = col + valor;
				valor = scan.nextInt();		
				
			}
			System.out.println(col);
			valor = scan.nextInt();
			
		}while(valor != -1);
		
		scan.close();
	}
}
