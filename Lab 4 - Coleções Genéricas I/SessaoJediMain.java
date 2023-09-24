
public class SessaoJediMain {
	public static void main(String[] args) {
		IniciadoJedi ijedi = new IniciadoJedi();
		IniciadoJedi ijedi2 = new IniciadoJedi();
		TreinadorJedi tjedi = new TreinadorJedi();
		SessaoJedi sessao = new SessaoJedi("DAS", tjedi);
		sessao.addIniciado(ijedi);
		sessao.addIniciado(ijedi2);
		System.out.println(sessao.getDescricao());
	}
	
}
