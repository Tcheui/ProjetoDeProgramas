import java.util.Scanner;

public class Palindromos {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String texto = scan.nextLine();
		
		texto = texto.replace(" ", "");
		texto = texto.toUpperCase();
		
		int i = 0, f = texto.length() - 1, result = 1;
		while(i < f) {
			if(texto.charAt(i) != texto.charAt(f)) {
				result = 0;
			}
			i++;
			f--;
		}
		
		System.out.print(texto);
		System.out.print(" ");
		System.out.print(result);
		
		scan.close();
	}
}
