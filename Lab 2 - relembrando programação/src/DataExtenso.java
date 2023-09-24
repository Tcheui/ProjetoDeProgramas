import java.util.Scanner;
import java.lang.Math;

public class DataExtenso {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int data = scan.nextInt();
		int dia = (int) Math.floor(data/1000000);
		int mes =  (int) Math.floor((data - dia*1000000)/10000);
		int ano = (int) data - dia*1000000 - mes*10000;
		
		String mesString;
		
		switch (mes) {
        case 1:
            mesString = "janeiro";
            break;
        case 2:
            mesString = "fevereiro";
            break;
        case 3:
            mesString = "março";
            break;
        case 4:
            mesString = "abril";
            break;
        case 5:
            mesString = "maio";
            break;
        case 6:
            mesString = "junho";
            break;
        case 7:
            mesString = "julho";
            break;
        case 8:
            mesString = "agosto";
            break;
        case 9:
            mesString = "setembro";
            break;
        case 10:
            mesString = "outubro";
            break;
        case 11:
            mesString = "novembro";
            break;
        case 12:
            mesString = "dezembro";
            break;
        default:
            mesString = "";
            break;
		}
		
		System.out.printf("%d de %s de %d", dia, mesString, ano);
		
		scan.close();
	}
}
