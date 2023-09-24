import java.util.Scanner;
public class AreaPoligono {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int i = 0 ;
		double num, x[] = new double[10], y[] = new double[10];
		do {
			num = scan.nextDouble();
			if(num!=-1) {
				x[i] = num;
				i++;				
			}
			
		}while(num!=-1);
		
		int tamVec = i; 
		i=0;
		do {
			num = scan.nextDouble();
			if(num!=-1) {
				y[i] = num;
				i++;				
			}
		}while(num!=-1);
		
		double area = 0;
		for(i = 0; i < tamVec - 1; i++) {
			area = area + (x[i+1]+x[i])*(y[i+1]-y[i]);
		}
		
		System.out.printf("%.4f", 0.5*Math.abs(area));
		scan.close();
	}
	
}
