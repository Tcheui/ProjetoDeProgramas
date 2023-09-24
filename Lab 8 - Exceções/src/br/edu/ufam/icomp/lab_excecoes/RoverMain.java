package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
	public static void main(String[] args) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, 
	DigitoInvalidoException, TamanhoMaximoExcedidoException, 
	DistanciaEntrePontosExcedidaException {
		Caminho caminho = new Caminho(10);
		try {
		Coordenada c = new Coordenada(10, 23, 3);
		Coordenada c1 = new Coordenada(10, 24, 4);
		caminho.addCoordenada(c);
		caminho.addCoordenada(c1);
		caminho.addCoordenada(c1);
		caminho.addCoordenada(c1);
		caminho.addCoordenada(c1);
		caminho.addCoordenada(c1);
		caminho.addCoordenada(c1);
		caminho.addCoordenada(c1);
		caminho.addCoordenada(c1);
		caminho.addCoordenada(c1);
		
		System.out.println(caminho.toString());
		
		} catch(Exception e) {
			caminho.reset();
			System.out.println(e.getMessage());
		}
	}
}
