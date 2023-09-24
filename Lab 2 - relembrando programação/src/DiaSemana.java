import java.util.Scanner;

public class DiaSemana {
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
		int somas[] = new int[7];
		int j = 0, n = 0;
		
		while(n!=-1) {
			for(int i = 0; i < 7; i++) {
				n = scan.nextInt();
				if(n == -1) {break;}
				horas[j][i] = n;
				somas[i] = somas[i] + n;
			}
			j++;
		}
		
		int maisHoras = 0;
		for(int i=0;i<7;i++) {
			if(maisHoras < somas[i]) {
				maisHoras = somas[i];
			}
		}
		for(int i=0;i<7;i++) {
			if(maisHoras == somas[i]) {
				System.out.println(i+1);
			}
		}
				
		scan.close();
	}
}
