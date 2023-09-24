import java.util.ArrayList;

public class Turma {
	int[][] horas = {
			{1, 8, 15, 22, 29},
			{2, 9, 16, 23, 30},
			{3, 10, 17, 24, 31},
			{4, 11, 18, 25, 32},
			{5, 12, 19, 26, 33},
			{6, 13, 20, 27, 34},
			{7, 14, 21, 28, 35}};
	String nome, professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios = new ArrayList<Integer>();
	
	public static int[] qualLinha(int[][] matriz, int valor) {
		int[] tupla = new int[2];
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == valor) {
					tupla[0] = i;
					tupla[1] = j;
					return tupla;
				}
			}
		}
		return null;
	}
	
	Turma(){
		this("Algoritmos e Estrutura de Dados I", "Edleno Silva", 60, true);
	}
	
	Turma(String nome, String professor, int numAlunos, boolean acessivel){
		this.nome = nome;
		this.professor = professor;
		this.numAlunos = numAlunos;
		this.acessivel = acessivel;
	}
	
	void addHorario(int horario) {
		horarios.add(horario);
	}
	
	String getHorariosString() {
		String desc = "";
		int cont = 0;
		for(int horario: horarios) {
			int[] tupla = qualLinha(horas, horario);
			
			switch (tupla[1]) {
			case 0:
				desc = desc + "segunda ";
				break;
			case 1:
				desc = desc + "terça ";
				break;
			case 2: 
				desc = desc + "quarta ";
				break;
			case 3:
				desc = desc + "quinta ";
				break;
			case 4:
				desc = desc + "sexta ";
				break;
			default:
				break;
			}
			desc = desc + String.valueOf(8 + 2*(tupla[0])) + "hs";
			if(cont != (horarios.size() - 1)) {
				desc = desc + ", ";
			}
			cont++;
			
		}
		return desc;
	}
	
	String getDescricao() {
		String aux = "";
		if(this.acessivel == true) {
			aux = "sim";
		}else {
			aux = "não";
		}
		return "Turma: " + this.nome + "\nProfessor: " + this.professor + "\nNúmero de Alunos: " + this.numAlunos + "\nHorário: " + this.getHorariosString() + "\nAcessível: " + aux; 
	}
	
}
