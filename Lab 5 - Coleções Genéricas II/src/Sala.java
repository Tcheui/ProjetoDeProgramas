
public class Sala {
	int bloco, sala, capacidade;
	boolean acessivel;
	
	Sala(){
		this(6, 101, 50, true);
	}
	
	Sala(int bloco, int sala, int capacidade, boolean acessivel){
		this.bloco = bloco;
		this.sala = sala;
		this.capacidade = capacidade;
		this.acessivel = acessivel;
	}
	
	String getDescricao() {
		String desc = "Bloco " + this.bloco + ", Sala " + this.sala + " (" + this.capacidade + " lugares, ";
		if(this.acessivel) {
			desc = desc + "acessível)";
		}else {
			desc = desc + "não acessível)";
		}
		return desc;
	}
}
