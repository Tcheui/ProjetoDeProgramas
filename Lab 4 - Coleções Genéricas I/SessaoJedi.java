import java.util.ArrayList;

public class SessaoJedi {
	String nome;
	TreinadorJedi treinador;
	ArrayList<IniciadoJedi> iniciados = new ArrayList<IniciadoJedi>();
	
	SessaoJedi(String nome, TreinadorJedi treinador){
		this.nome = nome;
		this.treinador = treinador;
	}
	
	void addIniciado(IniciadoJedi iniciado) {
		iniciados.add(iniciado);
	}
	
	IniciadoJedi getIniciado(String nome) {
		int i = 0;
		while(i<iniciados.size()) {
			if(iniciados.get(i).nome == nome) {
				return iniciados.get(i);
			}
			i++;
		}
		return null;
	}
	
	double getMediaAnoNascimento() {
		double media = 0;
		for(IniciadoJedi jedi: iniciados) {
			media = jedi.anoNascimento + media;
		}
		if(iniciados.size() > 0) {
			return media/iniciados.size();
		}else {
			return 0;
		}
	}
	
	String getDescricao() {
		String desc = "--> SESSÃO "+ this.nome +" (Treinador: " + this.treinador.getDescricao() + ")";
		for(IniciadoJedi jedi: iniciados) {
			desc = desc + "\n  - Iniciado " +(iniciados.indexOf(jedi)+1)+ ": " + jedi.getDescricao();
		}
		return desc;
	}
}
