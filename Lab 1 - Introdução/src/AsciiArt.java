import java.util.Scanner;

public class AsciiArt {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int asc = scan.nextInt();
		
		int aux = 0;
		
		while(aux < asc) {
			for(int i = 0; i < (asc - aux); i++) {
				System.out.print("*");
			}
			for(int i = 0; i < aux*2; i++) {
				System.out.print(" ");
			}
			for(int i = 0; i < (asc - aux); i++) {
				System.out.print("*");
			}
			
			System.out.println("");
			aux = aux + 1;
		}
		
		scan.close();
	}
}
