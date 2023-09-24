
public class EnsalamentoMain {
	public static void main(String[] args) {
		Ensalamento e = new Ensalamento();
		Sala sala1 = new Sala(), sala2 = new Sala();
		Turma t1 = new Turma(), t2 = new Turma();
		t2.professor = "Gabriel";
		sala2.sala = 102;
		t2.numAlunos = 40;
		t1.addHorario(9);
		t2.addHorario(18);
		
		e.addSala(sala1);
		e.addSala(sala2);
		e.addTurma(t1);
		e.addTurma(t2);
	
		
		e.alocarTodas();
		System.out.println(e.relatorioTurmasPorSala());
	}
	
}	
