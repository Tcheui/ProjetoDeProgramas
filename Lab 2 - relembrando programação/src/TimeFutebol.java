import java.util.Scanner;

public class TimeFutebol {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int[] vec = new int[20];
		int num = scan.nextInt(), i = 0;
		
		while(num != -1) {
			vec[i] = num;
			i++;
			num = scan.nextInt();
		}
		
		int lng = i, win = 0, lose = 0, emp = 0;
		for(i = 0; i<lng;i++) {
			num = scan.nextInt();
			if(num < vec[i]) {
				win++;
			}else if(num == vec[i]) {
				emp++;
			}else {
				lose++;
			}
		}
		System.out.printf("%d %d %d", win, emp, lose);
		
		scan.close();
	}
}
