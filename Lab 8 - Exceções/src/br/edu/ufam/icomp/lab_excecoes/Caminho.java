package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
	private int tamanho = 0;
	private Coordenada[] caminho;
	
	public Caminho(int maxTam) {
		this.caminho = new Coordenada[maxTam];
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException{
		if(this.tamanho >= this.caminho.length) {
			throw new TamanhoMaximoExcedidoException();
			
		}
		
		else if(tamanho != 0 && (caminho[tamanho - 1].distancia(coordenada) > 15)){
			throw new DistanciaEntrePontosExcedidaException();
		}
			
		else {
			caminho[tamanho] = coordenada;
			tamanho++;
		}
		
	}
	
	public void reset() {
		this.caminho = new Coordenada[this.tamanho];
	}
	
	public String toString() {
		String msg = "";
		
		msg = msg + "Dados do caminho:\n" + "  - Quantidade de pontos: " + this.tamanho + "\n  - Pontos:\n";
		
		for(int i = 0; i < this.tamanho ; i++) {
			msg = msg + "    -> " + caminho[i].toString() + "\n";
		}
		
		return msg;
	}
}
