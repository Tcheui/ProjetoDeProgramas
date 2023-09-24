
public class Mestre {
	String nome, afiliacao, posto;
	int anoNascimento;
	
	Mestre(){
		this("Luke Skywalker", 19, "Alianca para Restauracao da Republica", "Jedi");
	}
	
	Mestre(String nome, int anoNascimento, String afiliacao, String posto){
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.afiliacao = afiliacao;
		this.posto = posto;
	}
	
	int getIdade(int anoReferencia) {
		return (-this.anoNascimento + anoReferencia);
	}
	
	boolean possuiForca() {
		if(this.posto == "Jedi"  || this.posto == "Sith") {
			return true;
		}
		return false;
	}
	
	String getAnoNascimentoString() {
		if(this.anoNascimento < 0) {
			return ((this.anoNascimento * -1) + "ABY");
		}else {
			return ((this.anoNascimento) + "DBY");
		}
	}
	
	String getDescricao() {
		return "Mestre: " + "nome=" + this.nome + ", anoNascimento=" + this.getAnoNascimentoString() + ", afiliacao=" + this.afiliacao + ", posto=" + this.posto + ", possuiForca=" + this.possuiForca() + ".";
	}
}
