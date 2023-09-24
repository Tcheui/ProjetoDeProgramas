import java.util.ArrayList;

public class Ensalamento {
	ArrayList<Sala> salas = new ArrayList<Sala>();
	ArrayList<Turma> turmas = new ArrayList<Turma>();
	ArrayList<TurmaEmSala> ensalamento = new ArrayList<TurmaEmSala>();
	
	Ensalamento(){		
	}
	
	void addSala(Sala sala) {
		salas.add(sala);
	}
	
	void addTurma(Turma turma) {
		turmas.add(turma);
	}
	
	Sala getSala(Turma turma) {
		for(TurmaEmSala e: ensalamento) {
			if(e.turma == turma) {
				return e.sala;
			}
		}
		return null;
	}
	
	boolean salaDisponivel(Sala sala, int horario) {
		for (TurmaEmSala e: ensalamento) {
			if(e.sala == sala) {
				for(int h: e.turma.horarios) {
					if(h == horario) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
		for(int h: horarios) {
			if(salaDisponivel(sala, h) == false) {
				return false;
			}
		}
		return true;
	}
	
	boolean alocar(Turma turma, Sala sala) {
		if(this.salaDisponivel(sala, turma.horarios)) {
			if(sala.capacidade >= turma.numAlunos) {
				if(turma.acessivel == true) {
					if(sala.acessivel == true) {
						TurmaEmSala aloca = new TurmaEmSala(turma, sala);
						ensalamento.add(aloca);
						return true;
					}
				}else {
					TurmaEmSala aloca = new TurmaEmSala(turma, sala);
					ensalamento.add(aloca);
					return true;
				}
			}
		}
		return false;
	}
	
	void alocarTodas() {
		for(Turma t: this.turmas) {
			int tentarExcesso = 0, acumulado = 0;
			boolean conseguiu = false;
			
			ArrayList<Integer> bad = new ArrayList<Integer>();
			
			while((acumulado < salas.size()) && (conseguiu == false)) {
				int i = 0;
				while(i < salas.size()) {
					int excesso = salas.get(i).capacidade - t.numAlunos;
					if(excesso < 0) {
						if(bad.contains(i) == false) {
							acumulado++;
							bad.add(i);
						}
					}
					else if(excesso == tentarExcesso) {
						acumulado++;
						conseguiu = this.alocar(t, salas.get(i));
						if(conseguiu) {
							break;
						}
					}
					i++;
				}
				tentarExcesso++;
			}
			bad.clear();
		}
	}
	
	int getTotalTurmasAlocadas() {
		int cont = 0;
		for(TurmaEmSala e: ensalamento) {
			if(e.sala != null) {
				cont++;
			}
		}
		
		return cont;
	}
	
	int getTotalEspacoLivre() {
		int total = 0;
		for(TurmaEmSala e: ensalamento) {
			total += e.sala.capacidade - e.turma.numAlunos;
		}
		return total;
	}
	
	String relatorioResumoEnsalamento() {
		int total_salas = salas.size(), total_turmas = turmas.size(), turmas_alocadas = getTotalTurmasAlocadas(), espacos_livres = getTotalEspacoLivre();
		String mensagem = "Total de Salas: " + total_salas +
                "\nTotal de Turmas: " + total_turmas +
                "\nTurmas Alocadas: " + turmas_alocadas +
                "\nEspaços Livres: " + espacos_livres ;
		
		return mensagem;
	}
	
	String relatorioTurmasPorSala() {
		String mensagem = relatorioResumoEnsalamento() + "\n";
		
		for(Sala s: salas) {
			mensagem += "\n--- " + s.getDescricao() + " ---\n";
			for(TurmaEmSala e: ensalamento) {
				if(e.sala == s) {
					mensagem += "\n" + e.turma.getDescricao() + "\n";
				}
			}
		}
		return mensagem;
	}
	
	String relatorioSalasPorTurma() {
		String mensagem = relatorioResumoEnsalamento() + "\n";
		for(Turma t: turmas) {
			mensagem += t.getDescricao() + "\nSala: ";
			Sala aux = getSala(t);
			if(aux != null) {
				mensagem += aux.getDescricao()+ "\n";
			}else {
				mensagem += "SEM SALA\n";
			}
		}
		
		return mensagem;
	}
}
