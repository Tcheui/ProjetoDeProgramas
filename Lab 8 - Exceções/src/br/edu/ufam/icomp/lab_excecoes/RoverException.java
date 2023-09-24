package br.edu.ufam.icomp.lab_excecoes;

public class RoverException extends Exception {
	String msg = "Exceção geral do rover";
	public RoverException(String msg) {
		super(msg);
	}
	
	public RoverException() {
		super("Exceção geral do rover");
	}
}
