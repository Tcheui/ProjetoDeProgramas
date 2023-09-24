import java.util.Scanner;
public class OperacoesString {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		String nome = scan.nextLine();
		
		System.out.println(nome.length());
		System.out.println(nome.charAt(0));
		System.out.println(nome.charAt(nome.length() - 1));
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		
		String aux = nome;
		for(int i = 0; i < nome.length() ; i++) {
			if(aux.charAt(i) == 'a') {
				aux = aux.substring(0,i) + 'e' + aux.substring(i+1);
			}
		}
		System.out.println(aux);
		
		aux = nome;
		int cont = 0;
		for (int i = 0; i < aux.length(); i++) {
		    if (aux.charAt(i) == 'a' || aux.charAt(i) == 'e' || aux.charAt(i) == 'i' || aux.charAt(i) == 'o' || aux.charAt(i) == 'u' || aux.charAt(i) == 'A' || aux.charAt(i) == 'E' || aux.charAt(i) == 'I' || aux.charAt(i) == 'O' || aux.charAt(i) == 'U') {
		        cont++;
		    }
		}

		aux = nome;
		for (int i = 0; i <= aux.length(); i=i+2) {
			System.out.print(aux.charAt(i));
		}
		System.out.println();
		System.out.println(cont);
		
		scan.close();
	}
}
