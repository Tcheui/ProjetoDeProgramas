package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica {
	public double raio;
	double pi = Math.PI;
	
	public Circulo(int posX, int posY, double raio) {
		super(posX, posY);
		this.raio = raio;
	}

	public double getArea() {
		double area = pi*this.raio*this.raio;
		return area;
	}

	public double getPerimetro() {
		double per = 2*pi*this.raio;
		return per;
	}
	
	public String toString() {
		return "Círculo na " + this.getPosString() + "com raio de " + this.raio + "cm (área=" +this.getArea() + "cm2, perímetro=" + this.getPerimetro() + "cm)"; 
	}
}
