import java.util.Scanner; 
import java.lang.Math;
public class ValorExpoente {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int cont = 0, soma = 0;
		while(num >= soma) {
			cont++;
			soma = soma + (int)Math.pow(2, cont); 
		}
		System.out.print(cont);
		
		scan.close();
	}
}
