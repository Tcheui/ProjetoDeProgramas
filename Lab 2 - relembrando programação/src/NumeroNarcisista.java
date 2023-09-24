
import java.util.Scanner;
import java.lang.Math;

public class NumeroNarcisista {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num, num_digitos = 0, acumulado = 0;
		num = scan.nextInt();
		
		while(Math.floor(num/Math.pow(10, num_digitos) ) > 0) {
			num_digitos++;
		}
		
		int last_digit = 0;
		int original = num;
		
		for(int i = num_digitos - 1; i >= 0;i--) {
			num = num - last_digit*(int)Math.pow(10, i + 1);
			acumulado = acumulado + (int)Math.pow((Math.floor(num/Math.pow(10, i))), num_digitos);
			last_digit = (int) Math.floor(num/Math.pow(10, i));
			
		}
		
		if(acumulado == original) {
			System.out.println("SIM");
		}else {
			System.out.println("NAO");
		}
		
		scan.close();
	}
}
