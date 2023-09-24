package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
	private int posX, posY, digito;
	
	public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException{
		
		if(posX< 0 || posY < 0) {
        	throw new CoordenadaNegativaException();
        }
		if(posX < 0 || posY < 0 || posX > 30000 || posY > 30000) {
        	throw new CoordenadaForaDosLimitesException();
        }
		this.posX = posX;
		this.posY = posY;
		
		if((posX + posY)%10 != digito || digito < 0 || digito > 9) {
			throw new DigitoInvalidoException();
		}
		this.digito = digito;
	}
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
	
	public double distancia(Coordenada coordenada){
		double deltaX = this.getPosX() - coordenada.getPosX();
        double deltaY = this.getPosY() - coordenada.getPosY();
        
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
	}
	
	public String toString() {
		return this.getPosX() +", "+ this.getPosY();
	}
	
}
