
public class Conexao {
	String tipoPorta;
	int idProtocolo, taxaTransmissao;
	
	Conexao(){
		this("SCOMP Link", 1, 4096000);
	}
	
	Conexao(String tipoPorta, int idProtocolo, int taxaTransmissao){
		this.tipoPorta = tipoPorta;
		this.idProtocolo = idProtocolo;
		this.taxaTransmissao = taxaTransmissao;
	}
	
	double getTaxaMBps() {
		return (double) this.taxaTransmissao/1024;
	}
	
	String getProtocoloString() {
		switch (this.idProtocolo) {
		case 1:
			return "Rotoscope";
			
		case 2:
			return "Acustico";

		case 3:
			return "Radio";

		default:
			return "Outros";
			
		}
	}
	
	String getDescricao() {
		return "Conexao: tipoPorta=" + this.tipoPorta + ", protocolo=" + this.getProtocoloString() + ", taxaTransmissao=" + this.getTaxaMBps() + "MBps.";
	}
}
