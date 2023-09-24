
public class TreinadorJedi {
	String titulacao, nome;
	
	TreinadorJedi(){
		this("Grão-Mestre", "Fae Coven");
	}
	
	TreinadorJedi(String titulacao, String nome){
		this.titulacao = titulacao;
		this.nome = nome;
	}
	
	String getDescricao(){
		return this.titulacao + " " + this.nome;
	}
}
