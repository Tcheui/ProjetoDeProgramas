import java.util.Scanner;

public class AprovacaoDisciplina {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		double notas[] = new double[100];
		int freq[] = new int[100];
		int ch, i = 0;
		
		double d = scan.nextDouble();
		while(d != -1) {
			notas[i] = d;
			i++;
			d = scan.nextDouble();
		}
		
		i=0;
		int n = scan.nextInt();
		while(n != -1) {
			freq[i] = n;
			i++;
			n = scan.nextInt();
		}
		
		i=
		ch = scan.nextInt();
		
		int ap=0, rn=0, rf=0;
		for(int j=0; j<i; j++) {
			if(freq[j]>=(0.75*ch)) {
				if(notas[j]>=5.0) ap++;
				else rn++;
			}else {
				rf++;
			}
		}
		
		System.out.printf("%d %d %d\n", ap, rn, rf);
		
		scan.close();
	}
}
 