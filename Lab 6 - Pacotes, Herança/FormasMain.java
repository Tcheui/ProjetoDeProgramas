package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {
	public static void main(String[] args) {
		
		FormaGeometrica vet[] = new FormaGeometrica[10];
		Circulo c = new Circulo(0, 0, 0);
		Retangulo r = new Retangulo(0, 0, 0, 0);
		Quadrado q = new Quadrado(1, 1, 1);
		
		vet[0] = c;
		vet[1] = r;
		vet[2] = q;
		
		for(int i = 0; i<3 ;i++) {
			System.out.println(vet[i]);
		}
	}
}
