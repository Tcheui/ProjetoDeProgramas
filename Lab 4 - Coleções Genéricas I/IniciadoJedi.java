
public class IniciadoJedi {
	String nome, especie;
	int anoNascimento;
	
	IniciadoJedi(){
		this("Katooni", "Tholothian", -23);
	}
	
	IniciadoJedi(String nome, String especie, int anoNascimento){
		this.nome = nome;
		this.especie = especie;
		this.anoNascimento = anoNascimento;
	}
	
	String getAnoNascimento(){
		if(this.anoNascimento < 0) {
			return -1*this.anoNascimento + " ABY";
		}else {
			return this.anoNascimento + " DBY";
		}
	}
	
	String getDescricao() {
		return this.nome + " (especie=" + this.especie + ", nascimento=" + this.getAnoNascimento() + ")";
		
	}
	
}
