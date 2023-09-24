import java.util.Scanner;

public class AreaVolume {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		double raio = scan.nextDouble();
		double area = Math.PI*Math.pow(raio, 2);
		double vol = 4*Math.PI*Math.pow(raio, 3)/3;
		
		System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\r\n", raio, area);
		System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.", raio, vol);
		
		scan.close();
	}
}
