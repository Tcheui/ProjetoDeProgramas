
public class Astromech {
	String modelo;
	Mestre mestre;
	Sensor sensor;
	Conexao conexao;
	
	Astromech(){
		this("R2-D2", new Mestre(), new Sensor(), new Conexao());
	}
	
	Astromech(String modelo, Mestre mestre, Sensor sensor, Conexao conexao){
		this.modelo = modelo;
		this.sensor = sensor;
		this.conexao = conexao;
		this.mestre = mestre;
	}
	
	String getDescricao() {
		return "Astromech modelo " + this.modelo
				+ ".  " + this.mestre.getDescricao() + this.sensor.getDescricao() + this.conexao.getDescricao();
	}
}
