import java.util.Hashtable;
import java.util.LinkedList;

public class ListaInvertida {
	private Hashtable<String, LinkedList<String>> tabela;
	
	public ListaInvertida() {
		this.tabela = new Hashtable<String, LinkedList<String>>();
	}
	
	public boolean insere(String palavra, String documento) {
		LinkedList<String> lista = tabela.get(palavra);
		
		if(lista == null) { //palavra não mapeada
			lista = new LinkedList<String>();
			tabela.put(palavra, lista);
			lista.add(documento);
			return true;
		}else if(lista.contains(documento) == false) {
			lista.add(documento);
			return true;
		}
		
		return false;
	}
	
	public LinkedList<String> busca(String palavra){
		return tabela.get(palavra);
	}
	
	public String toString() {
		return tabela.toString();
	}
	
}
