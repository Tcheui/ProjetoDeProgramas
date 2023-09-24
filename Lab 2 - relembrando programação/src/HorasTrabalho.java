import java.util.Scanner;

public class HorasTrabalho {
	public static int somaVet(int vet[]) {
		int soma = 0;
		for(int i = 0; i < vet.length;i++) {
			soma = soma + vet[i];
		}
		return soma;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int horas[][] = new int[7][100];
		int somas[] = new int[100];
		int j = 0, n = 0;
		
		while(n!=-1) {
			for(int i = 0; i < 7; i++) {
				n = scan.nextInt();
				if(n == -1) {break;}
				horas[j][i] = n;
				somas[j] = somas[j] + n;
				
			}
			j++;
		}
		
		for(int i=0;i<j-1;i++) {
			System.out.println(somas[i]);
		}
				
		scan.close();
	}
}
