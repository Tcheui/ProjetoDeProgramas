import java.util.Scanner;

public class CifraCesar {
	public static void charToIntCesar(char a, int k) {
		int numVal = (int) a;
		if(numVal > (90 - k)) {
			numVal = numVal - (26 - k);
		}else {
			numVal+=k;
		}
		char cifrado = (char) numVal;
		System.out.print(cifrado);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		String original = scan.nextLine();
		String cif = original.toUpperCase();
		
		for(int i = 1; i < cif.length(); i++) {
			if(Character.isAlphabetic(cif.charAt(i))) {
				charToIntCesar(cif.charAt(i), k);
			}else {
				System.out.print(cif.charAt(i));
			}
		}
		
		scan.close();
	}
}
