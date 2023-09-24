
public class TurmaEmSala {
	Turma turma = new Turma();
	Sala sala = new Sala();
	
	TurmaEmSala(){
		this(null, null);
	}
	
	TurmaEmSala(Turma turma, Sala sala){
		this.turma = turma;
		this.sala = sala;
	}
}
